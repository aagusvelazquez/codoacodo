package primerospasos.inicial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre, apellido;
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingrese su apellido:");
        apellido = sc.nextLine();

        System.out.println("Ingrese un número:");
        num1 = sc.nextInt();
        System.out.println("Ingrese otro número:");
        num2 = sc.nextInt();


    }
}