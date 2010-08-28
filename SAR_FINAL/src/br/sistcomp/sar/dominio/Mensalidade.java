
package br.sistcomp.sar.dominio;


public class Mensalidade extends Movimentacao {

    private Adesao adesao;

    public Mensalidade(int codMovimentacao, Funcionario funcionario, Double desconto, Double valor, String vencimento, String pagamento, String horaPgto, String tipo, Adesao adesao) {
        super(codMovimentacao, funcionario, desconto, valor, vencimento, pagamento, horaPgto, tipo);
        this.adesao = adesao;
    }

    public Mensalidade(Double valor, String vencimento, String tipo, Adesao adesao) {
        super(valor, vencimento, tipo);
        this.adesao = adesao;
    }

    public Mensalidade(Double valor, String vencimento, String tipo) {
        super(valor, vencimento, tipo);
    }

    public Mensalidade(){
        
    }

    public Adesao getAdesao() {
        return adesao;
    }

    public void setAdesao(Adesao adesao) {
        this.adesao = adesao;
    }

}
