package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Movimentacao;
import br.sistcomp.sar.dominio.Transferencia;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fillipe
 */
public class TransferenciaDAO {

    private static TransferenciaDAO transferenciaDAO;

    public static TransferenciaDAO getInstance() {
        synchronized (TransferenciaDAO.class) {
            if (transferenciaDAO == null) {
                transferenciaDAO = new TransferenciaDAO();
            }
        }
        return transferenciaDAO;
    }

    public void cadastrar(Transferencia transferencia) {
        Transferencia transferenciaOK = (Transferencia) transferencia;
        int codMovimentacao = MovimentacaoDAO.getInstance().cadastrar(transferenciaOK);
        PreparedStatement ps;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO TRANSFERENCIAS (codMovimentacao, forma, historico) VALUES (?,?,?)");
            ps.setInt(1, codMovimentacao);
            ps.setString(2, transferenciaOK.getForma());
            ps.setString(3, transferenciaOK.getHistorico());
            ps.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
        }
    }

    public Transferencia pesquisar(int codMovimentacao) {
        ResultSet rs;
        PreparedStatement ps;
        Transferencia transferencia = new Transferencia();
        Movimentacao movimentacao = MovimentacaoDAO.getInstance().pesquisar(codMovimentacao);

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM TRANSFERENCIAS WHERE codMovimentacao = '" + codMovimentacao + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                transferencia.setFuncionario(movimentacao.getFuncionario());
                transferencia.setValor(movimentacao.getValor());
                transferencia.setVencimento(movimentacao.getVencimento());
                transferencia.setHora(movimentacao.getHora());
                transferencia.setTipo(movimentacao.getTipo());
                transferencia.setForma(rs.getString("forma"));
                transferencia.setHistorico(rs.getString("historico"));
                con.close();
                return transferencia;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return transferencia;
    }

    public List<Transferencia> todasTransferencias() {
        ResultSet rs;
        PreparedStatement ps;
        List<Transferencia> transferencias = new ArrayList<Transferencia>();

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM TRANSFERENCIAS");
            rs = ps.executeQuery();
            while (rs.next()) {
                Movimentacao movimentacao = MovimentacaoDAO.getInstance().pesquisar(rs.getInt("codMovimentacao"));
                Transferencia transferencia = new Transferencia();
                transferencia.setFuncionario(movimentacao.getFuncionario());
                transferencia.setValor(movimentacao.getValor());
                transferencia.setVencimento(movimentacao.getVencimento());
                transferencia.setHora(movimentacao.getHora());
                transferencia.setTipo(movimentacao.getTipo());
                transferencia.setForma(rs.getString("forma"));
                transferencia.setHistorico(rs.getString("historico"));
                transferencias.add(transferencia);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transferencias;
    }
}
