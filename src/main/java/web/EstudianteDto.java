package web;

public class EstudianteDto {

    private Long id;
    private String nombre;
    private String apellido;
    private String[] cursos;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
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
    public String[] getCursos() {
        return cursos;
    }
    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }
}
