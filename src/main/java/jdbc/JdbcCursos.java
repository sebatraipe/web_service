package jdbc;

import model.Curso;
import servicios.Cursos;

import java.util.List;

public class JdbcCursos implements Cursos {

    @Override
    public List<Curso> cursos() {
        return List.of(new Curso("PDE", "50 hs diarias"), new Curso("Angular Lia", "10 hs diarias"),
                new Curso("Spring Lia", "5 hs diarias"), new Curso("IBD", "27 hs diarias"),
                new Curso("PDS", "48 hs diarias"));
    }
}