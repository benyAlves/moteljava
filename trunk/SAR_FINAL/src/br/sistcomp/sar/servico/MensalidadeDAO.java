
package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Mensalidade;
import br.sistcomp.sar.dominio.Utilitario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class MensalidadeDAO {

    private static MensalidadeDAO mensalidadeDAO ;

    public static MensalidadeDAO getInstance(){
        synchronized(MensalidadeDAO.class){
            if(mensalidadeDAO == null){
                mensalidadeDAO = new MensalidadeDAO();
            }
        }
        return mensalidadeDAO;
    }

    public String cadastrar(Mensalidade mensalidade, int matricula){
        PreparedStatement ps;

        try {
            Mensalidade mensalidadeOK = (Mensalidade) mensalidade;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO mensalidades (matricula,nomeDoPlano, nomeDaModalidade, valor, desconto, vencimento, pagamento) VALUES (?,?,?,?,?,?,?)");
            ps.setInt(1, matricula);
            ps.setString(2, mensalidadeOK.getNomeDaModalidade());
            ps.setDouble(3, mensalidadeOK.getValor());
            ps.setDouble(4, mensalidadeOK.getDesconto());
            ps.setString(5, Utilitario.dataParaBanco(mensalidadeOK.getVencimento()));
            ps.setString(6, mensalidadeOK.getPagamento());
            ps.execute();
            con.close();
            return "Mensalidade Cadastrada com Sucesso!";
          }
        catch (Exception e) {
            e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
            return "Erro ao cadastrar Mensalidade!";
         }
    }

    public Mensalidade pesquisar(int codMensalidade){
          ResultSet rs;
	  PreparedStatement ps;
          Mensalidade m = new Mensalidade(0," ",-1,-1," "," ");

          try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
                ps = (PreparedStatement) con.prepareStatement("SELECT * FROM mensalidades WHERE codMensalidade = '"+codMensalidade+"'" );
                rs = ps.executeQuery();
                while(rs.next()){
                    String nomeDoPlano = rs.getString("nomeDoPlano");
                    double valor = rs.getDouble("valor");
                    double desconto = rs.getDouble("desconto");
                    String vencimento = rs.getString("vencimento");
                    String pagamento = rs.getString("pagamento");
                    con.close();
                    m = new Mensalidade(codMensalidade,nomeDoPlano,valor,desconto,vencimento,pagamento);
                    return m;
                }
          }
          catch (Exception e) {
              e.printStackTrace();
              m.setValor(0);
              return m;
          }

          return m;
    }

    public String alterar(Mensalidade mensalidade){
          PreparedStatement ps;
            try{
                Mensalidade mensalidadeOK = (Mensalidade) mensalidade;
                Connection con = (Connection) ConexaoDB.getInstance().getCon();
                ps = (PreparedStatement) con.prepareStatement("UPDATE mensalidades set valor = ?, desconto = ?, vencimento = ?, pagamento = ? WHERE codMensalidade = '"+mensalidadeOK.getCodigo()+"' ");
                ps.setDouble(1, mensalidadeOK.getValor());
                ps.setDouble(2, mensalidadeOK.getDesconto());
                ps.setString(3, mensalidadeOK.getVencimento());
                ps.setString(4, mensalidadeOK.getPagamento());
                ps.execute();
                con.close();
                return "Mensalidade Alterada com Sucesso";
            } catch (Exception e) {
                return "Erro ao Alterar Mensalidade";
            }
    }

    public String remover(Mensalidade mensalidade){
            PreparedStatement ps;

                try{
                    Mensalidade mensalidadeOK = (Mensalidade) mensalidade;
                    Connection con = (Connection) ConexaoDB.getInstance().getCon();
                    ps = (PreparedStatement) con.prepareStatement("DELETE FROM mensalidades WHERE codMensalidade ='"+mensalidadeOK.getCodigo()+"' ");
                    ps.execute();
                    con.close();
                    return "Mensalidade Removida com Sucesso";
                }catch (Exception e) {
                    e.printStackTrace();
                    return "Erro ao Remover Modalidade";
		}
    }

    public Vector<Mensalidade> pesquisaTodosAsMensalidadesDoAluno(int matricula){

          ResultSet rs;
	  PreparedStatement ps;
          Mensalidade m = null;
          Vector<Mensalidade> mensalidade = new Vector<Mensalidade>();

          try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
                ps = (PreparedStatement) con.prepareStatement("SELECT * FROM mensalidades WHERE matricula = '"+matricula+"'" );
                rs = ps.executeQuery();
                while(rs.next()){
                    long codMensalidade = rs.getInt("codMensalidade");
                    String nomeDoPlano = rs.getString("nomeDaModalidade");
                    double valor = rs.getDouble("valor");
                    double desconto = rs.getDouble("desconto");
                    String vencimento = rs.getString("vencimento");
                    String pagamento =rs.getString("pagamento");
                    m = new Mensalidade(codMensalidade,nomeDoPlano,valor,desconto,vencimento,pagamento);
                    mensalidade.add(m);
                }
                con.close();
          }
          catch (Exception e) {
              e.printStackTrace();
              System.out.print("ERRO");
          }

          return mensalidade;
    }




}
