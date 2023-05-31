package codoacodo;
import java.util.Scanner;
/**
 * Comentarios de documentación
 * Título del programa
 * @autor Agustina Velazquez
 * @version 1.0
 */

//Clase del 25/04/2023

/*
 * Temas:
 * Repaso clase Scanner
 * Ciclo if-else
 */
public class Main {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es mayor?");
        System.out.println("Ingrese un número:");
        num1 = sc.nextInt();
        System.out.println("Ahora, ingrese otro número para comparar:");
        num2 = sc.nextInt();
        if (num1 > num2){
            System.out.println("El número " + num1 + " es mayor.");
        }else {
            System.out.println("El número " + num2 + " es mayor.");
        }
    }
}