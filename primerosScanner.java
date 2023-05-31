package codoacodo;
import java.util.Scanner;
/**
 * Comentarios de documentación
 * Título del programa
 * @autor Agustina Velazquez
 * @version 1.0
 */

//Clase del 24/04/2023

/*
 * Temas:
 * Clase Scanner para ingresar datos por teclado
 */
public class Main {
    public static void main(String[] args) {
        int num1, num2;
        String nombre, apellido;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre:");
        nombre = sc.nextLine();
        System.out.println("Ahora, ingresá tu apellido:");
        apellido = sc.nextLine();
        System.out.println("Ingresa tu edad:");
        num1 = sc.nextInt();
        System.out.println("¿Tenes un número favorito? Ingresalo!");
        num2 = sc.nextInt();
        System.out.println("Bienvenid@ a CAC Inicial " + nombre + " " + apellido + ".");
        System.out.println("Tu edad es " + num1 + " años, y nos idicaste que tu número favorito es el " + num2 + ".");

    }
}