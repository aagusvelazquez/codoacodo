package codoacodo;
import java.util.Scanner;
/**
 * Comentarios de documentación
 * Título del programa
 * @autor Agustina Velazquez
 * @version 1.0
 */

//Clase del 9 y 12/05/2023

/*Temas:
 *Clases
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona primerPersona = new Persona();
        primerPersona.setNombre("Juan");
        System.out.println("¿Qué valor tiene nombre en el Objeto?: " + primerPersona.getNombre());
        primerPersona.setNombre("Agustina");
        System.out.println("Ahora tiene el valor de: " + primerPersona.getNombre());
    }
}
