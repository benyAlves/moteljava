

package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Utilitario;
import br.sistcomp.sar.dominio.Pessoa;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
//import java.util.Date;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago Ramalho
 */
public class PessoaDAO {

    private static PessoaDAO pessoaDAO;

    public static PessoaDAO getInstance() {
        synchronized (PessoaDAO.class) {
            if (pessoaDAO == null) {
                pessoaDAO = new PessoaDAO();
            }
        }
        return pessoaDAO;
    }

    //Método que cadastra pessoa no Banco de Dados
    public int cadastrar(Pessoa pessoa) {
        try {
            Pessoa pessoaOK = (Pessoa) pessoa;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("INSERT INTO PESSOAS "
                    + "(nome, email, nascimento, sexo, cpf, rgNumero, rgUf, endereco,"
                    + " bairro, cidade, estado, cep, telefone, celular, observacoes, dataCadastro)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            ps.setString(1, pessoaOK.getNome());
            ps.setString(2, pessoaOK.getEmail());
            ps.setDate(3, (java.sql.Date) Utilitario.converteStringParaDate(pessoaOK.getNascimento()));
            ps.setString(4, pessoaOK.getSexo());
            ps.setString(5, pessoaOK.getCpf());
            ps.setString(6, pessoaOK.getRgNumero());
            ps.setString(7, pessoaOK.getRgUf());
            ps.setString(8, pessoaOK.getEndereco());
            ps.setString(9, pessoaOK.getBairro());
            ps.setString(10, pessoaOK.getCidade());
            ps.setString(11, pessoaOK.getEstado());
            ps.setString(12, pessoaOK.getCep());
            ps.setString(13, pessoaOK.getTelefone());
            ps.setString(14, pessoaOK.getCelular());
            ps.setString(15, pessoaOK.getObservacoes());
            ps.setDate(16, (Date) Utilitario.converteStringParaDate(Utilitario.dataDoSistema()));
            ps.execute();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM PESSOAS p WHERE p.cpf = '" + pessoaOK.getCpf() + "'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int idPessoa = rs.getInt("idPessoa");
                con.close();
                return idPessoa;
            }
        } catch (Exception e) {
            e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
        }
        return 0; // se retornar 0 ocorre a exceção
    }

// Metodo que pesquisa aluno no banco de dados
    public Pessoa pesquisar(int idPessoa) {
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("SELECT * FROM PESSOAS p WHERE p.idPessoa = '" + idPessoa + "'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String nascimento = Utilitario.converteDateParaString(rs.getDate("nascimento"));
                String sexo = rs.getString("sexo");
                String cpf = rs.getString("cpf");
                String rgNumero = rs.getString("rgNumero");
                String rgUf = rs.getString("rgUf");
                String endereco = rs.getString("endereco");
                String bairro = rs.getString("bairro");
                String cidade = rs.getString("cidade");
                String estado = rs.getString("estado");
                String cep = rs.getString("cep");
                String telefone = rs.getString("telefone");
                String celular = rs.getString("celular");
                String observacoes = rs.getString("observacoes");
                String dataCadastro = Utilitario.converteDateParaString(rs.getDate("dataCadastro"));
                con.close();
                Pessoa pessoa = new Pessoa(idPessoa, nome, email, nascimento, sexo, cpf, rgNumero,rgUf, endereco, bairro, cidade, estado, cep, telefone, celular, observacoes, dataCadastro);
                return pessoa;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro no banco ao pesquisar aluno");
        }
        return null;
    }

    public Pessoa pesquisar(String nome) {
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("SELECT * FROM PESSOAS WHERE nome = '" + nome + "'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idPessoa = rs.getInt("idPessoa");
                String email = rs.getString("email");
                String nascimento = Utilitario.converteDateParaString(rs.getDate("nascimento"));
                String sexo = rs.getString("sexo");
                String cpf = rs.getString("cpf");
                String rgNumero = rs.getString("rgNumero");
                String rgUf = rs.getString("rgUf");
                String endereco = rs.getString("endereco");
                String bairro = rs.getString("bairro");
                String cidade = rs.getString("cidade");
                String estado = rs.getString("estado");
                String cep = rs.getString("cep");
                String telefone = rs.getString("telefone");
                String celular = rs.getString("celular");
                String observacoes = rs.getString("observacoes");
                String dataCadastro = Utilitario.converteDateParaString(rs.getDate("dataCadastro"));
                con.close();
                Pessoa pessoa = new Pessoa(idPessoa, nome, email, nascimento, sexo, cpf, rgNumero,rgUf, endereco, bairro, cidade, estado, cep, telefone, celular, observacoes, dataCadastro);
                return pessoa;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public Vector<Integer> pesquisarMatriculaPorNome(String nome) {
        Vector<Integer> idPessoas = new Vector<Integer>();
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("SELECT * FROM PESSOAS WHERE nome like '" + "%"+nome+"%"+ "'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idPessoa = rs.getInt("idPessoa");
                idPessoas.add(idPessoa);
            }
            con.close();
            return idPessoas;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return idPessoas;
    }

// Metodo que remove aluno no banco de dados
    public void remover(int matricula) {
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("DELETE FROM PESSOAS WHERE idPessoa ='" + matricula + "'");
            ps.execute();
            con.close();
            JOptionPane.showMessageDialog(null, "Professor removido com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao remover aluno");
        }


    }
// Metodo que faz atualização dos dados cadastrais do aluno no banco de dados

    public void alterar(Pessoa pessoa) {
        PreparedStatement ps;
        try {
            Pessoa pessoaOK = (Pessoa) pessoa;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("UPDATE PESSOAS set nome = ?, email = ?, nascimento = ?, "
                    + "sexo = ?, cpf = ?, rgNumero = ?, rgUf = ?, endereco = ?, bairro = ?, cidade = ?, "
                    + "estado = ?, cep = ?, telefone = ?, celular = ?, observacoes = ? WHERE idPessoa = '" + Utilitario.retornaIdPessoa(pessoa.getIdPessoa()) + "'");
            ps.setString(1, pessoaOK.getNome());
            ps.setString(2, pessoaOK.getEmail());
            ps.setDate(3, (java.sql.Date) (Date) Utilitario.converteStringParaDate(pessoaOK.getNascimento()));
            ps.setString(4, pessoaOK.getSexo());
            ps.setString(5, pessoaOK.getCpf());
            ps.setString(6, pessoaOK.getRgNumero());
            ps.setString(7, pessoaOK.getRgUf());
            ps.setString(8, pessoaOK.getEndereco());
            ps.setString(9, pessoaOK.getBairro());
            ps.setString(10, pessoaOK.getCidade());
            ps.setString(11, pessoaOK.getEstado());
            ps.setString(12, pessoaOK.getCep());
            ps.setString(13, pessoaOK.getTelefone());
            ps.setString(14, pessoaOK.getCelular());
            ps.setString(15, pessoaOK.getObservacoes());
            ps.execute();
            con.close();
            //JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro ao atualizar cadastro");
        }
    }

    public int proximaMatricula(){
        int proximaMatricula = -1;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("SHOW TABLE STATUS LIKE 'pessoas'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                proximaMatricula = rs.getInt("Auto_increment");
            }
            con.close();
            String matriculaCompleta = (proximaMatricula) + Utilitario.dataDoSistema().substring(3,5) + Utilitario.dataDoSistema().substring(8,10);
            proximaMatricula = Integer.parseInt(matriculaCompleta);
            return proximaMatricula;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
       return proximaMatricula;
    }
}
