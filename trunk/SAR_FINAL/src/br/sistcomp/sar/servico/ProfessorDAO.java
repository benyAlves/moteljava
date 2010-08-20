package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Pessoa;
import br.sistcomp.sar.dominio.Professor;
import br.sistcomp.sar.dominio.Utilitario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.lang.String;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

public class ProfessorDAO {

    private static ProfessorDAO professorDAO;

    public static ProfessorDAO getInstance() {
        synchronized (ProfessorDAO.class) {
            if (professorDAO == null) {
                professorDAO = new ProfessorDAO();
            }
        }
        return professorDAO;
    }

    public void cadastrar(Professor professor) {
        PreparedStatement ps;
        try {
            Professor professorOK = (Professor) professor;
            int idPessoa = PessoaDAO.getInstance().cadastrar(professorOK);
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO PROFESSORES "
                    + "(matricula, codModalidade)"
                    + " VALUES (?,?)");
            ps.setInt(1, professorOK.getIdPessoa());
            ps.setInt(2, professorOK.getModalidade().getCodigo());
            ps.execute();
            con.close();
            JOptionPane.showMessageDialog(null, "Professor Cadastrado com Sucesso!");
        } catch (Exception e) {
            e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Professor");
        }
    }

    // Metodo que remove o objeto pessoa(professor) e sua modalidade
    public void remover(int matricula) {
        
        removerModalidade(matricula);
        PessoaDAO.getInstance().remover(Utilitario.retornaIdPessoa(matricula));
    }
    // Metodo que edita o objeto pessoa(professor) e sua modalidade

    public void alterar(Professor professor) {
        PessoaDAO pessoaDAO = PessoaDAO.getInstance();
        alterarModalidade(professor);
        pessoaDAO.alterar(professor);
    }

    //Método que pesquisa e retorna um objeto do tipo professor atraves da sua matricula
    public Professor pesquisar(int matricula) {
        Pessoa pessoa = PessoaDAO.getInstance().pesquisar(Utilitario.retornaIdPessoa(matricula));
        // obtem a modalidade que o professor está matriculado
        Professor professor = new Professor(matricula, pessoa.getNome(),
                pessoa.getEmail(), pessoa.getNascimento(), pessoa.getSexo(), pessoa.getCpf(),
                pessoa.getRgNumero(), pessoa.getRgUf(), pessoa.getEndereco(), pessoa.getBairro(),
                pessoa.getCidade(), pessoa.getEstado(), pessoa.getCep(), pessoa.getTelefone(),
                pessoa.getCelular(), pessoa.getObservacoes(), pessoa.getDataCadastro(), ModalidadeDAO.getInstance().pesquisar(pesquisarCodModalidade(matricula)));
        return professor;
    }

    public Professor pesquisar(String nome) {
        Pessoa pessoa = PessoaDAO.getInstance().pesquisar(nome);
        // obtem a modalidade que o professor está matriculado
        int matricula = Utilitario.retornaMatricula(pessoa.getIdPessoa(), pessoa.getDataCadastro());
        Professor professor = new Professor(matricula, pessoa.getNome(),
                pessoa.getEmail(), pessoa.getNascimento(), pessoa.getSexo(), pessoa.getCpf(),
                pessoa.getRgNumero(), pessoa.getRgUf(), pessoa.getEndereco(), pessoa.getBairro(),
                pessoa.getCidade(), pessoa.getEstado(), pessoa.getCep(), pessoa.getTelefone(),
                pessoa.getCelular(), pessoa.getObservacoes(), pessoa.getDataCadastro(), ModalidadeDAO.getInstance().pesquisar(pesquisarCodModalidade(nome)));
        return professor;
    }

    //Método que remove modalidade de um professor no Banco de Dados
    public void removerModalidade(int matricula) {
        PreparedStatement ps;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM professores WHERE matricula ='" + matricula + "'");
            ps.execute();
            con.close();
            //JOptionPane.showMessageDialog(null, " Aluno removido com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }

    //Método que pesquisa modalidade de um professor no Banco de Dados
    public int pesquisarCodModalidade(int matricula) {

        ResultSet rs;
        PreparedStatement ps;
        int cod_modalidade = -1;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT codModalidade FROM professores p WHERE p.matricula = '" + matricula + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                cod_modalidade = rs.getInt("codModalidade");
                if (cod_modalidade == -1) {
                    break;
                }
                con.close();
                return cod_modalidade;
            }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return -1;

    }

    public int pesquisaProfessoresAtivos() {
        ResultSet rs;
        PreparedStatement ps;
        int qtde = 0;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT count(distinct matricula) FROM turmas ");
            rs = ps.executeQuery();
            while (rs.next()) {
                qtde = rs.getInt("count(distinct matricula)");
            }
            con.close();
            return qtde;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return qtde;
    }

    public int pesquisarCodModalidade(String nomeDoProfessor) {

        ResultSet rs, rs2;
        PreparedStatement ps, ps2;
        int codModalidade = -1;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT idPessoa, dataCadastro FROM PESSOAS WHERE nome = '" + nomeDoProfessor + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                int idPessoa = rs.getInt("idPessoa");
                String dataCadastro = Utilitario.converteDateParaString(rs.getDate("dataCadastro"));
                ps2 = (PreparedStatement) con.prepareStatement("SELECT codModalidade FROM PROFESSORES WHERE matricula = '" + Utilitario.retornaMatricula(idPessoa, dataCadastro)+"'");
                rs2 = ps2.executeQuery();
                while (rs2.next()) {
                    codModalidade = rs2.getInt("codModalidade");
                    con.close();
                    return codModalidade;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return -1;

    }

    public int pesquisarMatricula(int codModalidade) {

        ResultSet rs;
        PreparedStatement ps;
        int matricula = -1;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT matricula FROM PROFESSORES WHERE codModalidade = '" + codModalidade + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                matricula = rs.getInt("matricula");
            }
            con.close();
            return matricula;

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "o erro tah aki");
        }
        return -1;

    }

    public String alterarModalidade(Professor professor) {
        PreparedStatement ps;
        try {
            Professor professorOK = (Professor) professor;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("UPDATE professores set codModalidade = ? WHERE matricula = '" + professorOK.getIdPessoa() + "'");
            ps.setInt(1, professorOK.getModalidade().getCodigo());
            ps.execute();
            con.close();
            return "Código da modalidade alterado com sucesso";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao alterar o código da modalidade";
        }
    }

    public Vector<String> professoresPorModalidade(String nomeModalidade) {
        ResultSet rs, rs2;
        PreparedStatement ps, ps2;
        Vector<String> professores = new Vector<String>();
        Professor professor = null;
        String nomePessoa = "";
        int matricula, codModalidade = -1;

        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();

            ps = (PreparedStatement) con.prepareStatement("SELECT matricula FROM professores WHERE codModalidade = '"
                    + ModalidadeDAO.getInstance().getModalidades(nomeModalidade).getCodigo() + "'");
            rs = ps.executeQuery();

            while (rs.next()) {
                matricula = rs.getInt("matricula");
                ps2 = (PreparedStatement) con.prepareStatement("SELECT nome FROM PESSOAS p WHERE p.idPessoa = '"
                        + Utilitario.retornaIdPessoa(matricula) + "'");
                rs2 = ps2.executeQuery();

                while (rs2.next()) {
                    nomePessoa = rs2.getString("nome");
                }
                professores.add(nomePessoa);

            }
            con.close();
            return professores;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return professores; //tratar exceção
    }

    public Vector<Pessoa> todosProfessores() {

        ResultSet rs, rs2;
        PreparedStatement ps, ps2;
        int matricula;
        String nome, telefone;
        Vector<Pessoa> pessoas = new Vector<Pessoa>();
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT matricula "
                    + "FROM professores ");
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
