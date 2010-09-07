package br.sistcomp.sar.fachada;

import br.sistcomp.sar.GUI.TelaCadastroAluno;
import br.sistcomp.sar.GUI.TelaCadastroFuncionario;
import br.sistcomp.sar.GUI.TelaCadastroProfessor;
import br.sistcomp.sar.GUI.TelaLogin;
import br.sistcomp.sar.GUI.TelaWebCam;
import br.sistcomp.sar.dominio.*;
import br.sistcomp.sar.servico.*;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author thiagopnts
 */
public class Fachada {

    public void cadastraAluno(Aluno aluno) {
        AlunoDAO.getInstance().cadastrar(aluno);
        for (Adesao adesao : aluno.getAdesoes()) {
            int codAdesao = AdesaoDAO.getInstance().aderirPlano(aluno.getIdPessoa(), adesao);
            //AlunoTurmaDAO.getInstance().insereAlunoNaTurma(aluno.getIdPessoa(), adesao.getTurma().getCodigo(), codAdesao);
            for (Mensalidade mensalidade : adesao.getMensalidades()) {
                adesao.setCodAdesao(codAdesao);
                mensalidade.setAdesao(adesao);
                MensalidadeDAO.getInstance().cadastrar(mensalidade);
            }
        }

        if (TelaWebCam.teste == true) {
            ImagemDAO.getInstance().inserirFotoWeb(aluno.getIdPessoa());
        } else {
            ImagemDAO.getInstance().inserirFotoArquivo(aluno.getIdPessoa(), TelaCadastroAluno.file);
        }
    }

    public void inserirAdesao(int matricula, Adesao adesao) {
        int codAdesao = AdesaoDAO.getInstance().aderirPlano(matricula, adesao);
        //AlunoTurmaDAO.getInstance().insereAlunoNaTurma(matricula, adesao.getTurma().getCodigo(), codAdesao);
        for (Mensalidade mensalidade : adesao.getMensalidades()) {
            adesao.setCodAdesao(codAdesao);
            mensalidade.setAdesao(adesao);
            MensalidadeDAO.getInstance().cadastrar(mensalidade);
        }
    }

    public void removerAdesao(int codAdesao) {
        MensalidadeDAO.getInstance().remover(codAdesao);
        //AlunoTurmaDAO.getInstance().removeAlunoDaTurma(codAdesao);
        AdesaoDAO.getInstance().remover(codAdesao);
    }

    public void trocarTurma(int codAdesao, int codTurma) {
        AdesaoDAO.getInstance().trocarTurma(codAdesao, codTurma);
    }

    public void editarAluno(Aluno aluno) {
        AlunoDAO.getInstance().alterar(aluno);
        if (TelaWebCam.teste == true) {
            ImagemDAO.getInstance().alterarFoto(aluno.getIdPessoa());
        }
    }

    public void cadastrarProfessor(Professor professor) {
        ProfessorDAO.getInstance().cadastrar(professor);
        if (TelaWebCam.teste == true) {
            ImagemDAO.getInstance().inserirFotoWeb(professor.getIdPessoa());
        } else {
            ImagemDAO.getInstance().inserirFotoArquivo(professor.getIdPessoa(), TelaCadastroProfessor.file);
        }
    }
    // Pesquisa matricula do professor passando o codigo da modadlidade

    public int pesquidaMatriculaPorCodModalidade(int codigo) {
        return ProfessorDAO.getInstance().pesquisarMatricula(codigo);
    }

    public void removerProfessor(int matricula) {
        ProfessorDAO.getInstance().remover(matricula);
    }

    public int alunosAtivos() {
        return AdesaoDAO.getInstance().alunosAtivos();
    }

    public Vector<Integer> todosFuncionarioAtivos() {
        return FuncionarioDAO.getInstance().todosFuncionariosAtivos();
    }

    public void removerPlano(String nome) {
        PlanoDAO.getInstance().remover(nome);
    }

    public int professoresAtivos() {
        return ProfessorDAO.getInstance().pesquisaProfessoresAtivos();
    }

    public Vector<Pessoa> todosProfessores() {
        return ProfessorDAO.getInstance().todosProfessores();
    }

    public Vector<Pessoa> todosFuncionarios() {
        return FuncionarioDAO.getInstance().todosFuncionario();
    }

    public void removerTurma(Turma turma) {
        TurmaDAO.getInstance().remover(turma);
    }

    public void removerModalidade(String nome) {
        ModalidadeDAO.getInstance().remover(nome);
    }

