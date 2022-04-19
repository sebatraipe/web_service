package model;

public class NotNullNotEmpty {

    private static final String MSG = "Envíe un valor distinto de nulo o vacío";
    public String value;
    public String[] values;

    public NotNullNotEmpty(String value) {
        if (value == null)
            throw new EstudianteException(MSG);
        if (value.isEmpty())
            throw new EstudianteException(MSG);
        if (value.isBlank())
            throw new EstudianteException(MSG);
        this.value = value;
    }

    public NotNullNotEmpty(String[] cursos) {
        if (cursos == null) {
            throw new EstudianteException(MSG);
        }
        if (cursos.length == 0) {
            throw new EstudianteException(MSG);
        }
        if (cursos[0] == null || cursos[0].isBlank() || cursos[0].isEmpty()) {
            throw new EstudianteException(MSG);
        }
        this.values = cursos;
    }

    public String value() {
        return this.value;
    }

    public String[] values() {
        return this.values;
    }
}