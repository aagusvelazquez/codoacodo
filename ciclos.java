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
 * ciclo for
 */
public class Main {
    public static void main(String[] args) {
        int num1;
        double num2;
        
        num1 = 10;
        num2 = 5.15;

        if (num1 > 0){
            System.out.println("El número es positivo.");
            System.out.println("El número es " + num1);
        }else {
            System.out.println("El número es negativo.");
        }

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}