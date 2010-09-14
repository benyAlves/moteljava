
package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Caixa;
import br.sistcomp.sar.utilidades.Utilitario;
import br.sistcomp.sar.fachada.Fachada;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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

    public void abrirCaixa() {
        PreparedStatement ps;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO CAIXAS (matricula, status, diaAbriu, horaAbriu, saldo) VALUES (?,?,?,?,?)");
            ps.setInt(1, Fachada.funcionarioLogado().getIdPessoa());
            ps.setBoolean(2, true);
            ps.setString(3, Utilitario.dataParaBanco(Utilitario.dataDoSistema()));
            ps.setString(4, Utilitario.getHora());
            ps.setDouble(5, 0.00);
            ps.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
        }
    }

    public void fecharCaixa() {
        PreparedStatement ps;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("UPDATE CAIXAS SET status = ?, diaFechou = ?, horaFechou = ? WHERE status = true ");
            ps.setBoolean(1, false);
            ps.setString(2, Utilitario.dataParaBanco(Utilitario.dataDoSistema()));
            ps.setString(3, Utilitario.getHora());
            ps.execute();
            con.close();
            JOptionPane.showMessageDialog(null, "Caixa Fechado com Sucesso !!!");
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
                caixa.setFuncionario(FuncionarioDAO.getInstance().pesquisaFuncionario(rs.getInt("matricula")));
                caixa.setStatus(rs.getBoolean("status"));
                caixa.setDiaAbriu(Utilitario.converteDateParaString(rs.getDate("diaAbriu")));
                caixa.setDiaFechou(Utilitario.converteDateParaString(rs.getDate("diaFechou")));
                caixa.setHoraAbriu(rs.getString("horaAbriu"));
                caixa.setHoraFechou(rs.getString("horaFechou"));
                caixa.setSaldo(rs.getDouble("saldo"));
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
    public boolean pesquisarStatusDoCaixa() {
        PreparedStatement ps;
        ResultSet rs;
        boolean status = false;
       try {
           Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT status FROM CAIXAS WHERE max(codCaixa)");
            rs = ps.executeQuery();
            while(rs.next()){
                status = rs.getBoolean("status");
            }
            con.close();
            return status;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
     }

    public boolean verificaStatus() {
        PreparedStatement ps;
        ResultSet rs;
        boolean status = false;
       try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT status FROM CAIXAS WHERE status = true");
            rs = ps.executeQuery();
            while(rs.next()){
                status = rs.getBoolean("status");
            }
            con.close();
            return status;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
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
