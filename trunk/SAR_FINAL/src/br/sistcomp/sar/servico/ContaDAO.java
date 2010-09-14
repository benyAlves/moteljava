/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Conta;
import br.sistcomp.sar.dominio.Movimentacao;
import br.sistcomp.sar.utilidades.Utilitario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fillipe
 */
public class ContaDAO {

    private static ContaDAO contaDAO;

    public static ContaDAO getInstance() {
        synchronized (ContaDAO.class) {
            if (contaDAO == null) {
                contaDAO = new ContaDAO();
            }
        }
        return contaDAO;
    }

    public void cadastrar(Conta conta) {
        Conta contaOK = (Conta) conta;
        int codMovimentacao = MovimentacaoDAO.getInstance().cadastrar(conta);
        PreparedStatement ps;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO CONTAS (codMovimentacao, descricao) VALUES (?,?)");
            ps.setInt(1, codMovimentacao);
            ps.setString(2, contaOK.getDescricao());
            ps.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
        }
    }

    public Conta pesquisar(int codMovimentacao) {
        ResultSet rs;
        PreparedStatement ps;
        Conta conta = new Conta();
        Movimentacao movimentacao = MovimentacaoDAO.getInstance().pesquisar(codMovimentacao);

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM CONTAS WHERE codMovimentacao = '" + codMovimentacao + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                conta.setFuncionario(movimentacao.getFuncionario());
                conta.setValor(movimentacao.getValor());
                conta.setVencimento(movimentacao.getVencimento());
                conta.setHora(movimentacao.getHora());
                conta.setTipo(movimentacao.getTipo());
                conta.setDescricao(rs.getString("descricao"));
                if (rs.getDate("pagamento") != null){
                    conta.setPagamento(Utilitario.converteDateParaString(rs.getDate("pagamento")));
                }
                conta.setDesconto(rs.getDouble("desconto"));
                con.close();
                return conta;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conta;
    }

    public void alterar(Conta conta) {
        MovimentacaoDAO.getInstance().alterar(conta);
        PreparedStatement ps;
        try {
            Conta contaOK = (Conta) conta;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("UPDATE CONTAS SET pagamento = ?, desconto = ? WHERE codMovimentacao = '" + contaOK.getCodMovimentacao() + "' ");
            ps.setDate(1, (java.sql.Date) Utilitario.converteStringParaDate(contaOK.getPagamento()));
            ps.setDouble(2, contaOK.getDesconto());
            ps.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public List<Conta> todasContas() {

        ResultSet rs;
        PreparedStatement ps;
        List<Conta> contas = new ArrayList<Conta>();

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM CONTAS");
            rs = ps.executeQuery();
            while (rs.next()) {
                Movimentacao movimentacao = MovimentacaoDAO.getInstance().pesquisar(rs.getInt("codMovimentacao"));
                Conta conta = new Conta();
                conta.setFuncionario(movimentacao.getFuncionario());
                conta.setValor(movimentacao.getValor());
                conta.setVencimento(movimentacao.getVencimento());
                conta.setHora(movimentacao.getHora());
                conta.setTipo(movimentacao.getTipo());
                conta.setDescricao(rs.getString("descricao"));
                if (rs.getDate("pagamento") != null){
                    conta.setPagamento(Utilitario.converteDateParaString(rs.getDate("pagamento")));
                }
                conta.setDesconto(rs.getDouble("desconto"));
                contas.add(conta);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contas;
    }
    
}