    public void cadastrarfuncionario(Funcionario funcionario) {
        FuncionarioDAO.getInstance().cadastrar(funcionario);
        if (TelaWebCam.teste == true) {
            ImagemDAO.getInstance().inserirFotoWeb(funcionario.getIdPessoa());
        } else {
            ImagemDAO.getInstance().inserirFotoArquivo(funcionario.getIdPessoa(), TelaCadastroFuncionario.file);
        }
    }

    public Professor pesquisarProfessorPorNome(String nome) {
        return ProfessorDAO.getInstance().pesquisar(nome);
    }

    public Professor pesquisarProfessorPorMatricula(int matricula) {
        return ProfessorDAO.getInstance().pesquisar(matricula);
    }

    public void editarProfessor(Professor professor) {
        ProfessorDAO.getInstance().alterar(professor);
        if (TelaWebCam.teste == true) {
            ImagemDAO.getInstance().alterarFoto(professor.getIdPessoa());
        }
    }

    public Aluno pesquisarAluno(int matricula) {
        return AlunoDAO.getInstance().pesquisar(matricula);
    }

    public Vector<Aluno> pesquisarAlunoPorNome(String nome) {
        return AlunoDAO.getInstance().pesquisarPorNome(nome);
    }

    public Funcionario pesquisaFuncionarioPelaMatricula(int matricula) {
        return FuncionarioDAO.getInstance().pesquisaFuncionario(matricula);
    }

    public void alteraFuncionario(Funcionario funcionario) {
        FuncionarioDAO.getInstance().alteraFuncionario(funcionario);
        if (TelaWebCam.teste == true) {
            ImagemDAO.getInstance().alterarFoto(Utilitario.retornaIdPessoa(funcionario.getIdPessoa()));
        }
    }

    public void editarTurma(Turma turma) {
        TurmaDAO.getInstance().alterar(turma);
    }

    public Vector<Pessoa> todosAlunos() {

        return AlunoDAO.getInstance().todosAlunos();
    }

    public Vector<Mensalidade> pesquisaTodosAsMensalidadesDoAluno(int matricula) {
        return MensalidadeDAO.getInstance().todasMensalidadesDoAluno(matricula);
    }

    public Vector<String> getNomesModalidades() {
        return ModalidadeDAO.getInstance().getNomesModalidades();
    }

    public Modalidade getModalidade(String nome) {
        return ModalidadeDAO.getInstance().getModalidades(nome);
    }

    public Vector<Turma> todasTumas() {
        return TurmaDAO.getInstance().todasTurmas();
    }

    public void cadastrarModalidade(Modalidade modalidade) {
        ModalidadeDAO.getInstance().cadastrar(modalidade);
    }

    public void editarModalidade(Modalidade modalidade) {
        ModalidadeDAO.getInstance().alterar(modalidade);
    }

    public void editarPlano(Plano plano) {
        PlanoDAO.getInstance().alterar(plano);
    }

    public int getProximaMatricula() {
        return PessoaDAO.getInstance().proximaMatricula();
    }

    public ImageIcon pesquisarFoto(int matricula) {
        return ImagemDAO.getInstance().pesquisarFoto(matricula);
    }

    public void removerFoto(int matricula) {
        ImagemDAO.getInstance().removerImagem(matricula);
    }

    public Vector<Plano> todosOsPlanos() {
        return PlanoDAO.getInstance().TodosOsPlanos();
    }

    public void cadastrarTurma(Turma turma) {
        TurmaDAO.getInstance().cadastrar(turma);
    }

    public void cadastrarPlano(Plano plano) {
        PlanoDAO.getInstance().cadastrar(plano);
    }

    public int proximoCodigo() {
        return PlanoDAO.getInstance().proximoCodigo();
    }

    public int proximoCodigoTurma() {
        return TurmaDAO.getInstance().proximoCodigo();
    }

    public Vector<String> getProfessorPorModalidade(String nome) {
        return ProfessorDAO.getInstance().professoresPorModalidade(nome);
    }

    public Vector<String> planoPorModalidade(String nome) {
        return PlanoDAO.getInstance().planoPorModalidade(nome);
    }

    public List<Turma> turmasPorProfessor(String nome) {
        return TurmaDAO.getInstance().turmaPorProfessor(nome);
    }

    public Plano pesquisarPlano(String nomePlano) {
        return PlanoDAO.getInstance().pesquisar(nomePlano);
    }

    public Turma pesquisarTurma(int codTurma) {
        return TurmaDAO.getInstance().pesquisar(codTurma);
    }

    public double valorPorNome(String nomePlano) {
        return PlanoDAO.getInstance().pesquisarValor(nomePlano);
    }

