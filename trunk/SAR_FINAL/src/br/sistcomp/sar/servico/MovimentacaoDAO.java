package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Movimentacao;
import br.sistcomp.sar.dominio.Utilitario;
import br.sistcomp.sar.fachada.Fachada;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO MOVIMENTACOES (matricula, valor, vencimento, hora, tipo) VALUES (?,?,?,?,?)");
            ps.setInt(1, Fachada.funcionarioLogado().getIdPessoa());
            ps.setDouble(2, movimentacaoOK.getValor());
            ps.setString(3, Utilitario.dataParaBanco(movimentacaoOK.getVencimento()));
            ps.setString(4, movimentacaoOK.getHora());
            ps.setString(5, movimentacaoOK.getTipo());
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
                movimentacao.setValor(rs.getDouble("valor"));
                movimentacao.setVencimento(Utilitario.converteDateParaString(rs.getDate("vencimento")));
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
            ps = (PreparedStatement) con.prepareStatement("UPDATE MOVIMENTACOES SET matricula = ?, hora = ? WHERE codMovimentacao = '" + movimentacaoOK.getCodMovimentacao() + "' ");
            ps.setInt(1, movimentacaoOK.getFuncionario().getIdPessoa());
            ps.setString(2, Utilitario.getHora());
            ps.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remover(int codMovimentacao) {
        PreparedStatement ps;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM MOVIMENTACOES WHERE codMovimentacao ='" + codMovimentacao + "' ");
            ps.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Boolean mensalidadesLiberadas(List<Integer> mensalidades) {
        ResultSet rs;
        PreparedStatement ps;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            for (int mensalidade : mensalidades) {
                ps = (PreparedStatement) con.prepareStatement("SELECT codMovimentacao FROM MOVIMENTACOES WHERE vencimento<'" + Utilitario.dataParaBanco(Utilitario.dataDoSistema()) + "' AND codMovimentacao='" + mensalidade + "' ");
                rs = ps.executeQuery();
                while (rs.next()) {
                    con.close();
                    return false;
                }
            }
            con.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
