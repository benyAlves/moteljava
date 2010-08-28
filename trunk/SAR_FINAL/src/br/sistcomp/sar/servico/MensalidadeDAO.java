package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Adesao;
import br.sistcomp.sar.dominio.Mensalidade;
import br.sistcomp.sar.dominio.Movimentacao;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

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
                mensalidade.setDesconto(movimentacao.getDesconto());
                mensalidade.setValor(movimentacao.getValor());
                mensalidade.setVencimento(movimentacao.getVencimento());
                mensalidade.setPagamento(movimentacao.getPagamento());
                mensalidade.setHoraPgto(movimentacao.getHoraPgto());
                mensalidade.setTipo(movimentacao.getTipo());
                //Fazer método pesquisar adesao
                //mensalidade.setAdesao(AdesaoDAO.getInstance());
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
    }

//    public String remover(Mensalidade mensalidade){
//            PreparedStatement ps;
//
//                try{
//                    Mensalidade mensalidadeOK = (Mensalidade) mensalidade;
//                    Connection con = (Connection) ConexaoDB.getInstance().getCon();
//                    ps = (PreparedStatement) con.prepareStatement("DELETE FROM MENSALIDADES WHERE codMensalidade ='"+mensalidadeOK.getCodigo()+"' ");
//                    ps.execute();
//                    con.close();
//                    return "Mensalidade Removida com Sucesso";
//                }catch (Exception e) {
//                    e.printStackTrace();
//                    return "Erro ao Remover Modalidade";
//		}
//    }
//
//    public String remover(int codAdesao){
//            PreparedStatement ps;
//
//                try{
//                    Connection con = (Connection) ConexaoDB.getInstance().getCon();
//                    ps = (PreparedStatement) con.prepareStatement("DELETE FROM MENSALIDADES WHERE codAdesao ='"+codAdesao+"' ");
//                    ps.execute();
//                    con.close();
//                    return "Mensalidade Removida com Sucesso";
//                }catch (Exception e) {
//                    e.printStackTrace();
//                    return "Erro ao Remover Modalidade";
//		}
//    }
//
    public Vector<Mensalidade> todasMensalidadesDoAluno(int matricula) {

        ResultSet rs;
        PreparedStatement ps;
        Vector<Mensalidade> mensalidades = new Vector<Mensalidade>();
        List<Adesao> adesoesDoAluno = AdesaoDAO.getInstance().todasAdesoesDoAluno(matricula);

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            for(Adesao adesao : adesoesDoAluno){
                ps = (PreparedStatement) con.prepareStatement("SELECT * FROM MENSALIDADES WHERE codAdesao = '" + adesao.getCodAdesao() + "'");
                rs = ps.executeQuery();
                while (rs.next()) {
                    Movimentacao movimentacao = MovimentacaoDAO.getInstance().pesquisar(rs.getInt("codMovimentacao"));
                    Mensalidade mensalidade = new Mensalidade();
                    mensalidade.setFuncionario(movimentacao.getFuncionario());
                    mensalidade.setDesconto(movimentacao.getDesconto());
                    mensalidade.setValor(movimentacao.getValor());
                    mensalidade.setVencimento(movimentacao.getVencimento());
                    mensalidade.setPagamento(movimentacao.getPagamento());
                    mensalidade.setHoraPgto(movimentacao.getHoraPgto());
                    mensalidade.setTipo(movimentacao.getTipo());
                    //Fazer método pesquisar adesao
                    //mensalidade.setAdesao(AdesaoDAO.getInstance());
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
                mensalidade.setDesconto(movimentacao.getDesconto());
                mensalidade.setValor(movimentacao.getValor());
                mensalidade.setVencimento(movimentacao.getVencimento());
                mensalidade.setPagamento(movimentacao.getPagamento());
                mensalidade.setHoraPgto(movimentacao.getHoraPgto());
                mensalidade.setTipo(movimentacao.getTipo());
                //Fazer método pesquisar adesao
                //mensalidade.setAdesao(AdesaoDAO.getInstance());
                mensalidades.add(mensalidade);
            }
            con.close();
            return mensalidades;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mensalidades;
    }
}
