
package br.sistcomp.sar.dominio;


import java.util.List;

public class Aluno extends Pessoa {

    private List<Plano> plano;
    private List<Mensalidade> mensalidade;
    private String indicacao;
    private String bolsista;

    public Aluno(int matricula, String nome, String email, String nascimento,
            String sexo, String cpf, String rgNumero, String rgUf,
            String endereco, String bairro, String cidade, String estado,
            String cep, String telefone, String celular, String observacoes,
            List<Plano> plano, List<Mensalidade> mensalidade,
            String dataCadastro, String indicacao, String bolsista) {
        super(matricula,nome,email,nascimento,sexo,cpf,rgNumero,rgUf,endereco,bairro,cidade,estado,cep,telefone,celular,observacoes,dataCadastro);
        this.plano = plano;
        this.mensalidade = mensalidade;
        this.indicacao = indicacao;
        this.bolsista = bolsista;
    }

    public Aluno(int matricula, String nome, String email, String nascimento, String sexo, String cpf, String rgNumero, String rgUf, String endereco, String bairro, String cidade, String estado, String cep, String telefone, String celular, String observacoes, String dataCadastro, List<Plano> plano, String indicacao, String bolsista) {
        super(matricula,nome,email,nascimento,sexo,cpf,rgNumero,rgUf,endereco,bairro,cidade,estado,cep,telefone,celular,observacoes,dataCadastro);
        this.plano = plano;
        this.indicacao = indicacao;
        this.bolsista = bolsista;
    }
    
    public Aluno(int matricula, String nome, String email, String nascimento,
            String sexo, String cpf, String rgNumero, String rgUf,
            String endereco, String bairro, String cidade, String estado,
            String cep, String telefone, String celular, String observacoes,
            List<Plano> plano, List<Mensalidade> mensalidade,
            String indicacao, String bolsista) {
        super(matricula,nome,email,nascimento,sexo,cpf,rgNumero,rgUf,endereco,bairro,cidade,estado,cep,telefone,celular,observacoes);
        this.plano = plano;
        this.mensalidade = mensalidade;
        this.indicacao = indicacao;
        this.bolsista = bolsista;
    }
    
    public String getBolsista() {
        return bolsista;
    }

    public void setBolsista(String bolsista) {
        this.bolsista = bolsista;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    public List<Mensalidade> getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(List<Mensalidade> mensalidade) {
        this.mensalidade = mensalidade;
    }

    public List<Plano> getPlano() {
        return plano;
    }

    public void setPlano(List<Plano> plano) {
        this.plano = plano;
    }

}
