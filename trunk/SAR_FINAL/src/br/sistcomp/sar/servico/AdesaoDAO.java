/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Adesao;
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

    private static AdesaoDAO adesaoDAO;

    public static AdesaoDAO getInstance() {
        synchronized (AdesaoDAO.class) {
            if (adesaoDAO == null) {
                adesaoDAO = new AdesaoDAO();
            }
        }
        return adesaoDAO;
    }

    public int aderirPlano(int matricula, Adesao adesao) {
        PreparedStatement ps;
        int codAdesao = proximoCodigo();
        try {
            int mat = (int) matricula;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO ADESOES (matricula, codPlano, codTurma, dataAdesao, valor, desconto, parcelas, formaPagamento, status) VALUES (?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, mat);
            ps.setInt(2, adesao.getPlano().getCodigo());
            ps.setInt(3, adesao.getTurma().getCodigo());
            ps.setString(4, Utilitario.dataParaBanco(Utilitario.dataDoSistema()));
            ps.setDouble(5, adesao.getValor());
            ps.setDouble(6, adesao.getDesconto());
            ps.setInt(7, adesao.getParcelas());
            ps.setString(8, adesao.getFormaDePagamento());
            ps.setBoolean(9, adesao.getStatus());
            ps.execute();
            con.close();
            return codAdesao;
        } catch (Exception e) {
            e.printStackTrace(); // salvando vidas :D

        }
        return -1;
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

    public void remover(int codAdesao) {
        PreparedStatement ps;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM ADESOES WHERE codAdesao='" + codAdesao + "'");
            ps.execute();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void trocarTurma(int codAdesao, int codTurma) {
        PreparedStatement ps;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("UPDATE ADESOES set codTurma = ? WHERE codAdesao = '" + codAdesao + "' ");
            ps.setInt(1, codTurma);
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

    public List<Integer> adesoesAtivas() {
        ResultSet rs;
        PreparedStatement ps;
        List<Integer> adesoesAtivas = new ArrayList<Integer>();

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT codAdesao FROM ADESOES WHERE status = true ");
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

    public List<Adesao> todasAdesoesDoAluno(int matricula) {
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
                adesao.setTurma(TurmaDAO.getInstance().pesquisar(rs.getInt("codTurma")));
                adesao.setDataAdesao(Utilitario.converteDateParaString(rs.getDate("dataAdesao")));
                adesao.setValor(rs.getDouble("valor"));
                adesao.setDesconto(rs.getDouble("desconto"));
                adesao.setParcelas(rs.getInt("parcelas"));
                adesao.setFormaDePagamento(rs.getString("formaPagamento"));
                adesao.setStatus(rs.getBoolean("status"));
                //adesao.setMensalidades(MensalidadeDAO.getInstance().mensalidadesDaAdesao(rs.getInt("codAdesao")));
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

    public Adesao pesquisar(int codAdesao) {
        ResultSet rs;
        PreparedStatement ps;
        Adesao adesao = new Adesao();
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM ADESOES WHERE codAdesao = '" + codAdesao + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                adesao.setCodAdesao(rs.getInt("codAdesao"));
                adesao.setMatriculaAluno(rs.getInt("matricula"));
                adesao.setPlano(PlanoDAO.getInstance().pesquisar(rs.getInt("codPlano")));
                adesao.setTurma(TurmaDAO.getInstance().pesquisar(rs.getInt("codTurma")));
                adesao.setDataAdesao(Utilitario.converteDateParaString(rs.getDate("dataAdesao")));
                adesao.setValor(rs.getDouble("valor"));
                adesao.setDesconto(rs.getDouble("desconto"));
                adesao.setParcelas(rs.getInt("parcelas"));
                adesao.setFormaDePagamento(rs.getString("formaPagamento"));
                adesao.setStatus(rs.getBoolean("status"));
                //adesao.setMensalidades(MensalidadeDAO.getInstance().mensalidadesDaAdesao(rs.getInt("codAdesao")));
            }
            con.close();
            return adesao;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar Adesão!");
        }
        return adesao;
    }

    public Boolean liberarExclusaoPlano(int codPlano) {
        ResultSet rs;
        PreparedStatement ps;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM ADESOES WHERE codPlano = '" + codPlano + "' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                return false;
            }
            con.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public int alunosNaTurma(int codTurma) {
        ResultSet rs;
        PreparedStatement ps;
        int qtde = 0;
        List<Integer> adesoesAtivas = adesoesAtivas();
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            for (int codAdesao : adesoesAtivas){
                ps = (PreparedStatement) con.prepareStatement("SELECT count(codTurma) FROM ADESOES WHERE codTurma ='"+codTurma+"' AND codAdesao='"+codAdesao+"' ");
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

    public Boolean liberarExclusaoTurma(int codTurma) {
        ResultSet rs;
        PreparedStatement ps;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM ADESOES WHERE codTurma ='" + codTurma + "' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                return false;
            }
            con.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

}
