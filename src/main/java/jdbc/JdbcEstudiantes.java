package jdbc;

import model.Estudiante;
import servicios.Estudiantes;

import java.util.List;
import java.util.stream.Collectors;

public class JdbcEstudiantes implements Estudiantes {
    @Override
    public List<Estudiante> estudiantes(String id) {
        Estudiante e1 = new Estudiante("Sebastián", "Traipe", 1L);
        Estudiante e2 = new Estudiante("Juán Roman", "Riquelme", 2L);
        Estudiante e3 = new Estudiante("Carlos", "Tevez", 3L);
        Estudiante e4 = new Estudiante("Pablo", "Perez", 4L);

        e1.addCurso("PDE", "50 hs diarias");
        e1.addCurso("IBD", "27 hs diarias");
        e2.addCurso("Angular Lia", "10 hs diarias");
        e3.addCurso("Spring Lia", "5 hs diarias");
        e4.addCurso("IBD", "27 hs diarias");

        var estudiantes = List.of(e1, e2, e3, e4);

        if (id == null || id.isEmpty())
            return estudiantes;

        return estudiantes.stream().filter((e) -> {
            return e.containsId(Long.parseLong(id));
        }).collect(Collectors.toList());
    }
}
