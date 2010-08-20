
package br.sistcomp.sar.dominio;


public class Funcionario extends Pessoa {

    private String senha;

    public Funcionario(int matricula, String nome, String email, String nascimento, String sexo, String cpf, String rgNumero, String rgUf, String endereco, String bairro, String cidade, String estado, String cep, String telefone, String celular, String observacoes, String dataCadastro, String senha) {
        super(matricula,nome,email,nascimento,sexo,cpf,rgNumero,rgUf,endereco,bairro,cidade,estado,cep,telefone,celular,observacoes,dataCadastro);
        this.senha = senha;
    }

    public Funcionario(int matricula, String nome, String email, String nascimento, String sexo, String cpf, String rgNumero, String rgUf, String endereco, String bairro, String cidade, String estado, String cep, String telefone, String celular, String observacoes, String senha) {
        super(matricula,nome,email,nascimento,sexo,cpf,rgNumero,rgUf,endereco,bairro,cidade,estado,cep,telefone,celular,observacoes);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
