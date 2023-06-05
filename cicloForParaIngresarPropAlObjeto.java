package codoacodo;
import java.util.Scanner;

/**
 * Comentarios de documentación
 * Título del programa
 * @autor Agustina Velazquez
 * @version 1.0
 */

//Clase del 16/05/2023

/*Temas:
 *Repaso crear clases
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mascotaPorTeclado;
        for (int i = 0; i<5; i++){
            System.out.println("Ingrese el nombre de su mascota:");
            mascotaPorTeclado = sc.next();
            Mascota miMascota = new Mascota(mascotaPorTeclado);
            System.out.println(miMascota);
        }
    }
}
