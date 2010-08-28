
package br.sistcomp.sar.dominio;

/**
 *
 * @author Fillipe
 */
public class Caixa {

    private int codCaixa;
    private Boolean status;
    private String dia;
    private Double saldo;
    private Boolean saldoAnterior;
    private Funcionario abriu;
    private Funcionario fechou;

    public Caixa(int codCaixa, Boolean status, String dia, Double saldo, Boolean saldoAnterior, Funcionario abriu, Funcionario fechou) {
        this.codCaixa = codCaixa;
        this.status = status;
        this.dia = dia;
        this.saldo = saldo;
        this.saldoAnterior = saldoAnterior;
        this.abriu = abriu;
        this.fechou = fechou;
    }

    public Caixa(){

    }

    public Boolean getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(Boolean saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public Funcionario getAbriu() {
        return abriu;
    }

    public void setAbriu(Funcionario abriu) {
        this.abriu = abriu;
    }

    public Funcionario getFechou() {
        return fechou;
    }

    public void setFechou(Funcionario fechou) {
        this.fechou = fechou;
    }

    public int getCodCaixa() {
        return codCaixa;
    }

    public void setCodCaixa(int codCaixa) {
        this.codCaixa = codCaixa;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
