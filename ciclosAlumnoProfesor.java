package codoacodo;
import java.util.Scanner;

/**
 * Comentarios de documentación
 * Título del programa
 * @autor Agustina Velazquez
 * @version 1.0
 */

//Clase del 09/05/2023

/*Temas:
 *Repaso ciclos
 */
public class Main {
    public static void main(String[] args) {
        String nombre, apellido, lenguaje, materia, nombreProfe, apellidoProfe;
        int i, edad;
        Scanner sc = new Scanner(System.in);
        //hacer con el for, while y do-while;
        /*for (i = 0; i<2; i++){
            System.out.println("***DATOS DE ALUMNO***");
            System.out.print("Ingrese su nombre: ");
            nombre = sc.next();
            System.out.print("Ingrese su apellido: ");
            apellido = sc.next();
            System.out.print("Ingrese el lenguaje de programación que le gusta: ");
            lenguaje = sc.next();
            System.out.println("El nombre completo ingresado es: " + nombre + " " + apellido + "." + " Y le gusta programar en: " + lenguaje);
            System.out.println("");
            System.out.println("***DATOS DEL PROFESOR***");
            System.out.print("Ingrese nombre: ");
            nombreProfe = sc.next();
            System.out.print("Ingrese apellido: ");
            apellidoProfe = sc.next();
            System.out.print("Ingrese la edad del profesor: ");
            edad = sc.nextInt();
            System.out.print("¿Qué materia dicta?: ");
            materia = sc.next();
            System.out.println("El profesor es: " + nombreProfe + " " + apellidoProfe + ", de " + edad + " años. Y dicta la materia " + materia);
            System.out.println("");
        }*/
        //Ciclo While
        /*
        i = 0;
        while (i<2){
            System.out.println("***DATOS DE ALUMNO***");
            System.out.print("Ingrese su nombre: ");
            nombre = sc.next();
            System.out.print("Ingrese su apellido: ");
            apellido = sc.next();
            System.out.print("Ingrese el lenguaje de programación que le gusta: ");
            lenguaje = sc.next();
            System.out.println("El nombre completo ingresado es: " + nombre + " " + apellido + "." + " Y le gusta programar en: " + lenguaje);
            System.out.println("");
            System.out.println("***DATOS DEL PROFESOR***");
            System.out.print("Ingrese nombre: ");
            nombreProfe = sc.next();
            System.out.print("Ingrese apellido: ");
            apellidoProfe = sc.next();
            System.out.print("Ingrese la edad del profesor: ");
            edad = sc.nextInt();
            System.out.print("¿Qué materia dicta?: ");
            materia = sc.next();
            System.out.println("El profesor es: " + nombreProfe + " " + apellidoProfe + ", de " + edad + " años. Y dicta la materia " + materia);
            System.out.println("");
            i++;
        }*/
        //Ciclo do-while
        i=0;
        do {
            System.out.println("***DATOS DE ALUMNO***");
            System.out.print("Ingrese su nombre: ");
            nombre = sc.next();
            System.out.print("Ingrese su apellido: ");
            apellido = sc.next();
            System.out.print("Ingrese el lenguaje de programación que le gusta: ");
            lenguaje = sc.next();
            System.out.println("El nombre completo ingresado es: " + nombre + " " + apellido + "." + " Y le gusta programar en: " + lenguaje);
            System.out.println(" ");
            System.out.println("***DATOS DEL PROFESOR***");
            System.out.print("Ingrese nombre: ");
            nombreProfe = sc.next();
            System.out.print("Ingrese apellido: ");
            apellidoProfe = sc.next();
            System.out.print("Ingrese la edad del profesor: ");
            edad = sc.nextInt();
            System.out.print("¿Qué materia dicta?: ");
            materia = sc.next();
            System.out.println("El profesor es: " + nombreProfe + " " + apellidoProfe + ", de " + edad + " años. Y dicta la materia " + materia);
            System.out.println(" ");
            i++;
        }while (i<2);
    }
}
