
package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Modalidade;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;


public class ModalidadeDAO {

    private static ModalidadeDAO modalidadeDAO ;

    public static ModalidadeDAO getInstance(){
        synchronized(ModalidadeDAO.class){
            if(modalidadeDAO == null){
                modalidadeDAO = new ModalidadeDAO();
            }
        }
        return modalidadeDAO;
    }

    public String cadastrar(Modalidade modalidade){
        PreparedStatement ps;

        try {
            Modalidade modalidadeOK = (Modalidade) modalidade;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO MODALIDADES (nome, ambiente, alunosPorTurma) VALUES (?,?,?)");
            ps.setString(1,modalidadeOK.getNome());
            ps.setString(2,modalidadeOK.getAmbiente());
            ps.setInt(3, modalidadeOK.getAlunosPorTurma());
            ps.execute();
            con.close();
            return "Modalidade Cadastrada com Sucesso!";
          }
        catch (Exception e) {
            e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
            return "Erro ao cadastrar Modalidade!";
         }
    }

    public Modalidade pesquisar(int codigo){
          ResultSet rs;
	  PreparedStatement ps;
          String nome = null;
          String ambiente = null;
          int  alunosPorTurma = 0;
          Modalidade m = null;

          try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
                ps = (PreparedStatement) con.prepareStatement("SELECT * FROM MODALIDADES WHERE codModalidade = '"+codigo+"'" );
                rs = ps.executeQuery();
                while(rs.next()){
                    codigo = rs.getInt("codModalidade");
                    nome = rs.getString("nome");
                    ambiente = rs.getString("ambiente");
                    alunosPorTurma = rs.getInt("alunosPorTurma");
                    con.close();
                    m = new Modalidade(codigo,nome,ambiente, alunosPorTurma);
                    return m;
                }
          }
          catch (Exception e) {
              e.printStackTrace();
              m.setAlunosPorTurma(-1);
              return m;
          }

          return m;
    }

     public int proximoCodigo(){
          ResultSet rs;
	  PreparedStatement ps;
          int codigo = -1;
          Modalidade m = null;

          try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
                ps = (PreparedStatement) con.prepareStatement("SHOW TABLE STATUS LIKE 'MODALIDADES'" );
                rs = ps.executeQuery();
                while(rs.next()){
                    codigo = rs.getInt("Auto_increment");
                    con.close();
                    return codigo;
                }
          }
          catch (Exception e) {
              e.printStackTrace();

          }

          return -1;
    }

    public void alterar(Modalidade modalidade){
          PreparedStatement ps;
            try{
                Modalidade modalidadeOK = (Modalidade) modalidade;
                Connection con = (Connection) ConexaoDB.getInstance().getCon();
                ps = (PreparedStatement) con.prepareStatement("UPDATE MODALIDADES set nome = ?, ambiente = ?, alunosPorTurma = ? WHERE codModalidade = '"+modalidadeOK.getCodigo()+"' ");
                ps.setString(1, modalidadeOK.getNome());
                ps.setString(2, modalidadeOK.getAmbiente());
                ps.setInt(3, modalidadeOK.getAlunosPorTurma());
                ps.execute();
                con.close();
                System.out.println("Modalidade alterada com sucesso");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Erro ao alterar Modalidade");
            }
    }

    public void remover(String nome){
            PreparedStatement ps;

                try{
                    Connection con = (Connection) ConexaoDB.getInstance().getCon();
                    ps = (PreparedStatement) con.prepareStatement("DELETE FROM MODALIDADES WHERE nome ='"+nome+"' ");
                    ps.execute();
                    con.close();

                }catch (Exception e) {
                    e.printStackTrace();
		}
    }

    public Vector<String> getNomesModalidades(){
          ResultSet rs;
	  PreparedStatement ps;
          Vector<String> nomesModalidades = new Vector<String>();

          try {
                Connection con = (Connection) ConexaoDB.getInstance().getCon();
                ps = (PreparedStatement) con.prepareStatement("SELECT nome FROM MODALIDADES");
                rs = ps.executeQuery();
                while(rs.next()){
                    nomesModalidades.add(rs.getString("nome"));
                }
                con.close();
                return nomesModalidades;
          }
          catch (Exception e) {
              e.printStackTrace();
              return nomesModalidades;
          }
    }

    public Modalidade getModalidades(String nome){
          ResultSet rs;
	  PreparedStatement ps;
          Modalidade modalidades = null;
          String ambiente = null;
          int  alunosPorTurma = -1;
          int codigo = -1;

          try {
                Connection con = (Connection) ConexaoDB.getInstance().getCon();
                ps = (PreparedStatement) con.prepareStatement("SELECT * FROM MODALIDADES WHERE nome='"+nome+"' " );
                rs = ps.executeQuery();
                while(rs.next()){
                    ambiente = rs.getString("ambiente");
                    codigo = rs.getInt("codModalidade");
                    alunosPorTurma = rs.getInt("alunosPorTurma");
                    modalidades = new Modalidade(codigo,nome,ambiente, alunosPorTurma);
                }
                con.close();
                return modalidades;
          }
          catch (Exception e) {
              e.printStackTrace();
              return modalidades;
          }
    }

}


