
package br.sistcomp.sar.dominio;


public class Mensalidade extends Movimentacao {

    private Adesao adesao;
    private String pagamento;
    private Double desconto;

    public Mensalidade(int codMovimentacao, Funcionario funcionario, Double valor, String vencimento, String hora, String tipo, Adesao adesao, String pagamento, Double desconto) {
        super(codMovimentacao, funcionario, valor, vencimento, hora, tipo);
        this.adesao = adesao;
        this.pagamento = pagamento;
        this.desconto = desconto;
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

    public Adesao getAdesao() {
        return adesao;
    }

    public void setAdesao(Adesao adesao) {
        this.adesao = adesao;
    }

}
