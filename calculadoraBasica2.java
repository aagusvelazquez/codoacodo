package codoacodo;
/**
 * Comentarios de documentación
 * Título del programa
 * @autor Agustina Velazquez
 * @version 1.1
 */

//Clase del 21/04/2023

/*
 * Temas:
 * creación de calculadora básica
 */
public class Main {
    public static void main(String[] args) {
        int num1, num2;
        double resultado;

        num1 =10;
        num2 = 3;


        System.out.println("La suma es " + (num1+num2));
        System.out.println("La resta es " + (num1-num2));
        System.out.println("La multiplicaicón es " + (num1*num2));
        if (num2 == 0){
            System.out.println("La división no puede realizarse.");
        }else {
            System.out.println("La división es " + (num1 / (double)num2));
        }
    }
}