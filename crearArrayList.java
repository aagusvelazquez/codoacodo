package codoacodo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Comentarios de documentación
 * Título del programa
 * @autor Agustina Velazquez
 * @version 1.0
 */

//Clase del 19/05/2023

/*
 * Temas:
 * Crea Colecciones (ArrayList)
 * Método .add para agregar objetos al array
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crear un Array de Palabras
        /*
        ArrayList<String> palabras = new ArrayList<String>();
        palabras.add("Hipotiroidismo");
        palabras.add("Incidente");
        palabras.add("Perro");
        System.out.println(palabras);
        System.out.println("La cantidad de elementos que contiene la Colección es: " + palabras.size());
        */
        //Crear un Array de Números
        /*ArrayList<Integer> numeros = new ArrayList<Integer>();
        //Integer num;
        //numeros.add(10);
        //numeros.add(20);
        //numeros.add(30);
        //numeros.add(40);
        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese un número:");
            num = sc.nextInt();
            numeros.add(num);
        }

        //System.out.println(numeros);
        for (int i = 0; i < 5; i++){
            System.out.println("El número en posición " + i + " es: ");
            System.out.println(numeros.get(i));
        }
        //ciclo for que me muestra TODO EL ARRAY
        //Números precargados y Números del ciclo for

        for (int i = 0; i < numeros.size(); i++){
            System.out.println("El número en posición " + i + " es: ");
            System.out.println(numeros.get(i));
        }

        //muestra el valor almacenado en la posición 4
        /*System.out.println(numeros.get(3));
        */
        //Crear un Array de una clase creada
        /*
        ArrayList<Alumno> alumnosComision23429 = new ArrayList<Alumno>();
        ArrayList<Alumno> alumnosComision23428 = new ArrayList<Alumno>();
        String nombre;
        int comision;
        for (int i =0; i < 5; i++){
            System.out.println("Ingrese el nombre del alumno:");
            nombre = sc.next();
            System.out.println("Ingrese la Comision:");
            comision = sc.nextInt();
            Alumno alumno = new Alumno(nombre, comision);
            if (comision == 23428){
                alumnosComision23428.add(alumno);
            } else if (comision == 23429){
                alumnosComision23429.add(alumno);
            }
        }
        System.out.println("Alumnos de la Comisión 237428:");
        System.out.println(alumnosComision23428);
        System.out.println("Alumnos de la Comisión 237429:");
        System.out.println(alumnosComision23429);
        */
    }
}