
package br.sistcomp.sar.dominio;


public class Mensalidade {

    private long codigo;
    private String nomeDaModalidade;
    private double valor;
    private double desconto;
    private String vencimento;
    private String pagamento;

    public Mensalidade(long codigo, String nomeDaModalidade, double valor, double desconto, String vencimento, String pagamento) {
        this.codigo = codigo;
        this.nomeDaModalidade = nomeDaModalidade;
        this.valor = valor;
        this.desconto = desconto;
        this.vencimento = vencimento;
        this.pagamento = pagamento;
    }

    public Mensalidade(String nomeDaModalidade, double valor, double desconto, String vencimento) {
        this.nomeDaModalidade = nomeDaModalidade;
        this.valor = valor;
        this.desconto = desconto;
        this.vencimento = vencimento;
    }

    public String getNomeDaModalidade() {
        return nomeDaModalidade;
    }

    public void setNomeDaModalidade(String nomeDaModalidade) {
        this.nomeDaModalidade = nomeDaModalidade;
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
