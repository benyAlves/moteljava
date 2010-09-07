/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import com.mysql.jdbc.PreparedStatement;
import java.net.URL;
import java.sql.ResultSet;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Jefferson Araújo
 */
public class RelatorioDAO {

    private static RelatorioDAO relatorioDAO;

    public static RelatorioDAO getInstance() {
        synchronized (RelatorioDAO.class) {
            if (relatorioDAO == null) {
                relatorioDAO = new RelatorioDAO();
            }
        }
        return relatorioDAO;
    }

    public JasperPrint relatorioAniversariantes(int mes) throws Exception {
        java.sql.Connection con = ConexaoDB.getInstance().getCon();
        String nomeRelatorio = "br/sistcomp/sar/impressao/relatorioAniversariantes.jasper";
        URL urlFile = getClass().getClassLoader().getResource(nomeRelatorio);
        String query = "SELECT a.matricula,p.nome,p.nascimento,p.celular,(year(curdate()) - year(nascimento)) as anos FROM pessoas p inner join alunos a on p.idPessoa = a.idPessoa WHERE month(p.nascimento) = " + mes;
        PreparedStatement stmt = (PreparedStatement) con.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
        java.util.Map parameters = new HashMap();
        JasperPrint rel = JasperFillManager.fillReport(urlFile.openStream(), parameters, jrRS);
        rs.close();
        stmt.close();
        return rel;
    }

    public JasperPrint relatorioTodosAlunos(String tipo) throws Exception {
        java.sql.Connection con = ConexaoDB.getInstance().getCon();
        String query = null;
        String nomeRelatorio = "br/sistcomp/sar/impressao/relatorioTodosAlunos.jasper";
        URL urlFile = getClass().getClassLoader().getResource(nomeRelatorio);
        if (tipo.toUpperCase().equals("Todos".toUpperCase())) {
            query = "SELECT a.matricula, p.nome, p.telefone, p.celular FROM alunos a, pessoas p WHERE p.idPessoa = a.idPessoa";
        }
        if (tipo.toUpperCase().equals("Masculino".toUpperCase())) {
            tipo = (new StringBuilder()).append("'%").append(tipo).append("'").toString();
            query = (new StringBuilder()).append("SELECT a.matricula,p.nome,p.celular,p.telefone FROM pessoas "
                    + "p inner join alunos a on p.idPessoa = a.idPessoa WHERE lower(p.sexo) like").append(tipo).toString();
        }
        if (tipo.toUpperCase().equals("Feminino".toUpperCase())) {
            tipo = (new StringBuilder()).append("'%").append(tipo).append("'").toString();
            query = (new StringBuilder()).append("SELECT a.matricula,p.nome,p.celular,p.telefone FROM pessoas "
                    + "p inner join alunos a on p.idPessoa = a.idPessoa WHERE lower(p.sexo) like ").append(tipo).toString();
        }
        PreparedStatement stmt = (PreparedStatement) con.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
        java.util.Map parameters = new HashMap();
        JasperPrint rel = JasperFillManager.fillReport(urlFile.openStream(), parameters, jrRS);
        rs.close();
        stmt.close();
        return rel;
    }

    public JasperPrint relatorioModalidade(String modalidade) throws Exception {
        java.sql.Connection con = ConexaoDB.getInstance().getCon();
        String nomeRelatorio = "br/sistcomp/sar/impressao/relatorioModalidade.jasper";
        URL urlFile = getClass().getClassLoader().getResource(nomeRelatorio);
        modalidade = (new StringBuilder()).append("= '").append(modalidade).append("'").toString();
        String query = (new StringBuilder()).append("SELECT p.nome,a.matricula,m.nome "
                + "AS modalidade FROM pessoas p INNER JOIN alunos a ON p.idPessoa = a.idPessoa"
                + " INNER JOIN adesoes ad ON a.matricula = ad.matricula INNER JOIN planos pl on "
                + "ad.codPlano = pl.`codPlano` INNER JOIN modalidades m ON pl.codModalidade = "
                + "m.codModalidade WHERE m.nome ").append(modalidade).append(" ").append(" ORDER BY p.nome").toString();
        PreparedStatement stmt = (PreparedStatement) con.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
        java.util.Map parameters = new HashMap();
        JasperPrint rel = JasperFillManager.fillReport(urlFile.openStream(), parameters, jrRS);
        rs.close();
        stmt.close();
        return rel;
    }

