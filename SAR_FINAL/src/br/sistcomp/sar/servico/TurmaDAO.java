package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Professor;
import br.sistcomp.sar.dominio.Turma;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.JOptionPane;

//CRUD de Turma OK!
public class TurmaDAO {

    private static TurmaDAO turmaDAO;

    public static TurmaDAO getInstance() {
        synchronized (TurmaDAO.class) {
            if (turmaDAO == null) {
                turmaDAO = new TurmaDAO();
            }
        }
        return turmaDAO;
    }

    public void cadastrar(Turma turma) {
        PreparedStatement ps;

        try {
            Turma turmaOK = (Turma) turma;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO turmas(matricula, horaInicio, horaFinal) VALUES (?,?,?)");
            ps.setInt(1, turmaOK.getProfessor().getIdPessoa());
            ps.setString(2, turmaOK.getHoraInicio());
            ps.setString(3, turmaOK.getHoraFinal());
            System.out.println(turmaOK.getProfessor().getIdPessoa());
            System.out.println(turmaOK.getHoraInicio());
            ps.execute();
            cadastrarDias(turmaOK.getDias());
            con.close();
            JOptionPane.showMessageDialog(null, "Turma Cadastrada com Sucesso!");
        } catch (Exception e) {
            e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Turma!");
        }
    }

