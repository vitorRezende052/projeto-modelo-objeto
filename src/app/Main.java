package app;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import model.Matricula;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ObjectContainer db = Db4o.openFile("faculdade.db4o");

        try {
            // 1) Criar objetos (memória)
            List<Matricula> matriculas = SeedData.criarMatriculas();

            // 2) Persistir objetos
            for (Matricula m : matriculas) {
                db.store(m);
            }
            db.commit();

            // 3) Consultar objetos
            ObjectSet resultado = db.queryByExample(new Matricula());

            System.out.println("=== Matrículas salvas no db4o ===");
            while (resultado.hasNext()) {
                Matricula m = (Matricula) resultado.next();
                System.out.println(
                        m.getAluno().getNome() + " -> " +
                                m.getCurso().getNome() + " | " +
                                m.getSemestre() + " | nota=" + m.getNota()
                );
            }

        } finally {
            db.close();
        }
    }
}
