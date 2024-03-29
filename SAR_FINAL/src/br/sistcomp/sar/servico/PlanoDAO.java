package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Modalidade;
import br.sistcomp.sar.dominio.Plano;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

public class PlanoDAO {

    private static PlanoDAO planoDAO;

    public static PlanoDAO getInstance() {
        synchronized (PlanoDAO.class) {
            if (planoDAO == null) {
                planoDAO = new PlanoDAO();
            }
        }
        return planoDAO;
    }

    public void cadastrar(Plano plano) {
        PreparedStatement ps;

        try {
            Plano planoOK = (Plano) plano;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO PLANOS (nome, duracao, valor, codModalidade, status) VALUES (?,?,?,?,?)");
            ps.setString(1, planoOK.getNome());
            ps.setString(2, Integer.toString(planoOK.getDuracao()));
            ps.setDouble(3, planoOK.getValor());
            ps.setInt(4, planoOK.getModalidade().getCodigo());
            ps.setString(5, planoOK.getStatus());
            ps.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
        }
    }

    public Plano pesquisar(String nomePlano) {
        ResultSet rs;
        PreparedStatement ps;
        Plano plano = null;
        ModalidadeDAO modalidadeDAO = ModalidadeDAO.getInstance();
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM planos WHERE nome = '" + nomePlano + "' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                int codigo = rs.getInt("codPlano");
                String nome = rs.getString("nome");
                Modalidade modalidade = modalidadeDAO.pesquisar(rs.getInt("codModalidade"));
                int duracao = rs.getInt("duracao");
                Double valor = rs.getDouble("valor");
                String status = rs.getString("status");
                con.close();
                plano = new Plano(codigo, nome, duracao, valor, modalidade, status);
                return plano;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return plano;
    }
    
    public Plano pesquisar(int codPlano) {
        ResultSet rs;
        PreparedStatement ps;
        Plano plano = null;
        ModalidadeDAO modalidadeDAO = ModalidadeDAO.getInstance();
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM PLANOS WHERE codPlano = '" + codPlano + "' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                int codigo = rs.getInt("codPlano");
                String nome = rs.getString("nome");
                Modalidade modalidade = modalidadeDAO.pesquisar(rs.getInt("codModalidade"));
                int duracao = rs.getInt("duracao");
                Double valor = rs.getDouble("valor");
                String status = rs.getString("status");
                con.close();
                plano = new Plano(codigo, nome, duracao, valor, modalidade, status);
                return plano;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return plano;
    }

    public String alterar(Plano plano) {
        PreparedStatement ps;
        try {
            Plano planoOK = (Plano) plano;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("UPDATE planos "
                    + "set nome = ?, duracao = ?, valor = ?, codModalidade = ?,"
                    + " status = ? WHERE codPlano = '" + planoOK.getCodigo() + "' ");
            ps.setString(1, planoOK.getNome());
            ps.setInt(2, planoOK.getDuracao());
            ps.setDouble(3, planoOK.getValor());
            ps.setInt(4, planoOK.getModalidade().getCodigo());
            ps.setString(5, planoOK.getStatus());
            ps.execute();
            con.close();
            return "Plano alterado com sucesso";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao alterar Plano";
        }
    }

    public String remover(String nome) {
        PreparedStatement ps;
        try {

            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM planos WHERE nome ='" + nome + "' ");
            ps.execute();
            con.close();
            return "Plano removido com sucesso";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao remover Plano";
        }
    }

     public Vector<Plano> TodosOsPlanos() {
        ResultSet rs;
        PreparedStatement ps;
        int cod_plano = 0, cod_modalidade = 0, duracao = 0;
        String nome = null;
        Plano plano = null;
        Vector<Plano> todosPlanos = new Vector<Plano>();

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM planos");
            rs = ps.executeQuery();
                while (rs.next()) {
                    cod_plano = rs.getInt("codPlano");
                    nome = rs.getString("nome");
                    duracao = rs.getInt("duracao");
                    cod_modalidade = rs.getInt("codModalidade");
                    Double valor = rs.getDouble("valor");
                    String status = rs.getString("status");
                    plano = new Plano(cod_plano, nome, duracao, valor, ModalidadeDAO.getInstance().pesquisar(cod_modalidade),status);
                    todosPlanos.add(plano);
                }

            con.close();

            return todosPlanos;

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar todos os planos");
        }
        return todosPlanos;
    }

     public int proximoCodigo(){
        int codigo = -1;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("SHOW TABLE STATUS LIKE 'PLANOS'");
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

     public Vector<String> planoPorModalidade(String nome){
          ResultSet rs,rs2;
	  PreparedStatement ps,ps2;
          Vector<String> planos = new Vector<String>();
          Plano plano = null;
          String nomePlano = "";
          double valor;
          int codigoPlano = -1,duracao = -1;

          try {
                Connection con = (Connection) ConexaoDB.getInstance().getCon();

                ps = (PreparedStatement) con.prepareStatement("SELECT * FROM PLANOS WHERE codModalidade = '"
                        + ModalidadeDAO.getInstance().getModalidades(nome).getCodigo()+"'");
                rs = ps.executeQuery();
                while(rs.next()){
                    codigoPlano = rs.getInt("codPlano");

                ps2 = (PreparedStatement) con.prepareStatement("SELECT * FROM Planos p WHERE codPlano = '"
                        + codigoPlano + "'");
                rs2 = ps2.executeQuery();
              //codigo,nomePlano,duracao,valor,modalidade,status,

                while (rs2.next()) {
                 nomePlano = rs2.getString("nome");
             }    planos.add(nomePlano);

         }
                con.close();
                return planos;

         }
          catch (Exception e) {
              e.printStackTrace();
              return planos;
          }
          //return planos; //tratar exceÃ§Ã£o
    }

    public double pesquisarValor(String nomePlano){
          ResultSet rs;
	  PreparedStatement ps;
          double valor = 0;

          try {
                Connection con = (Connection) ConexaoDB.getInstance().getCon();

                ps = (PreparedStatement) con.prepareStatement("SELECT valor FROM PLANOS WHERE nome = '"+ nomePlano+"' ");
                rs = ps.executeQuery();
                while(rs.next()){
                    valor = rs.getDouble("valor");
                }
                con.close();
                return valor;
         }
          catch (Exception e) {
              e.printStackTrace();

          }
          return valor; //tratar exceÃ§Ã£o
    }

    public int pesquisarDuracao(String nomePlano){
          ResultSet rs;
	  PreparedStatement ps;
          int duracao = 0;

          try {
                Connection con = (Connection) ConexaoDB.getInstance().getCon();

                ps = (PreparedStatement) con.prepareStatement("SELECT duracao FROM PLANOS WHERE nome = '"+ nomePlano+"' ");
                rs = ps.executeQuery();
                while(rs.next()){
                    duracao = rs.getInt("duracao");
                }
                con.close();
                return duracao;
         }
          catch (Exception e) {
              e.printStackTrace();
          }
          return duracao; //tratar exceÃ§Ã£o
    }

    public Boolean liberarExclusaoModalidade(int codModalidade){
          ResultSet rs;
	  PreparedStatement ps;
          try {
                Connection con = (Connection) ConexaoDB.getInstance().getCon();
                ps = (PreparedStatement) con.prepareStatement("SELECT * FROM PLANOS WHERE codModalidade = '"+ codModalidade +"' ");
                rs = ps.executeQuery();
                while(rs.next()){
                    return false;
                }
                con.close();
                return true;
         }
          catch (Exception e) {
              e.printStackTrace();
          }
          return true;
    }

}
