package model;

public class Curso {

    private int id;
    private String nome;

    // construtor vazio (necessário para db4o)
    public Curso() {
    }

    public Curso(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
