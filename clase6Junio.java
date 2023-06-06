package codoacodo;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Comentarios de documentación
 * Título del programa
 * @autor Agustina Velazquez
 * @version 1.0
 */

//Clase del 6/05/2023

/*
* 1.- Crear un archivo
* 2.- Cargarle registros:
*                  ana,pacheco(123)
*                  juan,pacheco(233)
* 3.- Poder leer el archivo y deja todo su contenido en un arraylist.
* 4.- Poder modificar un archivo del registro.
*                   a) Traer todo el contenido del archivo y dejarlo en un arraylist.
*                   b) Hacer la modificacion en el arraylist.
*                   c) Grabar la modificacion en el archivo.
* 5.- Poder eliminar un archivo del registro.
*                   a) Traer todo el contenido del archivo y dejarlo en un arraylist.
*                   b) Eliminar el registro del arraylist.
 *                  c) Grabar la modificacion en el archivo.
 */
public class Main {
    //crear una constante, que es el nombre del archivo
    //*private* para que nadie pueda cambiarla, *static* para poder utilizarla en el main, *final* para que sea una constante.
    //Sintaxis private static final <tipo_de_dato> nombreDeLaConstante = valor asignado
    private static final String FILE_PATH = "alumnos.txt";
    public static void main(String[] args) {
        //codigo principal
        //alta de alumno es un método que vamos a enviar el (String)nombre, (String)apellido y (int)DNI.
        String nombre, apellido;
        int i, dni, comision;
        Scanner sc = new Scanner(System.in);
        altaAlumno("Ana","Pacheco",123, 23428);
        altaAlumno("Juan","Pacheco",233, 23429);
        List<String> listado = listarAlumnos();
        for (String linea : listado){
            System.out.println(linea);
        }
        /*
        System.out.println("AGREGAR ALUMNOS");
        for (i=0; i<5; i++){
            System.out.println("Ingrese el nombre:");
            nombre = sc.next();
            System.out.println("Ingrese el apellido:");
            apellido = sc.next();
            System.out.println("Ingrese el DNI:");
            dni = sc.nextInt();
            System.out.println("Ingrese el número de comisión:");
            comision = sc.nextInt();
            altaAlumno(nombre, apellido, dni, comision);
        }
        */
    }
    //métodos
    public static void altaAlumno(String nombre, String apellido, int dni, int comision){
       try (BufferedWriter buffer = new BufferedWriter(new FileWriter(FILE_PATH, true))){
            //Acá va el código que va a escribir la información en el archivo
           buffer.write(nombre + ", " + apellido + " (DNI N°" + dni + ")" + " - Comisión N°" + comision);
           buffer.newLine();
       }catch (IOException e){
           System.out.println("No se pudo grabar en el archivo" + e.getMessage());
       }
    }
    public static List<String> listarAlumnos(){
        List<String> alumnos = new ArrayList<>();
        try(BufferedReader leer = new BufferedReader(new FileReader(FILE_PATH))){
            String linea; //   cada alumno con su nombre, apellido, dni y comision
            while ((linea = leer.readLine()) != null){
                alumnos.add(linea);
            }
        }catch (IOException e){
            System.out.println("No se pudo leer el archivo: " + e.getMessage());
        }
        return alumnos;
    }
}