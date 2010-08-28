/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistcomp.sar.dominio;

/**
 *
 * @author Fillipe
 */
public class Conta extends Movimentacao {

    private String descricao;
    private String pagamento;
    private Double desconto;

    public Conta(int codMovimentacao, Funcionario funcionario, Double valor, String vencimento, String hora, String tipo, String descricao, String pagamento, Double desconto) {
        super(codMovimentacao, funcionario, valor, vencimento, hora, tipo);
        this.descricao = descricao;
        this.pagamento = pagamento;
        this.desconto = desconto;
    }

    public Conta(){

    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
