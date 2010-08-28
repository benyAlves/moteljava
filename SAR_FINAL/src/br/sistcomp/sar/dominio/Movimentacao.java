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
    private Double desconto;
    private Double valor;
    private String vencimento;
    private String pagamento;
    private String horaPgto;
    private String tipo;

    public Movimentacao(int codMovimentacao, Funcionario funcionario, Double desconto, Double valor, String vencimento, String pagamento, String horaPgto, String tipo) {
        this.codMovimentacao = codMovimentacao;
        this.funcionario = funcionario;
        this.desconto = desconto;
        this.valor = valor;
        this.vencimento = vencimento;
        this.pagamento = pagamento;
        this.horaPgto = horaPgto;
        this.tipo = tipo;
    }

    public Movimentacao(Double valor, String vencimento, String tipo) {
        this.valor = valor;
        this.vencimento = vencimento;
        this.tipo = tipo;
    }

    public Movimentacao(){
        
    }

    public int getCodMovimentacao() {
        return codMovimentacao;
    }

    public void setCodMovimentacao(int codMovimentacao) {
        this.codMovimentacao = codMovimentacao;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getHoraPgto() {
        return horaPgto;
    }

    public void setHoraPgto(String horaPgto) {
        this.horaPgto = horaPgto;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
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
