
package br.sistcomp.sar.dominio;


public class Funcionario extends Pessoa {

    private String funcao;

    public Funcionario(int matricula, String nome, String email, String nascimento, String sexo, String cpf, String rgNumero, String rgUf, String endereco, String bairro, String cidade, String estado, String cep, String telefone, String celular, String observacoes, String dataCadastro, String funcao) {
        super(matricula,nome,email,nascimento,sexo,cpf,rgNumero,rgUf,endereco,bairro,cidade,estado,cep,telefone,celular,observacoes,dataCadastro);
        this.funcao = funcao;
    }

    public Funcionario(int matricula, String nome, String email, String nascimento, String sexo, String cpf, String rgNumero, String rgUf, String endereco, String bairro, String cidade, String estado, String cep, String telefone, String celular, String observacoes, String funcao) {
        super(matricula,nome,email,nascimento,sexo,cpf,rgNumero,rgUf,endereco,bairro,cidade,estado,cep,telefone,celular,observacoes);
        this.funcao = funcao;
    }

    public Funcionario(){

    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

}
