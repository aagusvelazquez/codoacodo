package codoacodo;

import java.util.Scanner;

/**
 * Comentarios de documentación
 * Título del programa
 * @autor Agustina Velazquez
 * @version 1.0
 */

//Clase del 16/05/2023

/*Temas:
 *Repaso crear clases
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color, material;
        //Tutor primerTutor = new Tutor("Saady", "Pacheco");
        Mesa mesaComedor = new Mesa("rojo", "Plástico");
        Mesa mesaCocina = new Mesa("Amarillo", "Madera");
        mesaCocina.setColor("Blanco");
        mesaComedor.setColor("Negro");
        System.out.println("La mesa del comedor es de color " + mesaComedor.getColor() + " y está hecha en " + mesaComedor.getMaterial());
        System.out.println("La mesa del comedor es de color " + mesaCocina.getColor() + " y está hecha en " + mesaCocina.getMaterial());
        /*
        System.out.println("Ingresa el color de tu mesa de cocina:");
        color = sc.next();
        System.out.println("Ingresa el material de tu mesa de cocina:");
        material = sc.next();
        Mesa mesa = new Mesa(color, material);
        System.out.println("Su mesa es " + mesa.getColor() + ", y está hecha en " + mesa.getMaterial());
        */

        Gato primerGato = new Gato("Siames", "blanco", "Silvestre");
        Gato segundoGato = new Gato("Angola", "marron", "Michi");
        Gato tercerGato = new Gato("Callejero", "naranja", "Garfield");

        System.out.println(primerGato);
    }
}
