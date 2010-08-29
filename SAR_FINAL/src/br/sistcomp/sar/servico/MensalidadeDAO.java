package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Adesao;
import br.sistcomp.sar.dominio.Mensalidade;
import br.sistcomp.sar.dominio.Movimentacao;
import br.sistcomp.sar.dominio.Utilitario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

public class MensalidadeDAO {

    private static MensalidadeDAO mensalidadeDAO;

    public static MensalidadeDAO getInstance() {
        synchronized (MensalidadeDAO.class) {
            if (mensalidadeDAO == null) {
                mensalidadeDAO = new MensalidadeDAO();
            }
        }
        return mensalidadeDAO;
    }

    public void cadastrar(Mensalidade mensalidade) {
        Mensalidade mensalidadeOK = (Mensalidade) mensalidade;
        int codMovimentacao = MovimentacaoDAO.getInstance().cadastrar(mensalidade);
        PreparedStatement ps;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO MENSALIDADES (codMovimentacao, codAdesao) VALUES (?,?)");
            ps.setInt(1, codMovimentacao);
            ps.setInt(2, mensalidadeOK.getAdesao().getCodAdesao());
            ps.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
        }
    }

    public Mensalidade pesquisar(int codMovimentacao) {
        ResultSet rs;
        PreparedStatement ps;
        Mensalidade mensalidade = new Mensalidade();
        Movimentacao movimentacao = MovimentacaoDAO.getInstance().pesquisar(codMovimentacao);

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM MENSALIDADES WHERE codMovimentacao = '" + codMovimentacao + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                mensalidade.setFuncionario(movimentacao.getFuncionario());
                mensalidade.setValor(movimentacao.getValor());
                mensalidade.setVencimento(movimentacao.getVencimento());
                mensalidade.setHora(movimentacao.getHora());
                mensalidade.setTipo(movimentacao.getTipo());
                mensalidade.setAdesao(AdesaoDAO.getInstance().pesquisar(rs.getInt("codAdesao")));
                if (rs.getDate("pagamento") != null) {
                    mensalidade.setPagamento(Utilitario.converteDateParaString(rs.getDate("pagamento")));
                }
                mensalidade.setDesconto(rs.getDouble("desconto"));
                con.close();
                return mensalidade;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mensalidade;
    }

    public void alterar(Mensalidade mensalidade) {
        MovimentacaoDAO.getInstance().alterar(mensalidade);
        PreparedStatement ps;
        try {
            Mensalidade mensalidadeOK = (Mensalidade) mensalidade;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("UPDATE MENSALIDADES SET pagamento = ?, desconto = ? WHERE codMovimentacao = '" + mensalidadeOK.getCodMovimentacao() + "' ");
            ps.setDate(1, (Date) Utilitario.converteStringParaDate(mensalidadeOK.getPagamento()));
            ps.setDouble(2, mensalidadeOK.getDesconto());
            ps.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remover(int codAdesao) {
        ResultSet rs, rs2;
        PreparedStatement ps, ps2;

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT codMovimentacao FROM MENSALIDADES WHERE codAdesao = '" + codAdesao + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                ps2 = (PreparedStatement) con.prepareStatement("DELETE FROM MENSALIDADES WHERE codMovimentacao='" + rs.getInt("codMovimentacao") + "' ");
                ps2.execute();
                MovimentacaoDAO.getInstance().remover(rs.getInt("codMovimentacao"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Vector<Mensalidade> todasMensalidadesDoAluno(int matricula) {

        ResultSet rs;
        PreparedStatement ps;
        Vector<Mensalidade> mensalidades = new Vector<Mensalidade>();
        List<Adesao> adesoesDoAluno = AdesaoDAO.getInstance().todasAdesoesDoAluno(matricula);

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            for (Adesao adesao : adesoesDoAluno) {
                ps = (PreparedStatement) con.prepareStatement("SELECT * FROM MENSALIDADES WHERE codAdesao = '" + adesao.getCodAdesao() + "'");
                rs = ps.executeQuery();
                while (rs.next()) {
                    Movimentacao movimentacao = MovimentacaoDAO.getInstance().pesquisar(rs.getInt("codMovimentacao"));
                    Mensalidade mensalidade = new Mensalidade();
                    mensalidade.setFuncionario(movimentacao.getFuncionario());
                    mensalidade.setValor(movimentacao.getValor());
                    mensalidade.setVencimento(movimentacao.getVencimento());
                    mensalidade.setHora(movimentacao.getHora());
                    mensalidade.setTipo(movimentacao.getTipo());
                    mensalidade.setAdesao(adesao);
                    if (rs.getDate("pagamento") != null) {
                        mensalidade.setPagamento(Utilitario.converteDateParaString(rs.getDate("pagamento")));
                    }
                    mensalidade.setDesconto(rs.getDouble("desconto"));
                    mensalidades.add(mensalidade);
                }
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mensalidades;
    }

    public List<Mensalidade> mensalidadesDaAdesao(int codAdesao) {
        ResultSet rs;
        PreparedStatement ps;
        List<Mensalidade> mensalidades = new ArrayList<Mensalidade>();

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM MENSALIDADES WHERE codAdesao = '" + codAdesao + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                Movimentacao movimentacao = MovimentacaoDAO.getInstance().pesquisar(rs.getInt("codMovimentacao"));
                Mensalidade mensalidade = new Mensalidade();
                mensalidade.setFuncionario(movimentacao.getFuncionario());
                mensalidade.setValor(movimentacao.getValor());
                mensalidade.setVencimento(movimentacao.getVencimento());
                mensalidade.setHora(movimentacao.getHora());
                mensalidade.setTipo(movimentacao.getTipo());
                mensalidade.setAdesao(AdesaoDAO.getInstance().pesquisar(codAdesao));
                if (rs.getDate("pagamento") != null) {
                    mensalidade.setPagamento(Utilitario.converteDateParaString(rs.getDate("pagamento")));
                }
                mensalidade.setDesconto(rs.getDouble("desconto"));
                mensalidades.add(mensalidade);
            }
            con.close();
            return mensalidades;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mensalidades;
    }

    public Boolean liberarExclusaoAdesao(int codAdesao) {
        ResultSet rs;
        PreparedStatement ps;
        List<Integer> mensalidades = new ArrayList<Integer>();
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM MENSALIDADES WHERE codAdesao = '" + codAdesao + "' AND pagamento IS NULL");
            rs = ps.executeQuery();
            while (rs.next()) {
                mensalidades.add(rs.getInt("codMovimentacao"));
            }
            con.close();
            if(mensalidades.isEmpty()){
                return false;
            }
            return MovimentacaoDAO.getInstance().mensalidadesLiberadas(mensalidades);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
