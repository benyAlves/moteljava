package br.sistcomp.sar.dominio;

import br.sistcomp.sar.servico.TurmaDAO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Turma {

    private int codigo;
    private Professor professor;
    private String horaInicio;
    private String horaFinal;
    private Map <String,Boolean> dias = new HashMap<String, Boolean>();
    private List<Aluno> alunos = new ArrayList<Aluno>();

    public Turma(int codigo, Professor professor, String horaInicio, String horaFinal, Map <String,Boolean> dias, List<Aluno> alunos) {
        this.codigo = codigo;
        this.professor = professor;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.dias = dias;
        this.alunos = alunos;
    }

    public Turma(int codigo, Professor professor, String horaInicio, String horaFinal, Map<String,Boolean> dias){
        this.codigo = codigo;
        this.professor = professor;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.dias = dias;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Map<String,Boolean> getDias() {
        return dias;
    }

    public void setDias(Map<String,Boolean> dias) {
        this.dias = dias;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
