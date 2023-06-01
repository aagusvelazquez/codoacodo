package codoacodo;
import java.util.Scanner;

/**
 * Comentarios de documentación
 * Título del programa
 * @autor Agustina Velazquez
 * @version 1.0
 */

//Clase del 28/04/2023

/*Temas:
 *Ciclos
 */
public class Main {
    public static void main(String[] args) {
        int num1, num2, i;
        String nombre, apellido;
        Scanner sc = new Scanner(System.in);

        //1.- Calcular si el número es positivo
        /*System.out.println("Ingrese un número:");
        num1 = sc.nextInt();
        if (num1 >= 0){
            System.out.println("El número es positivo");
        }else {
            System.out.println("El número es negativo.");
        }*/
        //2.- Mostrar los números de 0 a 9:
        /*System.out.println("Mostrar los números del 0 al 9:");
        System.out.print("- Con Ciclo FOR: ");
        for ( i = 0; i < 10; i++){
            if (i == 9){
                System.out.print(i + ".");
            }else {
                System.out.print(i + ",");
            }
        }
        System.out.println("");
        System.out.print("- Con Ciclo WHILE: ");
        i = 0;
        while (i<10){
            if (i == 9){
                System.out.print(i + ".");
            }else {
                System.out.print(i + ",");
            }
            i++;
        }
        System.out.println("");
        System.out.print("- Con Ciclo DO-WHILE: ");
        i = 0;
        do {
            if (i == 9){
                System.out.print(i + ".");
            }else {
                System.out.print(i + ",");
            }
            i++;
        }while (i<10);
        */
        //5.- Stwich

        System.out.println("Ingrese una opción:");
        System.out.println("  1.- Saludo por la mañana.");
        System.out.println("  2.- Saludo por la tarde.");
        System.out.println("  3.- Saludo por la noche.");

        i = sc.nextInt();
        switch (i){
            case 1:
                System.out.println("Hola, buen dia!");
                break;
            case 2:
                System.out.println("Hola, buenas tardes!");
                break;
            case 3:
                System.out.println("Hola, buenas noches!");
                break;
            default:
                System.out.println("Opción Inválida.");
        }
    }
}