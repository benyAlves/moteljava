/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Adesao;
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
public class AdesaoDAO {

    private static AdesaoDAO plano_alunosDAO;

    public static AdesaoDAO getInstance() {
        synchronized (AdesaoDAO.class) {
            if (plano_alunosDAO == null) {
                plano_alunosDAO = new AdesaoDAO();
            }
        }
        return plano_alunosDAO;
    }

    public int aderirPlano(int matricula, Adesao adesao) {
        PreparedStatement ps;
        int codAdesao = proximoCodigo();
        try {
            int mat = (int) matricula;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO ADESOES (matricula, codPlano, dataAdesao, valor, desconto, parcelas, formaPagamento, status) VALUES (?,?,?,?,?,?,?,?)");
            ps.setInt(1, mat);
            ps.setInt(2, adesao.getPlano().getCodigo());
            ps.setString(3, Utilitario.dataParaBanco(Utilitario.dataDoSistema()));
            ps.setDouble(4, adesao.getValor());
            ps.setDouble(5, adesao.getDesconto());
            ps.setInt(6, adesao.getParcelas());
            ps.setString(7, adesao.getFormaDePagamento());
            ps.setBoolean(8, adesao.getStatus());
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

    public int alunosAtivos() {
        ResultSet rs;
        PreparedStatement ps;
        int qtde = 0;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT distinct (matricula) FROM ADESOES WHERE status=true ");
            rs = ps.executeQuery();
            while (rs.next()) {
                qtde++;
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
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM ADESOES WHERE matricula = '" + matricula + "'");
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

    public void remover(int codAdesao) {
        PreparedStatement ps;
        ResultSet rs;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM ADESOES WHERE codAdesao='" + codAdesao + "'");
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
            ps = (PreparedStatement) con.prepareStatement("UPDATE ADESOES set codTurma = ? WHERE matricula = '" + matricula + "' and codPlano = '" +codPlano+ "'");
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
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("SHOW TABLE STATUS LIKE 'ADESOES'");
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
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM ADESOES WHERE matricula = '" + matricula + "' AND codPlano = '"+codPlano+"'");
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

    public List<Integer> adesoesAtivas(){
        ResultSet rs;
        PreparedStatement ps;
        List<Integer> adesoesAtivas = new ArrayList<Integer>();


        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT codAdesao FROM ADESOES WHERE status = 'true' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                adesoesAtivas.add(rs.getInt("codAdesao"));
            }

            con.close();
            return adesoesAtivas;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return adesoesAtivas;
    }

    public List<Adesao> todasAdesoesDoAluno(int matricula){
        ResultSet rs;
        PreparedStatement ps;
        List<Adesao> adesoes = new ArrayList<Adesao>();
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM ADESOES WHERE matricula = '" + matricula + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                Adesao adesao = new Adesao();
                adesao.setCodAdesao(rs.getInt("codAdesao"));
                adesao.setMatriculaAluno(matricula);
                adesao.setPlano(PlanoDAO.getInstance().pesquisar(rs.getInt("codPlano")));
                adesao.setDataAdesao(Utilitario.converteDateParaString(rs.getDate("dataAdesao")));
                adesao.setValor(rs.getDouble("valor"));
                adesao.setDesconto(rs.getDouble("desconto"));
                adesao.setParcelas(rs.getInt("parcelas"));
                adesao.setFormaDePagamento(rs.getString("formaPagamento"));
                adesao.setStatus(rs.getBoolean("status"));
                adesao.setMensalidades(MensalidadeDAO.getInstance().mensalidadesDaAdesao(rs.getInt("codAdesao")));
                adesao.setTurma(TurmaDAO.getInstance().pesquisar(AlunoTurmaDAO.getInstance().turmaAderida(rs.getInt("codAdesao"))));
                adesoes.add(adesao);
            }
            con.close();
            return adesoes;

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar Adesões!");
        }
        return adesoes;
    }

}
