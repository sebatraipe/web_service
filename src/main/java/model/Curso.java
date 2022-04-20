package model;

import java.util.Map;

public class Curso {

    private Long id;
    private String nombre;
    private String horas;

    public Curso(String nombre, String horas) {
        this.nombre = new NotNullNotEmpty(nombre).value();
        this.horas = new NotNullNotEmpty(horas).value();

        long leftLimit = 1L;
        long rightLimit = 1000L;
        this.id = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
    }

    public String curso() {
        return nombre + " " + horas;
    }

    public String toString() {
        return "id: [id=" + id + "]" +
                "Nombre: [nombre=" + nombre + "]" +
                "Horas: [horas=" + horas + "]";
    }

    public Map<String, Object> toMap() {
        return Map.of("id", id,"nombre", nombre, "horas", horas);
    }
}