    public JasperPrint relatorioBolsista(String tipo) throws Exception {
        java.sql.Connection con = ConexaoDB.getInstance().getCon();
        String query = null;
        String nomeRelatorio = "br/sistcomp/sar/impressao/relatorioBolsista.jasper";
        URL urlFile = getClass().getClassLoader().getResource(nomeRelatorio);
        if (tipo.toUpperCase().equals("Todos".toUpperCase())) {
            query = (new StringBuilder()).append("SELECT a.matricula,p.nome,a.bolsista FROM pessoas p INNER JOIN alunos a ON p.idPessoa = a.idPessoa WHERE a.bolsista = 'Integral' OR a.bolsista = 'Parcial'").toString();
        }
        if (tipo.toUpperCase().equals("Parcial".toUpperCase())) {
            tipo = (new StringBuilder()).append("= '").append(tipo).append("'").toString();
            query = (new StringBuilder()).append("SELECT a.matricula,p.nome,a.bolsista FROM pessoas p INNER JOIN alunos a ON p.idPessoa = a.idPessoa WHERE a.bolsista ").append(tipo).toString();
        }
        if (tipo.toUpperCase().equals("Integral".toUpperCase())) {
            tipo = (new StringBuilder()).append("= '").append(tipo).append("'").toString();
            query = (new StringBuilder()).append("SELECT a.matricula,p.nome,a.bolsista FROM pessoas p INNER JOIN alunos a ON p.idPessoa = a.idPessoa WHERE a.bolsista ").append(tipo).toString();
        }
        tipo = (new StringBuilder()).append("= '").append(tipo).append("'").toString();
        PreparedStatement stmt = (PreparedStatement) con.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
        java.util.Map parameters = new HashMap();
        JasperPrint rel = JasperFillManager.fillReport(urlFile.openStream(), parameters, jrRS);
        rs.close();
        stmt.close();
        return rel;
    }

    public JasperPrint relatorioPlanosVencidos() throws Exception {
        java.sql.Connection con = ConexaoDB.getInstance().getCon();
        String nomeRelatorio = "br/sistcomp/sar/impressao/relatorioPlanosVencidos.jasper";
        URL urlFile = getClass().getClassLoader().getResource(nomeRelatorio);
        String query = "";
        PreparedStatement stmt = (PreparedStatement) con.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
        java.util.Map parameters = new HashMap();
        JasperPrint rel = JasperFillManager.fillReport(urlFile.openStream(), parameters, jrRS);
        rs.close();
        stmt.close();
        return rel;
    }

    public JasperPrint relatorioHorario(String horaInicio) throws Exception {
        java.sql.Connection con = ConexaoDB.getInstance().getCon();
        String nomeRelatorio = "br/sistcomp/sar/impressao/relatorioHorario.jasper";
        URL urlFile = getClass().getClassLoader().getResource(nomeRelatorio);
        horaInicio = (new StringBuilder()).append("= '").append(horaInicio).append("'))").toString();
        String query = (new StringBuilder()).append("SELECT a.matricula, p.nome, t.horaInicio, t.horaFinal FROM alunos a, pessoas p, turmas t WHERE a.idPessoa = p.idPessoa AND a.matricula IN (SELECT matricula FROM ADESOES WHERE status=true AND codTurma IN (SELECT codTurma FROM TURMAS where horaInicio ").append(horaInicio).toString();
        PreparedStatement stmt = (PreparedStatement) con.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
        java.util.Map parameters = new HashMap();
        JasperPrint rel = JasperFillManager.fillReport(urlFile.openStream(), parameters, jrRS);
        rs.close();
        stmt.close();
        return rel;
    }

    public JasperPrint relatorioIdade(String idadeInicial, String idadeFinal) throws Exception {
        java.sql.Connection con = ConexaoDB.getInstance().getCon();
        String nomeRelatorio = "br/sistcomp/sar/impressao/relatorioFaixaEtaria.jasper";
        URL urlFile = getClass().getClassLoader().getResource(nomeRelatorio);
        String query = "SELECT p.nome,a.matricula,curdate()as data_atual,p.nascimento,(year(curdate()) - year(p.nascimento)) idade FROM pessoas p INNER JOIN alunos a ON p.idPessoa = a.idPessoa WHERE (year(curdate()) - year(p.nascimento)) >=" + idadeInicial + " AND (year(curdate()) - year(p.nascimento)) <= " + idadeFinal;
        PreparedStatement stmt = (PreparedStatement) con.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
        java.util.Map parameters = new HashMap();
        JasperPrint rel = JasperFillManager.fillReport(urlFile.openStream(), parameters, jrRS);
        rs.close();
        stmt.close();
        return rel;
    }
}
