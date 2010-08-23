
package br.sistcomp.sar.dominio;


import java.util.List;

public class Aluno extends Pessoa {

    private List<Adesao> adesoes;
    private String indicacao;
    private String bolsista;

    public Aluno(int matricula, String nome, String email, String nascimento, String sexo, String cpf, String rgNumero, String rgUf, String endereco, String bairro, String cidade, String estado, String cep, String telefone, String celular, String observacoes, List<Adesao> adesoes, String dataCadastro,String indicacao, String bolsista) {
        super(matricula,nome,email,nascimento,sexo,cpf,rgNumero,rgUf,endereco,bairro,cidade,estado,cep,telefone,celular,observacoes,dataCadastro);
        this.adesoes = adesoes;
        this.indicacao = indicacao;
        this.bolsista = bolsista;
    }

    public Aluno(int matricula, String nome, String email, String nascimento, String sexo, String cpf, String rgNumero, String rgUf, String endereco, String bairro, String cidade, String estado, String cep, String telefone, String celular, String observacoes, List<Adesao> adesoes, String indicacao, String bolsista) {
        super(matricula,nome,email,nascimento,sexo,cpf,rgNumero,rgUf,endereco,bairro,cidade,estado,cep,telefone,celular,observacoes);
        this.adesoes = adesoes;
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

    public List<Adesao> getAdesoes() {
        return adesoes;
    }

    public void setAdesoes(List<Adesao> adesoes) {
        this.adesoes = adesoes;
    }

}
