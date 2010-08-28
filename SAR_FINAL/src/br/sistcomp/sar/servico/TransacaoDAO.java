
package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Caixa;
import br.sistcomp.sar.dominio.Movimentacao;
import br.sistcomp.sar.dominio.Transacao;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 *
 * @author Fillipe
 */
public class TransacaoDAO {

    private static TransacaoDAO transacaoDAO;

    public static TransacaoDAO getInstance() {
        synchronized (TransacaoDAO.class) {
            if (transacaoDAO == null) {
                transacaoDAO = new TransacaoDAO();
            }
        }
        return transacaoDAO;
    }

    public void cadastrar(Transacao transacao) {
        PreparedStatement ps;
        try {
            Transacao transacaoOK = (Transacao) transacao; //Validando Objeto
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO TRANSACOES (codCaixa, codMovimentacao) VALUES (?,?)");
            ps.setInt(1, transacaoOK.getCaixa().getCodCaixa());
            ps.setInt(2, transacaoOK.getMovimentacao().getCodMovimentacao());
            ps.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
        }
    }

    public void cadastrar(Caixa caixa, Movimentacao movimentacao) {
        PreparedStatement ps;
        try {
            Caixa caixaOK = (Caixa) caixa; //Validando Objeto
            Movimentacao movimentacaoOK = (Movimentacao) movimentacao;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO TRANSACOES (codCaixa, codMovimentacao) VALUES (?,?)");
            ps.setInt(1, caixaOK.getCodCaixa());
            ps.setInt(2, movimentacaoOK.getCodMovimentacao());
            ps.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
        }
    }

}
