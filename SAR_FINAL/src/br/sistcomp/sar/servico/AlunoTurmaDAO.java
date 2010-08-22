/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Turma;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author thiago
 */
public class AlunoTurmaDAO {

    private static AlunoTurmaDAO alunoTurmaDAO;

    public static AlunoTurmaDAO getInstance(){
        synchronized(AlunoDAO.class){
            if(alunoTurmaDAO == null){
                alunoTurmaDAO = new AlunoTurmaDAO();
            }
        }
        return alunoTurmaDAO;
    }

    public void insereAlunoNaTurma(int mat, int codTurma){
        try{
            int matricula = (int) mat;
            int codigoTurma = (int) codTurma;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement
                    ("INSERT INTO ALUNO_TURMA(matricula,codTurma) VALUES(?,?)");
            ps.setInt(1, matricula);
            ps.setInt(2, codigoTurma);
            ps.execute();
            con.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public void editaAlunoNaTurma(int mat, int codigo){
        try{
            int matricula = (int) mat;
            int codigoTurma = (int) codigo;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement
                    ("UPDATE SET ALUNO_TURMA codTurma=? WHERE  matricula = '"+matricula+"'");
            ps.setInt(1, codigo);
            ps.execute();
            con.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public void removeAlunoDaTurma(int matricula, int codTurma){
        try{
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement
                    ("DELETE FROM ALUNO_TURMA WHERE matricula ='"+matricula+"'"
                    + " and codTurma = '"+codTurma+"'");
            ps.execute();
            TurmaDAO turmaDAO = TurmaDAO.getInstance();
            turmaDAO.pesquisar(codTurma);
            con.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public List<Integer> turmasDoAluno(int matricula){
        ResultSet rs;
        PreparedStatement ps;
        List<Integer> turmas = new ArrayList<Integer>();
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM ALUNO_TURMA WHERE matricula='"+matricula+"' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                turmas.add(rs.getInt("codTurma"));
            }
            con.close();
            return turmas;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return turmas;
    }

    public void removerTurmas(int matricula){
        try{
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement
                    ("DELETE FROM ALUNO_TURMA WHERE matricula ='"+matricula+"'");
            ps.execute();
            con.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public int alunosNaTurma(int codTurma) {
        ResultSet rs;
        PreparedStatement ps;
        int qtde = 0;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT count(codTurma) FROM ALUNO_TURMA WHERE codTurma ='"+codTurma+"' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                qtde = rs.getInt("count(codTurma)");
            }
            con.close();
            return qtde;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return qtde;
    }

}
