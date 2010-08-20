
package br.sistcomp.sar.dominio;


public class Plano {

    private int codigo;
    private String nome;
    private int duracao;
    private double valor;
    private Modalidade modalidade;
    private String status;
    private String diaDoPagamento;
    private int numeroDeParcelas;


    public Plano(int codigo, String nome, int duracao, double valor, Modalidade modalidade, String status) {
        this.codigo = codigo;
        this.nome = nome;
        this.duracao = duracao;
        this.valor = valor;
        this.modalidade = modalidade;
        this.status = status;
    }

    public Plano(int codigo, String nome, int duracao, double valor, Modalidade modalidade, String status, String diaDoPagamento, int numeroDeParcelas) {
        this.codigo = codigo;
        this.nome = nome;
        this.duracao = duracao;
        this.valor = valor;
        this.modalidade = modalidade;
        this.status = status;
        this.diaDoPagamento = diaDoPagamento;
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public String getDiaDoPagamento() {
        return diaDoPagamento;
    }

    public void setDiaDoPagamento(String diaDoPagamento) {
        this.diaDoPagamento = diaDoPagamento;
    }

    public int getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(int numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
