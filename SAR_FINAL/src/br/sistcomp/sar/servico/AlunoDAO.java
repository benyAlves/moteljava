package br.sistcomp.sar.servico;

import br.sistcomp.sar.conexao.ConexaoDB;
import br.sistcomp.sar.dominio.Aluno;
import br.sistcomp.sar.dominio.Pessoa;
import br.sistcomp.sar.dominio.Turma;
import br.sistcomp.sar.dominio.Utilitario;
import br.sistcomp.sar.fachada.Fachada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

public class AlunoDAO {

    private static AlunoDAO alunoDAO;
    Fachada fachada = new Fachada();

    public static AlunoDAO getInstance() {
        synchronized (AlunoDAO.class) {
            if (alunoDAO == null) {
                alunoDAO = new AlunoDAO();
            }
        }
        return alunoDAO;
    }

// Metodo que cadastra a data do cadastro do aluno
    public void cadastrar(Aluno aluno) {

        try {
            Aluno alunoOK = (Aluno) aluno;
            int idPessoa = PessoaDAO.getInstance().cadastrar(aluno);
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("INSERT INTO ALUNOS "
                    + "(idPessoa, matricula, indicacao, bolsista)"
                    + " VALUES (?,?,?,?)");
            ps.setInt(1, idPessoa);
            ps.setInt(2, alunoOK.getIdPessoa());
            ps.setString(3, alunoOK.getIndicacao());
            ps.setString(4, alunoOK.getBolsista());
            ps.execute();
            con.close();
            JOptionPane.showMessageDialog(null, "Aluno Cadastrado com Sucesso!\nAnote sua matricula: " + alunoOK.getIdPessoa());
        } catch (Exception e) {
            e.printStackTrace(); // Sempre colocar o StackTrace, ajuda a identificar o erro.

        }
    }

    //Método que remove aluno completo
    public void remover(int matricula) {
        removerAluno(matricula);
        PessoaDAO.getInstance().remover(Utilitario.retornaIdPessoa(matricula));
    }
    //Método que pesquisa aluno completo

    public Aluno pesquisar(int matricula) {
        PessoaDAO pessoaDAO = PessoaDAO.getInstance();
        Pessoa p = pessoaDAO.pesquisar(Utilitario.retornaIdPessoa(matricula));
        ResultSet rs;
        PreparedStatement ps;
        String indicacao = null, bolsista = null;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT indicacao, bolsista "
                    + "FROM ALUNOS a WHERE a.matricula = '" + matricula + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                indicacao = rs.getString("indicacao");
                bolsista = rs.getString("bolsista");
                con.close();
                Aluno aluno = new Aluno(matricula, p.getNome(), p.getEmail(),
                p.getNascimento(), p.getSexo(), p.getCpf(), p.getRgNumero(),
                p.getRgUf(), p.getEndereco(), p.getBairro(), p.getCidade(),
                p.getEstado(), p.getCep(), p.getTelefone(), p.getCelular(),
                p.getObservacoes(),
                AdesaoDAO.getInstance().todasAdesoesDoAluno(matricula),
                p.getDataCadastro(), indicacao, bolsista);
                return aluno;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro no banco ao pesquisar aluno");
        }
        return null;
    }

    public Vector<Aluno> pesquisarPorNome(String nome) {

        ResultSet rs;
        PreparedStatement ps;
        String indicacao = null, bolsista = null;
        Vector<Aluno> todosAlunos = new Vector<Aluno>();
        for (Integer matricula : PessoaDAO.getInstance().pesquisarMatriculaPorNome(nome)) {
            Pessoa pessoa = PessoaDAO.getInstance().pesquisar(matricula);
            try {
                Connection con = (Connection) ConexaoDB.getInstance().getCon();
                ps = (PreparedStatement) con.prepareStatement("SELECT indicacao, bolsista "
                        + "FROM alunos a WHERE a.matricula = '" + Utilitario.retornaMatricula(matricula, pessoa.getDataCadastro())+ "'");
                rs = ps.executeQuery();
                while (rs.next()) {
                    indicacao = rs.getString("indicacao");
                    bolsista = rs.getString("bolsista");
                    

                    Aluno aluno = new Aluno(Utilitario.retornaMatricula(pessoa.getIdPessoa(), pessoa.getDataCadastro()), pessoa.getNome(), pessoa.getEmail(),
                            pessoa.getNascimento(), pessoa.getSexo(), pessoa.getCpf(), pessoa.getRgNumero(),
                            pessoa.getRgUf(), pessoa.getEndereco(), pessoa.getBairro(), pessoa.getCidade(),
                            pessoa.getEstado(), pessoa.getCep(), pessoa.getTelefone(), pessoa.getCelular(),
                            pessoa.getObservacoes(),
                            AdesaoDAO.getInstance().todasAdesoesDoAluno(Utilitario.retornaMatricula(pessoa.getIdPessoa(), pessoa.getDataCadastro())),
                            pessoa.getDataCadastro(), indicacao, bolsista);
                            todosAlunos.add(aluno);

                }
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro no banco ao pesquisar aluno");
            }
        }

        return todosAlunos;
    }

// Metodo que remove aluno no banco de dados
    public void removerAluno(int matricula) {
        PreparedStatement ps;
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = con.prepareStatement("DELETE FROM alunos WHERE matricula ='" + matricula + "'");
            ps.execute();
            con.close();
            JOptionPane.showMessageDialog(null, " Aluno removido com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao remover aluno");
        }
    }

    public String alterar(Aluno aluno) {
        PreparedStatement ps;
        PessoaDAO.getInstance().alterar(aluno);
        try {
            Aluno alunoOK = (Aluno) aluno;
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("UPDATE alunos set indicacao = ?, bolsista = ? WHERE matricula = '" + alunoOK.getIdPessoa() + "' ");
            ps.setString(1, alunoOK.getIndicacao());
            ps.setString(2, alunoOK.getBolsista());
            ps.execute();
            con.close();
            return "Aluno Alterado com Sucesso!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao Alterar Aluno!";
        }
    }

    public Vector<Pessoa> todosAlunos() {

        ResultSet rs, rs2;
        PreparedStatement ps, ps2;
        int matricula;
        String nome, telefone;
        Vector<Pessoa> pessoas = new Vector<Pessoa>();
        try {
            Connection con = (Connection) ConexaoDB.getInstance().getCon();
            ps = (PreparedStatement) con.prepareStatement("SELECT matricula FROM alunos");
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

    public List<Turma> turmasDoAluno(int matricula){
        List<Integer> codTurmas = AlunoTurmaDAO.getInstance().turmasDoAluno(matricula);
        List<Turma> turmas = new ArrayList<Turma>();
        Turma turma;
        for (int i: codTurmas){
            turma = TurmaDAO.getInstance().pesquisar(i);
            turmas.add(turma);
        }
        return turmas;
    }

}
