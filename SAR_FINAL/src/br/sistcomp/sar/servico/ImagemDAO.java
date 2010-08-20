/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Utilitario;
import com.mysql.jdbc.Blob;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago Ramalho
 */
public class ImagemDAO {

private static ImagemDAO imagemDAO ;

     public static ImagemDAO getInstance(){
            synchronized(ImagemDAO.class){
                if(imagemDAO == null){
                    imagemDAO = new ImagemDAO();
                }
            }
            return imagemDAO;
        }

public void inserirFotoWeb(int matricula){
       PreparedStatement ps;
        try{
         File file = new File(System.getProperty("user.dir") + "\\src\\br\\sistcomp\\sar\\imagens\\Foto.png");
         FileInputStream inputStream = new FileInputStream(file);
         Connection con = (Connection) ConexaoDB.getInstance().getCon();
        ps = (PreparedStatement) con.prepareStatement("INSERT INTO imagens (idPessoa, foto) VALUES (?,?)");
        ps.setInt(1, Utilitario.retornaIdPessoa(matricula));
        ps.setBinaryStream(2,inputStream,(int) file.length());
        ps.execute();
        con.close();
       

         } catch (Exception e) {
                e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
                
         }
    }

public void inserirFotoArquivo(int matricula, File file){
       PreparedStatement ps;
        try{
         //File file = new File(System.getProperty("user.dir") + "\\src\\br\\sistcomp\\sar\\imagens\\semFoto.png");
         FileInputStream inputStream = new FileInputStream(file);
         Connection con = (Connection) ConexaoDB.getInstance().getCon();
        ps = (PreparedStatement) con.prepareStatement("INSERT INTO imagens (idPessoa, foto) VALUES (?,?)");
        ps.setInt(1, Utilitario.retornaIdPessoa(matricula));
        ps.setBinaryStream(2,inputStream,(int) file.length());
        ps.execute();
        con.close();
        

         } catch (Exception e) {
                e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
                
         }
    }

public void alterarFoto(int matricula){
       PreparedStatement ps;
        try{
         File file = new File(System.getProperty("user.dir") + "\\src\\br\\sistcomp\\sar\\imagens\\Foto.png");
         FileInputStream inputStream = new FileInputStream(file);
         Connection con = (Connection) ConexaoDB.getInstance().getCon();
        ps = (PreparedStatement) con.prepareStatement("UPDATE imagens set foto=? WHERE idPessoa = '"+ Utilitario.retornaIdPessoa(matricula)+"'");
        ps.setBinaryStream(1,inputStream,(int) file.length());
        ps.execute();
        con.close();
        

         } catch (Exception e) {
                e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
                
         }
    }
public void alterarFotoParaDefault(int matricula){
       PreparedStatement ps;
        try{
         File file = new File(System.getProperty("user.dir") + "\\src\\br\\sistcomp\\sar\\imagens\\semFoto.png");
         FileInputStream inputStream = new FileInputStream(file);
         Connection con = (Connection) ConexaoDB.getInstance().getCon();
        ps = (PreparedStatement) con.prepareStatement("UPDATE imagens set foto=? WHERE idPessoa = '"+ Utilitario.retornaIdPessoa(matricula)+"'");
        ps.setBinaryStream(1,inputStream,(int) file.length());
        ps.execute();
        con.close();
        

         } catch (Exception e) {
                e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
                
         }
    }

    public ImageIcon pesquisarFoto(int matricula){
        PreparedStatement ps;
        ResultSet rs;
        Blob blob = null;
        ImageIcon imagem = null;

        try{

          Connection con = (Connection) ConexaoDB.getInstance().getCon();
          ps = (PreparedStatement) con.prepareStatement("SELECT foto FROM imagens WHERE idPessoa = '"+Utilitario.retornaIdPessoa(matricula)+"'");
          rs = ps.executeQuery();
          while (rs.next())
          blob = (Blob) rs.getBlob("foto");
          imagem = new ImageIcon(blob.getBytes(1, (int)blob.length()));
          con.close();
          return imagem;
         } catch (Exception e) {
                e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
                
         }
        return imagem;
    }

    public void removerImagem(int matricula) {
        PreparedStatement ps;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM imagens WHERE idPessoa ='" + matricula + "'");
            ps.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }



}

