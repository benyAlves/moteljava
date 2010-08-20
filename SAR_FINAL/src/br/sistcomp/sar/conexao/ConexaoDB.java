/**
 * pacote de conexão
 */
package br.sistcomp.sar.conexao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Essa classe faz a conexão com o banco
 * @author Ednaldo
 */
public class ConexaoDB {

    public static ConexaoDB conect = null;
    private Connection con = null;

    public ConexaoDB() throws ClassNotFoundException {
        this.criarConexao();
    }

    public static ConexaoDB getInstance() throws ClassNotFoundException {        
            conect = new ConexaoDB();        
        return conect;
    }

    /**
     * Este método cria uma conexão com o banco de dados.
     * @throws ClassNotFoundException
     */
    public void criarConexao() throws ClassNotFoundException {
        FileInputStream file = null;
        try {
            file = new FileInputStream("sar.properties");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConexaoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        Properties conexao = new Properties();
        try {
            conexao.load(file);
        } catch (IOException ex) {
            Logger.getLogger(ConexaoDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        String driver = conexao.getProperty("driver");
        String path = conexao.getProperty("path");
        String login = conexao.getProperty("login");
        String senha = conexao.getProperty("senha");

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(path, login, senha);
            System.out.println("Seu projeto foi conectado ao Mysql com sucesso.");
        } catch (SQLException sqlerror) {
            System.out.println("A conexão não foi bem sucedida " + sqlerror);
        } catch (ClassNotFoundException Driver) {
            System.out.println("O driver não foi encontrado " + Driver);
        }

    }

    /**
     * Este método fecha a conexão com o banco de dados.
     * @throws SQLException
     */
    public void fecharConexao() throws SQLException {
        this.con.close();
    }

    /**
     * metodo de conexão
     * @return a conexão
     */
    public Connection getCon() {
        return con;
    }
}
