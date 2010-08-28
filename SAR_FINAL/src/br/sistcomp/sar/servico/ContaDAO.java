/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Conta;
import br.sistcomp.sar.dominio.Movimentacao;
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
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM MENSALIDADES WHERE codMovimentacao = '" + codMovimentacao + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                conta.setFuncionario(movimentacao.getFuncionario());
                conta.setDesconto(movimentacao.getDesconto());
                conta.setValor(movimentacao.getValor());
                conta.setVencimento(movimentacao.getVencimento());
                conta.setPagamento(movimentacao.getPagamento());
                conta.setHoraPgto(movimentacao.getHoraPgto());
                conta.setTipo(movimentacao.getTipo());
                conta.setDescricao(rs.getString("descricao"));
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
                conta.setDesconto(movimentacao.getDesconto());
                conta.setValor(movimentacao.getValor());
                conta.setVencimento(movimentacao.getVencimento());
                conta.setPagamento(movimentacao.getPagamento());
                conta.setHoraPgto(movimentacao.getHoraPgto());
                conta.setTipo(movimentacao.getTipo());
                conta.setDescricao(rs.getString("descricao"));
                contas.add(conta);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contas;
    }

    

}
