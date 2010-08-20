package br.sistcomp.sar.dominio;



public class Modalidade {

    private int codigo;
    private String nome;
    private String ambiente;
    private int alunosPorTurma;
    
    public Modalidade(int codigo, String nome, String ambiente, int alunosPorTurma){
        this.codigo = codigo;
        this.nome = nome;
        this.ambiente = ambiente;
        this.alunosPorTurma = alunosPorTurma;
    }

    public int getAlunosPorTurma() {
        return alunosPorTurma;
    }

    public void setAlunosPorTurma(int alunosPorTurma) {
        this.alunosPorTurma = alunosPorTurma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return this.codigo;
    }

}
