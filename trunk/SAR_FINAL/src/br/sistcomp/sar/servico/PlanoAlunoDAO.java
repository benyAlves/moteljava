/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Plano;
import br.sistcomp.sar.dominio.Utilitario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago Ramalho
 */
public class PlanoAlunoDAO {

    private static PlanoAlunoDAO plano_alunosDAO;

    public static PlanoAlunoDAO getInstance() {
        synchronized (PlanoAlunoDAO.class) {
            if (plano_alunosDAO == null) {
                plano_alunosDAO = new PlanoAlunoDAO();
            }
        }
        return plano_alunosDAO;
    }

    public void inserirCodigoDoPlanoAoAluno(int matricula, String nomePlano) {
        PreparedStatement ps;
        try {
            int mat = (int) matricula;
            String nplan = (String) nomePlano;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO aluno_plano (matricula,codPlano,dataAdesao) VALUES (?,?,?)");
            ps.setInt(1, mat);
            ps.setInt(2, pesquisaCodigoDoPlano(nplan));
            ps.setString(3, Utilitario.dataParaBanco(Utilitario.dataDoSistema())); // o que é essa dataAdesao?
            //R: é a data que o cliente assina um plano. o método dataDoSistema retorna a data do sistema, porem no formato dd/mm/aaaa e o BD aceita aaaa-mm-dd
            ps.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // salvando vidas :D
            
        }
    }

    public int pesquisaCodigoDoPlano(String nomePlano) {
        ResultSet rs;
        PreparedStatement ps;
        int codigo = -1;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT codPlano FROM planos WHERE nome =   '" + nomePlano + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                codigo = rs.getInt("codPlano");
            }
            con.close();
            return codigo;
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return codigo;
    }

    public int pesquisaAlunosAtivos() {
        ResultSet rs;
        PreparedStatement ps;
        int qtde = 0;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT count(distinct matricula) FROM aluno_plano ");
            rs = ps.executeQuery();
            while (rs.next()) {
                qtde = rs.getInt("count(distinct matricula)");
            }
            con.close();
            return qtde;
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return qtde;
    }

    public List<Integer> pesquisaListaDeCodigosDoPlanoDoAluno(int matricula) {

        ResultSet rs;
        PreparedStatement ps;
        int codigo = -1;
        List<Integer> cod_plano = new ArrayList<Integer>();

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT codPlano FROM aluno_plano WHERE matricula = '" + matricula + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                codigo = rs.getInt("codPlano");
                cod_plano.add(codigo);
            }
            con.close();

            return cod_plano;
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return cod_plano;

    }

    public String pesquisaNomeDoPlano(int matricula) {
        ResultSet rs;
        PreparedStatement ps;
        String nome = null;


        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT nome FROM planos WHERE codPlano IN(SELECT codPlano FROM plano_alunos WHERE matricula =   '" + matricula + "')");
            rs = ps.executeQuery();
            while (rs.next()) {
                nome = rs.getString("nome");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return nome;
    }

    public void removerCod_Plano(int matricula) {
        PreparedStatement ps;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM aluno_plano WHERE matricula ='" + matricula + "'");
            ps.execute();
            con.close();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void alterarCod_Plano(int matricula, String nomePlano) {
        PreparedStatement ps;
        try {


            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("UPDATE aluno_plano set codPlano = ? WHERE matricula = '" + matricula + "'");
            ps.setInt(1, pesquisaCodigoDoPlano(nomePlano));


            ps.execute();
            con.close();
            JOptionPane.showInternalMessageDialog(null, "Atualização realizada com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
}
