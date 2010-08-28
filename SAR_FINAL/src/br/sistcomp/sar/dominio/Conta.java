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

    public Conta(int codMovimentacao, Funcionario funcionario, Double desconto, Double valor, String vencimento, String pagamento, String horaPgto, String tipo, String descricao) {
        super(codMovimentacao, funcionario, desconto, valor, vencimento, pagamento, horaPgto, tipo);
        this.descricao = descricao;
    }

    public Conta(){

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
