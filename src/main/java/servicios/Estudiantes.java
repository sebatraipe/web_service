package servicios;

import model.Estudiante;

import java.util.List;

public interface Estudiantes {

    List<Estudiante> estudiantes(String id);

    void crearEstudiante(String nombre, String apellido, String idCurso);

    void inscribir(String curso, String idEstudiante);
}