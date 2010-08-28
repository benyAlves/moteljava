/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistcomp.sar.conexao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Jefferson Araujo
 */
public class ConexaoDBRelatorio {

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String driver = "jdbc:mysql://localhost/sar";
            Connection con = (Connection) DriverManager.getConnection(driver, "root", "sar");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
