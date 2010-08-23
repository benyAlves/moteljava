/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistcomp.sar.dominio;

import java.util.List;

/**
 *
 * @author Fillipe
 */
public class Adesao {

    private int codAdesao;
    private int matriculaAluno;
    private Plano plano;
    private String dataAdesao;
    private Double valor;
    private Double desconto;
    private int parcelas;
    private String formaDePagamento;
    private Boolean status;
    private List<Mensalidade> mensalidades;
    private Turma turma;

    public Adesao(int codAdesao, int matriculaAluno, Plano plano, String dataAdesao, Double valor, Double desconto, int parcelas, String formaDePagamento, Boolean status, List<Mensalidade> mensalidades, Turma turma) {
        this.codAdesao = codAdesao;
        this.matriculaAluno = matriculaAluno;
        this.plano = plano;
        this.dataAdesao = dataAdesao;
        this.valor = valor;
        this.desconto = desconto;
        this.parcelas = parcelas;
        this.formaDePagamento = formaDePagamento;
        this.status = status;
        this.mensalidades = mensalidades;
        this.turma = turma;
    }

    public Adesao() {

    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public List<Mensalidade> getMensalidades() {
        return mensalidades;
    }

    public void setMensalidades(List<Mensalidade> mensalidades) {
        this.mensalidades = mensalidades;
    }

    public int getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public int getCodAdesao() {
        return codAdesao;
    }

    public void setCodAdesao(int codAdesao) {
        this.codAdesao = codAdesao;
    }

    public String getDataAdesao() {
        return dataAdesao;
    }

    public void setDataAdesao(String dataAdesao) {
        this.dataAdesao = dataAdesao;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
