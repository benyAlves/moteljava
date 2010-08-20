package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Pessoa;
import br.sistcomp.sar.dominio.Funcionario;
import br.sistcomp.sar.dominio.Utilitario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

public class FuncionarioDAO {

    private static FuncionarioDAO secretariaDAO;

    public static FuncionarioDAO getInstance() {
        synchronized (FuncionarioDAO.class) {
            if (secretariaDAO == null) {
                secretariaDAO = new FuncionarioDAO();
            }
        }
        return secretariaDAO;
    }

    public void cadastrarSenhaSecretaria(Pessoa pessoa, String senha) {
        PreparedStatement ps;
        try {
            int idPessoa = PessoaDAO.getInstance().cadastrar(pessoa);
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO SECRETARIAS "
                    + "(matricula, senha)"
                    + " VALUES (?,?)");
            ps.setInt(1, pessoa.getIdPessoa());
            ps.setString(2, senha);
            ps.execute();
            con.close();
            JOptionPane.showMessageDialog(null, "Funcionário(a) Cadastrado(a) com Sucesso!");
        } catch (Exception e) {
            e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Funcionário(a)!");
        }
    }

    //Metodo que pesquisa que o nome da pessoa que fez a indicação do aluno para a academia. Esse método pode retornar NULL.
    public String pesquisarSenhaSecretaria(int matricula) {

        ResultSet rs;
        PreparedStatement ps;
        String senha = null;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT senha FROM secretarias s WHERE s.matricula = '" + matricula + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                senha = rs.getString("senha");
                if (senha.equals("")) {
                    break;
                }
                con.close();
                return senha;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro no banco ao pesquisar senha");
        }
        return null;

    }

    public void removerSenhaSecretaria(int matricula) {

        PreparedStatement ps;

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM secretarias WHERE matricula ='" + matricula + "'");
            ps.execute();
            con.close();
            JOptionPane.showMessageDialog(null, "Senha removido com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao remover Senha");
        }
    }

    public String alterarSenhaSecretaria(int matricula, String senha) {
        PreparedStatement ps;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("UPDATE secretarias set senha = ? WHERE matricula = '" + matricula + "' ");
            ps.setString(1, senha);
            ps.execute();
            con.close();
            return "Senha alterado com sucesso";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao alterar o senha";
        }
    }

    public Vector<Integer> todosFuncionariosAtivos() {
        ResultSet rs;
        PreparedStatement ps;
        Vector<Integer> funcionarios = new Vector<Integer>();
        int matricula = 0;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT matricula FROM secretarias ");
            rs = ps.executeQuery();
            while (rs.next()) {
                matricula = rs.getInt("matricula");
                funcionarios.add(matricula);
            }
            con.close();
            return funcionarios;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return funcionarios;
    }

   
    //Método que remove senha da secretaria
    public void removerSecretaria(int matricula) {
        removerSenhaSecretaria(matricula);
        PessoaDAO.getInstance().remover(matricula);
    }

    public void alteraFuncionario(Pessoa pessoa, String senha) {
        alterarSenhaSecretaria(pessoa.getIdPessoa(), senha);
        PessoaDAO.getInstance().alterar(pessoa);
    }

    public Funcionario pesquisaFuncionario(int matricula) {
        PessoaDAO pessoaDAO = PessoaDAO.getInstance();
        Pessoa pessoa = pessoaDAO.pesquisar(Utilitario.retornaIdPessoa(matricula));
        Funcionario secretaria = new Funcionario(matricula, pessoa.getNome(), pessoa.getEmail(),
                pessoa.getNascimento(), pessoa.getSexo(), pessoa.getCpf(), pessoa.getRgNumero(), pessoa.getRgUf(),
                pessoa.getEndereco(), pessoa.getBairro(), pessoa.getCidade(), pessoa.getEstado(),
                pessoa.getCep(), pessoa.getTelefone(), pessoa.getCelular(), pessoa.getObservacoes(), pessoa.getDataCadastro(), pesquisarSenhaSecretaria(matricula));
        return secretaria;
    }

     public Vector<Pessoa> todosFuncionario() {

        ResultSet rs, rs2;
        PreparedStatement ps, ps2;
        int matricula;
        String nome, telefone;
        Vector<Pessoa> pessoas = new Vector<Pessoa>();
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT matricula "
                    + "FROM secretarias ");
            rs = ps.executeQuery();
            while (rs.next()) {
                matricula = rs.getInt("matricula");
                if (matricula == 0) {
                    break;
                } else {
                    ps2 = (PreparedStatement) con.prepareStatement("SELECT nome, telefone "
                            + "FROM pessoas p where p.idPessoa ='" + Utilitario.retornaIdPessoa(matricula) + "'");
                    rs2 = ps2.executeQuery();
                    while (rs2.next()) {
                        nome = rs2.getString("nome");
                        telefone = rs2.getString("telefone");
                        if (nome.equals("")) {
                            break;
                        } else {
                            Pessoa pessoa = new Pessoa(matricula, nome, telefone);
                            pessoas.add(pessoa);
                        }
                    }
                }

            }
            con.close();
            return pessoas;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro no banco ao pesquisar alunos");
        }
        return pessoas;
    }

    
}