    public int duracaoPorNome(String nomePlano) {
        return PlanoDAO.getInstance().pesquisarDuracao(nomePlano);
    }

    public int proximoCodigoModalidade() {
        return ModalidadeDAO.getInstance().proximoCodigo();
    }

    public int proximoCodigoAdesao() {
        return AdesaoDAO.getInstance().proximoCodigo();
    }

    public void abrirCaixa() {
        CaixaDAO.getInstance().abrirCaixa();
    }

    public static boolean verificaStatus() {
        return CaixaDAO.getInstance().verificaStatus();
    }

    public void fecharCaixa() {
        CaixaDAO.getInstance().fecharCaixa();
    }

    public void retirada(Caixa caixa, Transferencia transferencia) {
        TransferenciaDAO.getInstance().cadastrar(transferencia);
        TransacaoDAO.getInstance().cadastrar(caixa, transferencia);
        CaixaDAO.getInstance().alterarSaldo(caixa, -transferencia.getValor());
    }

    public void suprimento(Caixa caixa, Transferencia transferencia) {
        TransferenciaDAO.getInstance().cadastrar(transferencia);
        TransacaoDAO.getInstance().cadastrar(caixa, transferencia);
        CaixaDAO.getInstance().alterarSaldo(caixa, transferencia.getValor());
    }

    public void pagarConta(Caixa caixa, Conta conta) {
        ContaDAO.getInstance().alterar(conta);
        TransacaoDAO.getInstance().cadastrar(caixa, conta);
        CaixaDAO.getInstance().alterarSaldo(caixa, -conta.getValor());
    }

    public void receberMensalidade(Caixa caixa, Mensalidade mensalidade) {
        MensalidadeDAO.getInstance().alterar(mensalidade);
        TransacaoDAO.getInstance().cadastrar(caixa, mensalidade);
        CaixaDAO.getInstance().alterarSaldo(caixa, mensalidade.getValor());
    }

//    public boolean pesquisarStatusDoCaixa(Caixa caixa) {
//        return CaixaDAO.getInstance().pesquisarStatusDoCaixa(caixa);
//    }
    public void lancarConta(Conta conta) {
        ContaDAO.getInstance().cadastrar(conta);
    }

    public Boolean liberarExclusaoModalidade(int codModalidade) {
        Boolean plano = PlanoDAO.getInstance().liberarExclusaoModalidade(codModalidade);
        Boolean professor = ProfessorDAO.getInstance().liberarExclusaoModalidade(codModalidade);
        if (plano && professor) {
            return true;
        }
        return false;
    }

    public Boolean liberarExclusaoTurma(int codTurma) {
        return AdesaoDAO.getInstance().liberarExclusaoTurma(codTurma);
    }

    public Boolean liberarExclusaoPlano(int codPlano) {
        return AdesaoDAO.getInstance().liberarExclusaoPlano(codPlano);
    }

    public Boolean liberarExclusaoAdesao(int codAdesao) {
        return MensalidadeDAO.getInstance().liberarExclusaoAdesao(codAdesao);
    }

    public Boolean login(int matricula) {
        if (FuncionarioDAO.getInstance().logarFuncionario(matricula)) {
            return true;
        }
        return false;
    }

    public static Pessoa funcionarioLogado() {
        return FuncionarioDAO.getInstance().pesquisaFuncionario(TelaLogin.matricula);
    }

    public Vector<Pessoa> aniversariantes() {
        return PessoaDAO.getInstance().aniversariantes();
    }

    public JasperPrint relatorioAniversariantes(int mes) throws Exception {
        return RelatorioDAO.getInstance().relatorioAniversariantes(mes);
    }

    public JasperPrint relatorioTodosAlunos(String tipo) throws Exception {
        return RelatorioDAO.getInstance().relatorioTodosAlunos(tipo);
    }

    public JasperPrint relatorioModalidade(String modalidade) throws Exception {
        return RelatorioDAO.getInstance().relatorioModalidade(modalidade);
    }

    public JasperPrint relatorioBolsista(String tipo) throws Exception {
        return RelatorioDAO.getInstance().relatorioBolsista(tipo);
    }

    public JasperPrint relatorioPlanosVencidos() throws Exception {
        return RelatorioDAO.getInstance().relatorioPlanosVencidos();
    }

    public JasperPrint relatorioHorario(String horaInicio) throws Exception {
        return RelatorioDAO.getInstance().relatorioHorario(horaInicio);
    }

    public JasperPrint relatorioIdade(String idadeInicial, String idadeFinal) throws Exception {
        return RelatorioDAO.getInstance().relatorioIdade(idadeInicial, idadeFinal);
    }
}
