/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Caixa;
import br.sistcomp.sar.dominio.Funcionario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Fillipe
 */
public class AbreDAO {

    private static AbreDAO abreDAO;

    public static AbreDAO getInstance() {
        synchronized (AbreDAO.class) {
            if (abreDAO == null) {
                abreDAO = new AbreDAO();
            }
        }
        return abreDAO;
    }

    public void abrir(Caixa caixa) {
        PreparedStatement ps;
        try {
            Caixa caixaOK = (Caixa) caixa; //Validando Objeto
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO ABRE (codCaixa, matricula) VALUES (?,?)");
            ps.setInt(1, caixaOK.getCodCaixa());
            ps.setInt(2, caixaOK.getAbriu().getIdPessoa());
            ps.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
        }
    }

    public Funcionario pesquisar(Caixa caixa){
        ResultSet rs;
        PreparedStatement ps;
        Funcionario funcionario = null;
        Caixa caixaOK = (Caixa) caixa;

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM ABRE WHERE codCaixa= '" + caixaOK.getCodCaixa() + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                funcionario = FuncionarioDAO.getInstance().pesquisaFuncionario(rs.getInt("matricula"));
                con.close();
                return funcionario;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return funcionario;
    }

    public Funcionario pesquisar(int codCaixa){
        ResultSet rs;
        PreparedStatement ps;
        Funcionario funcionario = null;

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM ABRE WHERE codCaixa= '" + codCaixa + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                funcionario = FuncionarioDAO.getInstance().pesquisaFuncionario(rs.getInt("matricula"));
                con.close();
                return funcionario;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return funcionario;
    }

}
