package app;

import model.Aluno;
import model.Curso;
import model.Matricula;

import java.util.Arrays;
import java.util.List;

public class SeedData {

    public static List<Matricula> criarMatriculas() {
        Aluno ana = new Aluno(1, "Ana");
        Aluno carlos = new Aluno(2, "Carlos");

        Curso bd = new Curso(10, "Banco de Dados");
        Curso poo = new Curso(20, "POO");

        Matricula m1 = new Matricula(ana, bd, "2026.1", 8.5);
        Matricula m2 = new Matricula(carlos, bd, "2026.1", 7.0);
        Matricula m3 = new Matricula(ana, poo, "2026.1", 9.2);

        return Arrays.asList(m1, m2, m3);
    }
}
