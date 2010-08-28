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
public class FechaDAO {

    private static FechaDAO fechaDAO;

    public static FechaDAO getInstance() {
        synchronized (FechaDAO.class) {
            if (fechaDAO == null) {
                fechaDAO = new FechaDAO();
            }
        }
        return fechaDAO;
    }

    public void fechar(Caixa caixa) {
        PreparedStatement ps;
        try {
            Caixa caixaOK = (Caixa) caixa; //Validando Objeto
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO FECHA (codCaixa, matricula) VALUES (?,?)");
            ps.setInt(1, caixaOK.getCodCaixa());
            ps.setInt(2, caixaOK.getFechou().getIdPessoa());
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
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM FECHA WHERE codCaixa= '" + caixaOK.getCodCaixa() + "'");
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
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM FECHA WHERE codCaixa= '" + codCaixa + "'");
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
