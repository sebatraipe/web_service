package web;

public class EstudianteDto {

    private String nombre;
    private String apellido;
    private String cursos;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCurso() {
        return cursos;
    }
    public void setCurso(String cursos) {
        this.cursos = cursos;
    }
}