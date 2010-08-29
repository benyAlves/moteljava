/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jefferson Araújo
 */
public class RelatorioDAO {

    private static RelatorioDAO RelatorioDAO;

    public static RelatorioDAO getInstance() {
        synchronized (ProfessorDAO.class) {
            if (RelatorioDAO == null) {
                RelatorioDAO = new RelatorioDAO();
            }
        }
        return RelatorioDAO;


    }

    public void relatorioAlunos() {
        ResultSet rs, rs2;
        PreparedStatement ps, ps2;
        int matricula;
        //String nome, telefone, celular;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT idPessoa FROM alunos");
            rs = ps.executeQuery();
            while (rs.next()) {
                matricula = rs.getInt("idPessoa");
                if (matricula == 0) {
                    break;
                } else {
                    ps2 = (PreparedStatement) con.prepareStatement("SELECT idPessoa, nome, telefone, celular "
                            + "FROM pessoas where idPessoa = '" + matricula + "'");
                    rs2 = ps2.executeQuery();
                    java.net.URL url = getClass().getResource("/br/sistcomp/sar/impressao/relatorioAlunos.jasper");
                    //String nomeFileJasper = "relatorioAlunos.jasper";

                    JRResultSetDataSource jrRS = new JRResultSetDataSource(rs2);
                    java.util.Map parameters = new HashMap();
                    JasperReport report = JasperManager.loadReport(url.openStream());
                    JasperPrint rel = JasperFillManager.fillReport(report, parameters, jrRS);
                    JasperViewer jrv = new JasperViewer(rel, false);
                    jrv.resize(800, 600);
                    jrv.setLocationRelativeTo(null);
                    jrv.setVisible(true);
                    //return rel;
                }
            }
            con.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
        //  return null;
    }
}
