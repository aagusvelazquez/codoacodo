package codoacodo;
/**
 * Comentarios de documentación
 * Título del programa
 * @autor Agustina Velazquez
 * @version 1.0
 */

//Clase del 21/04/2023

/*
 * Temas:
 * definicion de variables
 * asignacion de valores
 * ciclo if
 */
public class Main {
    public static void main(String[] args) {
        int num1;
        double num2;
        String nombre;

        num1 = 10;
        num2 = 5.15;
        nombre = "Juan";

        System.out.println("El primer número es " + num1);
        System.out.println("El segundo número es " + num2);
        System.out.println("El nombre es " + nombre);

        if (num1 > 0){
            System.out.println("El número es positivo.");
            System.out.println("El número es " + num1);
        }else {
            System.out.println("El número es negativo.");
        }
    }
}