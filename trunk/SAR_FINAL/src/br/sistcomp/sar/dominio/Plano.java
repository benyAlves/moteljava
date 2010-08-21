
package br.sistcomp.sar.dominio;

import java.util.List;


public class Plano {

    private int codigo;
    private String nome;
    private int duracao;
    private double valor;
    private Modalidade modalidade;
    private String status;
    private String diaDoPagamento;
    private int numeroDeParcelas;
    private Double desconto;
    private List<Mensalidade> mensalidades;
    private String formaPagamento;


    public Plano(int codigo, String nome, int duracao, double valor, Modalidade modalidade, String status) {
        this.codigo = codigo;
        this.nome = nome;
        this.duracao = duracao;
        this.valor = valor;
        this.modalidade = modalidade;
        this.status = status;
    }

    public Plano(int codigo, String nome, int duracao, double valor, Modalidade modalidade, String status, String diaDoPagamento, int numeroDeParcelas, Double desconto) {
        this.codigo = codigo;
        this.nome = nome;
        this.duracao = duracao;
        this.valor = valor;
        this.modalidade = modalidade;
        this.status = status;
        this.diaDoPagamento = diaDoPagamento;
        this.numeroDeParcelas = numeroDeParcelas;
        this.desconto = desconto;
    }

    public Plano(int codigo, String nome, int duracao, double valor, Modalidade modalidade, String status, String diaDoPagamento, int numeroDeParcelas, Double desconto, List<Mensalidade> mensalidades, String formaPagamento) {
        this.codigo = codigo;
        this.nome = nome;
        this.duracao = duracao;
        this.valor = valor;
        this.modalidade = modalidade;
        this.status = status;
        this.diaDoPagamento = diaDoPagamento;
        this.numeroDeParcelas = numeroDeParcelas;
        this.desconto = desconto;
        this.mensalidades = mensalidades;
        this.formaPagamento = formaPagamento;
    }

    public Plano(int codigo, double valor, int numeroDeParcelas, Double desconto, String formaPagamento, String diaDoPagamento) {
        this.codigo = codigo;
        this.valor = valor;
        this.numeroDeParcelas = numeroDeParcelas;
        this.desconto = desconto;
        this.formaPagamento = formaPagamento;
        this.diaDoPagamento = diaDoPagamento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public List<Mensalidade> getMensalidades() {
        return mensalidades;
    }

    public void setMensalidades(List<Mensalidade> mensalidades) {
        this.mensalidades = mensalidades;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
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
