
package br.sistcomp.sar.dominio;


public class Pessoa {

    private int idPessoa;
    private String nome;
    private String email;
    private String nascimento;
    private String sexo;
    private String cpf;
    private String rgNumero;
    private String rgUf;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    private String celular;
    private String observacoes;
    private String dataCadastro;

    public Pessoa (int idPessoa, String nome, String email, String nascimento,
            String sexo, String cpf, String rgNumero, String rgUf,
            String endereco, String bairro, String cidade, String estado,
            String cep, String telefone, String celular, String observacoes, String dataCadastro){
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rgNumero = rgNumero;
        this.rgUf = rgUf;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.celular = celular;
        this.observacoes = observacoes;
        this.dataCadastro = dataCadastro;
    }

        public Pessoa (int idPessoa, String nome, String email, String nascimento,
            String sexo, String cpf, String rgNumero, String rgUf,
            String endereco, String bairro, String cidade, String estado,
            String cep, String telefone, String celular, String observacoes){
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rgNumero = rgNumero;
        this.rgUf = rgUf;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.celular = celular;
        this.observacoes = observacoes;
    }

    public Pessoa(int matricula, String nome, String telefone) {
        this.idPessoa = matricula;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Pessoa(){
        
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setidPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getRgNumero() {
        return rgNumero;
    }

    public void setRgNumero(String rgNumero) {
        this.rgNumero = rgNumero;
    }

    public String getRgUf() {
        return rgUf;
    }

    public void setRgUf(String rgUf) {
        this.rgUf = rgUf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
