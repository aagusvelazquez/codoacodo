package codoacodo;

public class Alumno {
    private String nombre;
    private String apellido;
    private String materia;

    public Alumno(String nombre, String apellido, String materia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", materia='" + materia + '\'' +
                '}';
    }
}
