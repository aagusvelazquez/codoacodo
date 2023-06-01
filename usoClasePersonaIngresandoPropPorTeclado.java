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
        String nombre;
        System.out.println("BIENVENIDO A CAC");
        System.out.println("Ingresa tu nombre!");
        nombre = sc.next();
        primerPersona.setNombre(nombre);
        System.out.println("Ingresaste el nombre " + primerPersona.getNombre());
    }
}
