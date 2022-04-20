package servicios;

import model.Estudiante;

import java.util.List;

public interface Estudiantes {

    List<Estudiante> estudiantes(String id);

    void crearPersona(String nombre, String apellido, String idCurso);
}