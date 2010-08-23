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

    public void insereAlunoNaTurma(int matricula, int codTurma, int codAdesao){
        try{
            int m = (int) matricula;
            int t = (int) codTurma;
            int a = (int) codAdesao;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement
                    ("INSERT INTO ALUNO_TURMA(matricula,codTurma,codAdesao) VALUES(?,?,?)");
            ps.setInt(1, m);
            ps.setInt(2, t);
            ps.setInt(3, a);
            ps.execute();
            con.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public void editaAlunoNaTurma(int codAdesao, int codTurma){
        try{
            int a = (int) codAdesao;
            int t = (int) codTurma;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement
                    ("UPDATE ALUNO_TURMA SET codTurma=? WHERE  codAdesao = '"+a+"'");
            ps.setInt(1, t);
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

    public void removeAlunoDaTurma(int codAdesao){
        try{
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement
                    ("DELETE FROM ALUNO_TURMA WHERE codAdesao ='"+codAdesao+"'");
            ps.execute();
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
        List<Integer> adesoesAtivas = AdesaoDAO.getInstance().adesoesAtivas();
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            for (int codAdesao : adesoesAtivas){
                ps = (PreparedStatement) con.prepareStatement("SELECT count(codTurma) FROM ALUNO_TURMA WHERE codTurma ='"+codTurma+"' AND codAdesao='"+codAdesao+"' ");
                rs = ps.executeQuery();
                while (rs.next()) {
                    qtde = rs.getInt("count(codTurma)");
                }
            }
            con.close();
            return qtde;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return qtde;
    }

    public int turmaAderida(int codAdesao) {
        ResultSet rs;
        PreparedStatement ps;
        int codTurma = -1;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT codTurma FROM ALUNO_TURMA WHERE codAdesao ='"+codAdesao+"' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                codTurma = rs.getInt("codTurma");
                con.close();
                return codTurma;
            }
            con.close();
            return codTurma;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return codTurma;
    }

}
