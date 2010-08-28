
package br.sistcomp.sar.dominio;

/**
 *
 * @author Fillipe
 */
public class Transacao {

    private Caixa caixa;
    private Movimentacao movimentacao;

    public Transacao(Caixa caixa, Movimentacao movimentacao) {
        this.caixa = caixa;
        this.movimentacao = movimentacao;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public Movimentacao getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(Movimentacao movimentacao) {
        this.movimentacao = movimentacao;
    }

}
