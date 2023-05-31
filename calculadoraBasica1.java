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
 * creación de calculadora básica
 */
public class Main {
    public static void main(String[] args) {
        int num1, num2;
        double resultado;

        num1 =10;
        num2 = 5;

        resultado = num1 + num2;
        System.out.println("La suma es " + resultado);
        resultado = num1 - num2;
        System.out.println("La resta es " + resultado);
        resultado = num1 * num2;
        System.out.println("La multiplicaicón es " + resultado);
        if (num2 == 0){
            System.out.println("La división no puede realizarse.");
        }else {
            resultado = num1 / num2;
            System.out.println("La división es " + resultado);
        }
    }
}