
package br.sistcomp.sar.dominio;


public class Mensalidade {

    private long codigo;
    private double valor;
    private double desconto;
    private String vencimento;
    private String pagamento;
    private int codAdesao;

    public Mensalidade(long codigo, double valor, double desconto, String vencimento, String pagamento, int codAdesao) {
        this.codigo = codigo;
        this.valor = valor;
        this.desconto = desconto;
        this.vencimento = vencimento;
        this.pagamento = pagamento;
        this.codAdesao = codAdesao;
    }

    public Mensalidade(double valor, double desconto, String vencimento, int codAdesao) {
        this.valor = valor;
        this.desconto = desconto;
        this.vencimento = vencimento;
        this.codAdesao = codAdesao;
    }

    public Mensalidade(double valor, double desconto, String vencimento) {
        this.valor = valor;
        this.desconto = desconto;
        this.vencimento = vencimento;
    }

    public int getCodAdesao() {
        return codAdesao;
    }

    public void setCodAdesao(int codAdesao) {
        this.codAdesao = codAdesao;
    }


    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

}