    public void cadastrarDias(Map<String, Boolean> dias) {
        PreparedStatement ps;
        ResultSet rs;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT max(codTurma) FROM turmas ");
            rs = ps.executeQuery();
            int codTurma = 0;
            while (rs.next()) {
                codTurma = rs.getInt("max(codTurma)");
            }
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO dias(codTurma, segunda, terca, quarta, quinta, sexta, sabado, domingo) VALUES (?,?,?,?,?,?,?,?)");
            ps.setInt(1, codTurma);
            ps.setBoolean(2, dias.get("Segunda"));
            ps.setBoolean(3, dias.get("Terca"));
            ps.setBoolean(4, dias.get("Quarta"));
            ps.setBoolean(5, dias.get("Quinta"));
            ps.setBoolean(6, dias.get("Sexta"));
            ps.setBoolean(7, dias.get("Sabado"));
            ps.setBoolean(8, dias.get("Domingo"));
            ps.execute();
            con.close();
            //return true;
        } catch (Exception e) {
            e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
            //return false;
        }
    }

    public Turma pesquisar(int codigo) {
        ResultSet rs;
        PreparedStatement ps;
        Turma turma = null;
        Professor professor = null;
        ProfessorDAO professorDAO = ProfessorDAO.getInstance();
        String horaInicio, horaFinal;

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM turmas WHERE codTurma = '" + codigo + "' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                codigo = rs.getInt("codTurma");
                professor = professorDAO.pesquisar(rs.getInt("matricula"));
                horaInicio = rs.getString("horaInicio");
                horaFinal = rs.getString("horaFinal");
                con.close();
                turma = new Turma(codigo, professor, horaInicio, horaFinal, pesquisarDias(codigo));
                return turma;
            }
        } catch (Exception e) {
            e.printStackTrace();
            turma.setCodigo(-1);
            return turma;
        }
        return turma;
    }

    public Map<String, Boolean> pesquisarDias(int codTurma) {
        ResultSet rs;
        PreparedStatement ps;
        Map<String, Boolean> dias = new Hashtable<String, Boolean>();

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM dias WHERE codTurma = '" + codTurma + "' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                dias.put("Segunda", rs.getBoolean("segunda"));
                dias.put("Terca", rs.getBoolean("terca"));
                dias.put("Quarta", rs.getBoolean("quarta"));
                dias.put("Quinta", rs.getBoolean("quinta"));
                dias.put("Sexta", rs.getBoolean("sexta"));
                dias.put("Sabado", rs.getBoolean("sabado"));
                dias.put("Domingo", rs.getBoolean("domingo"));
                con.close();
                return dias;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return dias;
        }
        return dias;
    }

    public void alterar(Turma turma) {
        PreparedStatement ps;
        try {
            Turma turmaOK = (Turma) turma;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("UPDATE turmas SET matricula = ?, horaInicio = ?, horaFinal = ?, dias = ? WHERE codTurma = '" + turmaOK.getCodigo() + "' ");
            ps.setInt(1, turmaOK.getProfessor().getIdPessoa());
            ps.setString(2, turmaOK.getHoraInicio());
            ps.setString(3, turmaOK.getHoraFinal());
            alterarDias(turmaOK.getCodigo(), turmaOK.getDias());
            con.close();


            JOptionPane.showMessageDialog(null, "Turma Alterada com Sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao Alterar Turma");
        }
    }

    public void alterarDias(int codTurma, Map<String, Boolean> dias) {
        PreparedStatement ps;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("UPDATE dias SET segunda = ?, terca = ?, quarta = ?, quinta = ?, sexta = ?, sabado = ?, domingo = ? WHERE codTurma = '" + codTurma + "'");
            ps.setBoolean(1, dias.get("Segunda"));
            ps.setBoolean(2, dias.get("Terca"));
            ps.setBoolean(3, dias.get("Quarta"));
            ps.setBoolean(4, dias.get("Quinta"));
            ps.setBoolean(5, dias.get("Sexta"));
            ps.setBoolean(6, dias.get("Sabado"));
            ps.setBoolean(7, dias.get("Domingo"));
            ps.execute();
            con.close();
            JOptionPane.showMessageDialog(null, "Dias alterados");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao alterar dias");
        }
    }

    public String remover(Turma turma) {
        try {
            Turma turmaOK = (Turma) turma;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            removerDias(turmaOK.getCodigo());
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("DELETE FROM turmas WHERE codTurma ='" + turmaOK.getCodigo() + "' ");
            ps.execute();
            con.close();
            return "Turma Removida com Sucesso";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao Remover Plano";
        }
    }

    public void removerDias(int codTurma) {
        PreparedStatement ps;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM dias WHERE codTurma ='" + codTurma + "' ");
            ps.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int proximoCodigo() {
        int codigo = -1;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("SHOW TABLE STATUS LIKE 'TURMAS'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                codigo = rs.getInt("Auto_increment");
            }
            con.close();
            return codigo;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return codigo;
    }

    public Vector<Turma> getTurmas() {
        ResultSet rs;
        PreparedStatement ps;
        Vector<Turma> turmas = new Vector<Turma>();
        Map<String, Boolean> dias = new HashMap<String, Boolean>();
        List<Integer> turmasComVaga = turmasComVaga();
        Turma turma = null;
        Professor professor = null;
        int codigo;
        String horaInicio, horaFinal, p;

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            for (int i : turmasComVaga) {
                ps = (PreparedStatement) con.prepareStatement("SELECT * FROM TURMAS WHERE codTurma ='"+i+"' ");
                rs = ps.executeQuery();
                while (rs.next()) {
                    codigo = rs.getInt("codTurma");
                    professor = ProfessorDAO.getInstance().pesquisar(rs.getInt("matricula"));
                    horaInicio = rs.getString("horaInicio");
                    horaFinal = rs.getString("horaFinal");
                    dias = pesquisarDias(codigo);
                    turma = new Turma(codigo, professor, horaInicio, horaFinal, dias);
                    turmas.add(turma);
                }
            }
            con.close();
            return turmas;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return turmas; //tratar exceção
    }

    public List<Turma> turmaPorProfessor(String nome) {
        ResultSet rs;
        PreparedStatement ps;
        List<Turma> turmas = new ArrayList<Turma>();
        Turma turma = null;
        int codigo;
        String horaInicio, horaFinal;
        Professor professor = null;
        Map<String, Boolean> dias = new HashMap<String, Boolean>();

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();

            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM TURMAS WHERE matricula = '"
                    + ProfessorDAO.getInstance().pesquisar(nome).getIdPessoa() + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                codigo = rs.getInt("codTurma");
                professor = ProfessorDAO.getInstance().pesquisar(nome);
                horaInicio = rs.getString("horaInicio");
                horaFinal = rs.getString("horaFinal");
                dias = pesquisarDias(codigo);
                turma = new Turma(codigo, professor, horaInicio, horaFinal, dias);
                turmas.add(turma);
            }
            con.close();
            return turmas;

        } catch (Exception e) {
            e.printStackTrace();

        }
        return turmas; //tratar exceção
    }

    public Turma turmaAtravesDaMatriculaDoProfessor(int matricula) {
        ResultSet rs;
        PreparedStatement ps;
        Turma turma = null;
        int codigo;
        String horaInicio, horaFinal;
        Professor professor = null;
        Map<String, Boolean> dias = new HashMap<String, Boolean>();

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();

            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM TURMAS WHERE matricula = '" + matricula + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                codigo = rs.getInt("codTurma");
                professor = ProfessorDAO.getInstance().pesquisar(matricula);
                horaInicio = rs.getString("horaInicio");
                horaFinal = rs.getString("horaFinal");
                dias = pesquisarDias(codigo);
                turma = new Turma(codigo, professor, horaInicio, horaFinal, dias);

            }
            con.close();
            return turma;

        } catch (Exception e) {
            e.printStackTrace();

        }
        return turma; //tratar exceção
    }

    public boolean pesquisaProfessorEmTurma(int matricula) {
        ResultSet rs;
        PreparedStatement ps;
        Turma turma = null;
        int codigo;
        String horaInicio, horaFinal;
        Professor professor = null;
        Map<String, Boolean> dias = new HashMap<String, Boolean>();

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();

            ps = (PreparedStatement) con.prepareStatement("SELECT matricula FROM TURMAS WHERE matricula = '" + matricula + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                codigo = rs.getInt("matricula");
                if (codigo != 0) {
                    return true;
                }
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return false;
    }

    public List<Integer> turmasComVaga() {
        ResultSet rs;
        PreparedStatement ps;
        ModalidadeDAO modalidade = ModalidadeDAO.getInstance();
        AlunoTurmaDAO alunoturma = AlunoTurmaDAO.getInstance();
        ProfessorDAO professor = ProfessorDAO.getInstance();
        List<Integer> turmas = new ArrayList<Integer>();
        int codTurma = 0, matricula = 0, codModalidade = 0;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT codTurma, matricula FROM TURMAS");
            rs = ps.executeQuery();
            while (rs.next()) {
                codTurma = rs.getInt("codTurma");
                matricula = rs.getInt("matricula");
                codModalidade = professor.pesquisarCodModalidade(matricula);
                if (modalidade.alunosPorTurma(codModalidade) > alunoturma.alunosNaTurma(codTurma)) {
                    turmas.add(codTurma);
                }
            }
            con.close();
            return turmas;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return turmas;
    }
}
