package model;

public class Matricula {

    private Aluno aluno;     // referência direta
    private Curso curso;     // referência direta
    private String semestre; // atributo próprio da matrícula
    private double nota;     // outro atributo próprio

    // construtor vazio (necessário para db4o)
    public Matricula() {
    }

    public Matricula(Aluno aluno, Curso curso, String semestre, double nota) {
        this.aluno = aluno;
        this.curso = curso;
        this.semestre = semestre;
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public String getSemestre() {
        return semestre;
    }

    public double getNota() {
        return nota;
    }
}
