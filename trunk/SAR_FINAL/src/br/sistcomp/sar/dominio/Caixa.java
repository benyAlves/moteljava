
package br.sistcomp.sar.dominio;

/**
 *
 * @author Fillipe
 */
public class Caixa {

    private int codCaixa;
    private Funcionario funcionario;
    private Boolean status;
    private String diaAbriu;
    private String horaAbriu;
    private String diaFechou;
    private String horaFechou;
    private Double saldo;

    public Caixa(int codCaixa, Funcionario funcionario, Boolean status, String diaAbriu, String horaAbriu, String diaFechou, String horaFechou, Double saldo) {
        this.codCaixa = codCaixa;
        this.funcionario = funcionario;
        this.status = status;
        this.diaAbriu = diaAbriu;
        this.horaAbriu = horaAbriu;
        this.diaFechou = diaFechou;
        this.horaFechou = horaFechou;
        this.saldo = saldo;
    }

    public Caixa(){
        
    }

    public int getCodCaixa() {
        return codCaixa;
    }

    public void setCodCaixa(int codCaixa) {
        this.codCaixa = codCaixa;
    }

    public String getDiaAbriu() {
        return diaAbriu;
    }

    public void setDiaAbriu(String diaAbriu) {
        this.diaAbriu = diaAbriu;
    }

    public String getDiaFechou() {
        return diaFechou;
    }

    public void setDiaFechou(String diaFechou) {
        this.diaFechou = diaFechou;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getHoraAbriu() {
        return horaAbriu;
    }

    public void setHoraAbriu(String horaAbriu) {
        this.horaAbriu = horaAbriu;
    }

    public String getHoraFechou() {
        return horaFechou;
    }

    public void setHoraFechou(String horaFechou) {
        this.horaFechou = horaFechou;
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
