package codoacodo;
/**
 * Comentarios de documentación
 * Título del programa
 * @autor Agustina Velazquez
 * @version 1.0
 */

//Clase del 12/05/2023

/*Temas:
 *
 */
public class Main {
    public static void main(String[] args) {
        Profesor nuevoProfesor = new Profesor("Jaa");
        Profesor segundoProfesor = new Profesor("Phton");
        Profesor tercerProfesor = new Profesor("Rct");
        System.out.println("Valores cargados");
        System.out.println(nuevoProfesor.getMateria());
        System.out.println(segundoProfesor.getMateria());
        System.out.println(tercerProfesor.getMateria());
        nuevoProfesor.setMateria("Java");
        segundoProfesor.setMateria("Phyton");
        tercerProfesor.setMateria("RACT");
        System.out.println("Valores corregidos con Metodo SET");
        System.out.println(nuevoProfesor.getMateria());
        System.out.println(segundoProfesor.getMateria());
        System.out.println(tercerProfesor.getMateria());
    }
}
