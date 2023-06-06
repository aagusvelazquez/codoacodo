package codoacodo;

import java.util.ArrayList;

/*
* 1.- Crear un archivo
* 2.- Cargarle registros:
*                  ana,pacheco(123)
*                  juan,pacheco(233)
*
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
        //alta de alumno es un método que vamos a enviar el (String)nombre, (String)apellido y (int)DNI
        altaAlumno("ana","pacheco",123);
        altaAlumno("juan","pacheco",233);

    }
    //métodos
    public static void altaAlumno(String nombre, String apellido, int dni){
       //manejo de errores en java es colocar la operacion dentro de un try/catch
        //para que si se realia un error, salta al catch y pueda decirnos cuál fue el error y el programa no termine
        //abruptamente por un error en tiempo de ejecución.
        int x=0;
        try{
            x = 5/0;
            System.out.println("El resultado de la operacion es: " + x);
        }catch (ArithmeticException e){
            System.out.println("No se pudo realizar la division: " + e.getMessage());
        }
    }
}