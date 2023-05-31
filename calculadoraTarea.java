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
 * Clase Math
 */
public class Main {
    public static void main(String[] args) {
        int num1, num2;
        double raizNum1, raizNum2;
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULADORA BÁSICA");
        System.out.println("Ingrese un número:");
        num1 = sc.nextInt();
        System.out.println("Ahora, ingrese otro número:");
        num2 = sc.nextInt();
        System.out.println("Operaciones:");
        System.out.println("La suma de ambos números es: " +(num1 + num2));
        System.out.println("La resta enter ambos número es: " + (num1 - num2));
        System.out.println("La multiplicación entre los números es: " + (num1 * num2));
        if (num2 == 0){
            System.out.println("No se puede realizar una división por cero.");
        }else{
            System.out.println("La división entre ambos números da: " + (num1 /(double)num2));
        }
        raizNum1 = Math.sqrt(num1);
        raizNum2 = Math.sqrt(num2);
        System.out.println("La raíz cuadrada de " + num1 + " es " + raizNum1);
        System.out.println("La raíz cuadrada de " + num2 + " es " + raizNum2);
    }
}