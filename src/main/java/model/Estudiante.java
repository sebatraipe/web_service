package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Estudiante {

    private Long id;
    private String nombre;
    private String apellido;
    private List<Curso> cursos;

    public Estudiante(String nombre, String apellido, Long id) {
        var chek = new NotNullNotEmpty("nombre", nombre, "apellido", apellido);
        chek.throwOnError();

        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cursos = new ArrayList<>();
    }

    public void addCurso(String nombreCurso, String horasCurso) {
        this.cursos.add(new Curso(nombreCurso, horasCurso));
    }

    public Map<String, Object> toMap() {
        var map = new HashMap<String, Object>(
                Map.of("id", id, "nombre", nombre, "apellido", apellido));
        map.put("cursos", cursos.stream().map((c) -> c.toMap())
                .collect(Collectors.toList()));
        return map;
    }

    public boolean containsId(long id) {
        return this.id == id;
    }

    public String toString() {
        return "Estudiante: [nombre=" + nombre + "]" +
                "Apellido: [apellido=" + apellido + "]" +
                "Curso: [curso=" + cursos + "]";
    }
}