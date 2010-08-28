/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistcomp.sar.dominio;

/**
 *
 * @author Fillipe
 */
public class Movimentacao {

    private int codMovimentacao;
    private Funcionario funcionario;
    private Double valor;
    private String vencimento;
    private String hora;
    private String tipo;

    public Movimentacao(int codMovimentacao, Funcionario funcionario, Double valor, String vencimento, String hora, String tipo) {
        this.codMovimentacao = codMovimentacao;
        this.funcionario = funcionario;
        this.valor = valor;
        this.vencimento = vencimento;
        this.hora = hora;
        this.tipo = tipo;
    }

    public Movimentacao(Double valor, String vencimento, String tipo) {
        this.valor = valor;
        this.vencimento = vencimento;
        this.tipo = tipo;
    }

    public Movimentacao(){
        
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getCodMovimentacao() {
        return codMovimentacao;
    }

    public void setCodMovimentacao(int codMovimentacao) {
        this.codMovimentacao = codMovimentacao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

}
