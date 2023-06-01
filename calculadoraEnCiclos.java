package codoacodo;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Comentarios de documentación
 * Título del programa
 * @autor Agustina Velazquez
 * @version 1.0
 */

//Clase del 02/05/2023

/*Temas:
 *Repaso
 */
public class Main {
    public static void main(String[] args) {
        //Crear calculadora que permita hacer operaciones hasta que se indique que no se desea continuar.
        //Las operaciones tienen que ser: SUMA, RESTA, MULTIPLICACIÓN y otras.

         double num1, num2;
         int opcion, operacionValida, seguir;
         Scanner sc = new Scanner(System.in);
         operacionValida = 1;
         num1 = 0;
         num2 = 0;

        System.out.println("CALCULADORA");
        System.out.println("Ingrese los números y la operación que desea realizar:");
        do {
            if (operacionValida ==1){
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextInt();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextInt();
            }
            System.out.println("Seleccione la opción correspondiente a la operación que desea realizar:");
            System.out.println("     1.- Sumar.");
            System.out.println("     2.- Restar.");
            System.out.println("     3.- Multiplicar.");
            System.out.println("     4.- División.");
            System.out.println("     5.- Calcular el máximo de dos números.");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("La suma de los números es: " + (num1 + num2));
                    operacionValida = 1;
                    break;
                case 2:
                    System.out.println("La resta entre los números es: " + (num1-num2));
                    operacionValida = 1;
                    break;
                case 3:
                    System.out.println("La multiplicación entre los números es: " + (num1*num2));
                    operacionValida = 1;
                    break;
                case 4:
                    if (num2 ==0){
                        System.out.println("No se puede realizar la división, porque el divisor es cero.");
                    }else {
                        System.out.println("La división entre los números es: " + (num1/num2));
                    }
                    operacionValida = 1;
                    break;
                case 5:
                    System.out.println("El mayor de los dos números es: " + Math.max(num1, num2));
                    operacionValida = 1;
                default:
                    System.out.println("Ingresó una opción inválida. Reingrese su opción.");
                    operacionValida = 0;
            }
            seguir = 1;
            if (operacionValida == 1){
                System.out.println("¿Desea continuar realizando cálculos? Ingres 1.- Si;  2.- No.");
                seguir = sc.nextInt();
            }
        }while (seguir == 1);
        System.out.println("***El programa ha finalizado con éxito.***");
    }
}
