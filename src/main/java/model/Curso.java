package model;

import java.util.Map;

public class Curso {
    private String nombre;
    private String horas;

    public Curso(String nombre, String horas) {
        this.nombre = new NotNullNotEmpty(nombre).value();
        this.horas = new NotNullNotEmpty(horas).value();
    }

    public String curso() {
        return nombre + " " + horas;
    }

    public String toString() {
        return "Nombre: [nombre=" + nombre + "]" +
                "Horas: [horas=" + horas + "]";
    }

    public Map<String, Object> toMap() {
        return Map.of("nombre", nombre, "horas", horas);
    }
}