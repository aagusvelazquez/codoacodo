package codoacodo;

public class Profesor {
    private String materia;

    public Profesor(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "El profesor " +
                "ditcta la materia " + materia + '\'' +
                '}';
    }
}
