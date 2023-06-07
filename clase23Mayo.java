package codoacodo;
import org.xml.sax.helpers.ParserAdapter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Comentarios de documentación
 * Título del programa
 * @autor Agustina Velazquez
 * @version 1.0
 */

//Clase del 23/05/2023

/*
 * Temas:
 * Colecciones: ArrayList
 * Repaso crear listas
 * Ingresar valores por teclado
 * Repaso comando .add
 * Edicion del toString
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        ArrayList<Integer> miListaDeNumeros = new ArrayList<Integer>();
        System.out.println("Ingrese un número entero:");
        int num = sc.nextInt();
        miListaDeNumeros.add(num);
        System.out.println("Ingrese otro número entero:");
        num = sc.nextInt();
        miListaDeNumeros.add(num);
        System.out.println(miListaDeNumeros);
        */
        /*
        ArrayList<String> listaDePalabras = new ArrayList<String>();
        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese un palabra:");
            String palabra = sc.next();
            listaDePalabras.add(palabra);
        }
        System.out.println(listaDePalabras);
         */
        ArrayList<Auto> misAutos = new ArrayList<Auto>();
        for (int i = 0; i < 2; i++){
            System.out.println("Ingrese la marca del auto:");
            String marca = sc.next();
            System.out.println("Ingrese de que color es el auto:");
            String color = sc.next();
            Auto autoNew = new Auto(marca, color);
            misAutos.add(autoNew);
        }
        System.out.println(misAutos);

        /*
        public String toString() {
        return "{" +
                "Marca: " + marca +
                ", color " + color + "}" + "\n";
         */
    }
}