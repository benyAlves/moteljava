
package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Caixa;
import br.sistcomp.sar.dominio.Utilitario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fillipe
 */
public class CaixaDAO {

    private static CaixaDAO caixaDAO;

    public static CaixaDAO getInstance() {
        synchronized (CaixaDAO.class) {
            if (caixaDAO == null) {
                caixaDAO = new CaixaDAO();
            }
        }
        return caixaDAO;
    }

    public void abrirCaixa(Caixa caixa) {
        Caixa caixaOK = (Caixa) caixa;
        PreparedStatement ps;
        int codCaixa = -1;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO CAIXAS (status, dia, saldo) VALUES (?,?,?)");
            ps.setBoolean(1, caixaOK.getStatus());
            ps.setString(2, Utilitario.dataParaBanco(caixaOK.getDia()));
            ps.setDouble(3, caixaOK.getSaldo());
            ps.execute();
            ps = (PreparedStatement) con.prepareStatement("SELECT MAX(codCaixa) FROM CAIXAS");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                codCaixa = rs.getInt("MAX(codCaixa)");
            }
            caixaOK.setCodCaixa(codCaixa);
            AbreDAO.getInstance().abrir(caixaOK);
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
        }
    }

    public void fecharCaixa(Caixa caixa) {
        PreparedStatement ps;
        try {
            Caixa caixaOK = (Caixa) caixa;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("UPDATE CAIXAS SET status = ? saldo = ? WHERE codCaixa = '" + caixaOK.getCodCaixa() + "' ");
            ps.setBoolean(1, false);
            ps.setDouble(2, caixaOK.getSaldo());
            ps.execute();
            con.close();
            FechaDAO.getInstance().fechar(caixa);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   public void alterarSaldo(Caixa caixa, Double valor) {
        PreparedStatement ps;
        try {
            Caixa caixaOK = (Caixa) caixa;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("UPDATE CAIXAS SET saldo = ? WHERE codCaixa = '" + caixaOK.getCodCaixa() + "' ");
            ps.setDouble(1, caixaOK.getSaldo()+valor);
            ps.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Caixa> todosCaixas() {
        ResultSet rs;
        PreparedStatement ps;
        List<Caixa> caixas = new ArrayList<Caixa>();
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM CAIXAS");
            rs = ps.executeQuery();
            while (rs.next()) {
                Caixa caixa = new Caixa();
                caixa.setCodCaixa(rs.getInt("codCaixa"));
                caixa.setStatus(rs.getBoolean("status"));
                caixa.setDia(Utilitario.converteDateParaString(rs.getDate("dia")));
                caixa.setSaldo(rs.getDouble("saldo"));
                caixa.setAbriu(AbreDAO.getInstance().pesquisar(rs.getInt("codCaixa")));
                caixa.setFechou(FechaDAO.getInstance().pesquisar(rs.getInt("codCaixa")));
                caixas.add(caixa);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return caixas;
    }

    public Double saldoAnterior(Caixa caixa) {
        PreparedStatement ps;
        ResultSet rs;
        Double saldoAnterior = 0.0;
        try {
            Caixa caixaOK = (Caixa) caixa;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT saldo FROM CAIXAS WHERE codCaixa<"+caixaOK.getCodCaixa()+" ORDER BY codCaixa DESC LIMIT 1 ");
            rs = ps.executeQuery();
            while(rs.next()){
                saldoAnterior = rs.getDouble("saldo");
            }
            con.close();
            return saldoAnterior;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return saldoAnterior;
     }

     public Double saldoTotal() {
        PreparedStatement ps;
        Double saldo = 0.0;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT SUM(saldo) FROM CAIXAS");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                saldo = rs.getDouble("SUM(saldo)");
            }
            con.close();
            return saldo;
        } catch (Exception e) {
            e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
        }
        return saldo;
    }

}
