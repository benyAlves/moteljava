
package br.sistcomp.sar.dominio;

/**
 *
 * @author Fillipe
 */
public class Transferencia extends Movimentacao{

    private String forma;
    private String historico;

    public Transferencia(int codMovimentacao, Funcionario funcionario, Double valor, String vencimento, String hora, String tipo, String forma, String historico) {
        super(codMovimentacao, funcionario, valor, vencimento, hora, tipo);
        this.forma = forma;
        this.historico = historico;
    }

    public Transferencia(){

    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

}
