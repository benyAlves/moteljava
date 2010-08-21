/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Plano;
import br.sistcomp.sar.dominio.Turma;
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

    public int inserirCodigoDoPlanoAoAluno(int matricula, Plano plano) {
        PreparedStatement ps;
        int codAdesao = proximoCodigo();
        try {
            int mat = (int) matricula;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO ALUNO_PLANO (matricula, codPlano, dataAdesao, valor, desconto, parcelas, formaPagamento, codTurma) VALUES (?,?,?,?,?,?,?,?)");
            ps.setInt(1, mat);
            ps.setInt(2, plano.getCodigo());
            ps.setString(3, Utilitario.dataParaBanco(Utilitario.dataDoSistema()));
            ps.setDouble(4, plano.getValor());
            ps.setDouble(5, plano.getDesconto());
            ps.setInt(6, plano.getNumeroDeParcelas());
            ps.setString(7, plano.getFormaPagamento());
            ps.setInt(8, plano.getTurma().getCodigo());
            ps.execute();
            con.close();
            return codAdesao;
        } catch (Exception e) {
            e.printStackTrace(); // salvando vidas :D

        }
        return -1;
    }

    public int pesquisaCodigoDoPlano(String nomePlano) {
        ResultSet rs;
        PreparedStatement ps;
        int codigo = -1;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT codPlano FROM PLANOS WHERE nome =   '" + nomePlano + "'");
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

    public List<Plano> pesquisaPlanosAderidos(int matricula) {

        ResultSet rs;
        PreparedStatement ps;
        int codigo = -1, numeroDeParcelas = -1, codTurma = -1;
        Double valor = -1.0, desconto = -1.0;
        String formaPagamento = "", diaDoPagamento = "";
        List<Plano> planosAderidos = new ArrayList<Plano>();
        Turma turma = null;

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM ALUNO_PLANO WHERE matricula = '" + matricula + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                codigo = rs.getInt("codPlano");
                valor = rs.getDouble("valor");
                desconto = rs.getDouble("desconto");
                numeroDeParcelas = rs.getInt("parcelas");
                formaPagamento = rs.getString("formaPagamento");
                diaDoPagamento = Utilitario.converteDateParaString(rs.getDate("dataAdesao"));
                codTurma = rs.getInt("codTurma");
                turma = TurmaDAO.getInstance().pesquisar(codTurma);
                Plano plano = new Plano(codigo,valor,numeroDeParcelas,desconto,formaPagamento,diaDoPagamento,turma);
                planosAderidos.add(plano);
            }
            con.close();
            return planosAderidos;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return planosAderidos;
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

    public void remover(int matricula, int codPlano) {
        PreparedStatement ps;
        ResultSet rs;
        int codAdesao = -1;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT codAdesao FROM ALUNO_PLANO WHERE matricula ='" + matricula + "' AND codPlano='" + codPlano + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                codAdesao = rs.getInt("codAdesao");
            }
            MensalidadeDAO.getInstance().remover(matricula, codAdesao);
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM ALUNO_PLANO WHERE matricula ='" + matricula + "' AND codAdesao='" + codAdesao + "'");
            ps.execute();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void alterarCodTurma(int matricula, int codPlano, int codTurma) {
        PreparedStatement ps;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("UPDATE ALUNO_PLANO set codTurma = ? WHERE matricula = '" + matricula + "' and codPlano = '" +codPlano+ "'");
            ps.setInt(1, codTurma);
            ps.execute();
            con.close();
            //JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

        public int proximoCodigo(){
        int codigo = -1;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("SHOW TABLE STATUS LIKE 'ALUNO_PLANO'");
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

    public Plano planoAderido(int codPlano, int matricula) {

        ResultSet rs;
        PreparedStatement ps;
        int codigo = -1, numeroDeParcelas = -1, codTurma = -1;
        Double valor = -1.0, desconto = -1.0;
        String formaPagamento = "", diaDoPagamento = "";
        Plano plano = null;
        Turma turma = null;

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM ALUNO_PLANO WHERE matricula = '" + matricula + "' AND codPlano = '"+codPlano+"'");
            rs = ps.executeQuery();
            while (rs.next()) {
                codigo = rs.getInt("codPlano");
                valor = rs.getDouble("valor");
                desconto = rs.getDouble("desconto");
                numeroDeParcelas = rs.getInt("parcelas");
                formaPagamento = rs.getString("formaPagamento");
                diaDoPagamento = Utilitario.converteDateParaString(rs.getDate("dataAdesao"));
                codTurma = rs.getInt("codTurma");
                turma = TurmaDAO.getInstance().pesquisar(codTurma);
                plano = new Plano(codigo,valor,numeroDeParcelas,desconto,formaPagamento,diaDoPagamento,turma);
            }
            con.close();
            return plano;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return plano;
    }

    public List<Integer> turmasAderidas(int matricula){
        ResultSet rs;
        PreparedStatement ps;
        List<Integer> turmas = new ArrayList<Integer>();


        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT codTurma FROM ALUNO_PLANO WHERE matricula = '" + matricula + "' ");
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

}
