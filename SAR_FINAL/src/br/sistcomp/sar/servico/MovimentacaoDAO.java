/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Movimentacao;
import br.sistcomp.sar.dominio.Utilitario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Fillipe
 */
public class MovimentacaoDAO {

    private static MovimentacaoDAO movimentacaoDAO;

    public static MovimentacaoDAO getInstance() {
        synchronized (MovimentacaoDAO.class) {
            if (movimentacaoDAO == null) {
                movimentacaoDAO = new MovimentacaoDAO();
            }
        }
        return movimentacaoDAO;
    }

    public int cadastrar(Movimentacao movimentacao) {
        PreparedStatement ps;

        try {
            Movimentacao movimentacaoOK = (Movimentacao) movimentacao; //Validando Objeto
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO MOVIMENTACOES (valor, vencimento, tipo) VALUES (?,?,?)");
            ps.setDouble(1, movimentacaoOK.getValor());
            ps.setString(2, Utilitario.dataParaBanco(movimentacaoOK.getVencimento()));
            ps.setString(3, movimentacaoOK.getTipo());
            ps.execute();
            ps = (PreparedStatement) con.prepareStatement("SELECT MAX(codMovimentacao) FROM MOVIMENTACOES");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int codMovimentacao = rs.getInt("MAX(codMovimentacao)");
                con.close();
                return codMovimentacao;
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
        }
        return -1;
    }

    public Movimentacao pesquisar(int codMovimentacao) {
        ResultSet rs;
        PreparedStatement ps;
        Movimentacao movimentacao = new Movimentacao();

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM MOVIMENTACOES WHERE codMovimentacao = '" + codMovimentacao + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                movimentacao.setCodMovimentacao(codMovimentacao);
                movimentacao.setFuncionario(FuncionarioDAO.getInstance().pesquisaFuncionario(rs.getInt("matricula")));
                movimentacao.setDesconto(rs.getDouble("desconto"));
                movimentacao.setValor(rs.getDouble("valor"));
                movimentacao.setVencimento(Utilitario.converteDateParaString(rs.getDate("vencimento")));
                movimentacao.setPagamento(Utilitario.converteDateParaString(rs.getDate("pagamento")));
                //movimentacao.setHoraPgto(null);
                movimentacao.setTipo(rs.getString("tipo"));
                con.close();
                return movimentacao;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movimentacao;
    }

    public void alterar(Movimentacao movimentacao) {
        PreparedStatement ps;
        try {
            Movimentacao movimentacaoOK = (Movimentacao) movimentacao;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("UPDATE MENSALIDADES set matricula = ?, desconto = ?, pagamento = ?, horaPgto = ? WHERE codMensalidade = '" + movimentacaoOK.getCodMovimentacao() + "' ");
            ps.setInt(1, movimentacaoOK.getFuncionario().getIdPessoa());
            ps.setDouble(2, movimentacaoOK.getDesconto());
            ps.setString(3, movimentacaoOK.getPagamento());
            ps.setString(4, Utilitario.getHora());
            ps.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
