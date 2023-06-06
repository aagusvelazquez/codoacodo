package codoacodo;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Comentarios de documentación
 * Título del programa
 * @autor Agustina Velazquez
 * @version 1.1
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
    private static final String FILE_PATH = "alumnos.txt";
    public static void main(String[] args) {
        String nombre, apellido;
        int dni, comision, menu = 1, salir;
        Scanner sc = new Scanner(System.in);
        while(menu != 100){
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, ("Alta de Alumnos" +" \n" +
                    "1.- Dar de alta un Alumno. " + "\n" +
                    "2.- Modificar último alumno dado de alta. " + "\n" +
                    "3.- Quitar último alumno dado de alta. " + "\n" +
                    "4.- Listar Alumnos Activos. " + "\n" +
                    "5.- Cantidad de Alumnos Activos. " + "\n" +
                    "6.- Salir"),"Aula Virtual CAC Inical", -1));
            switch (menu){
                case 1:
                    nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre:", "Alta de Alumno", -1);
                    apellido = JOptionPane.showInputDialog(null,"Ingrese el apellido:", "Alta de Alumno", -1);
                    dni = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el DNI:", "Alta Alumno", -1));
                    comision = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Comisión:", "Incripción Aula Virtual", -1));
                    altaAlumno(nombre,apellido, dni, comision);
                    List<String> listado = listarAlumnos();
                    for (String linea : listado){
                        System.out.println(linea);
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, listarAlumnos(), "Alumnos Activos en el Aula Virtual", -1, null);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Hay " + listarAlumnos().size() +" alumnos acctivos en el Aula Virtual.", "Alumnos Inscriptos al Aula Virtual", 2);
                    break;
                case 6:
                    salir = Integer.parseInt(String.valueOf(JOptionPane.showOptionDialog(null, "¿Desea salir del Aula Virtual?", "Saliendo...", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, new String[]{"Salir", "No"}, "No")));
                    if (salir == 0){
                        menu = 100;
                    } else if (salir == 1) {
                        menu = 2;
                    }
                    break;
                default:
                    JOptionPane.showInputDialog("Opción inválida.");
                    break;
            }
        }
    }
    public static void altaAlumno(String nombre, String apellido, int dni, int comision){
       try (BufferedWriter buffer = new BufferedWriter(new FileWriter(FILE_PATH, true))){
           buffer.write(nombre + ", " + apellido + " (DNI N°" + dni + ")" + " - Comisión N°" + comision);
           buffer.newLine();
       }catch (IOException e){
           JOptionPane.showMessageDialog(null, "No se pudo grabar en el archivo: " + e.getMessage(), "Grabando...", 0);
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
            JOptionPane.showMessageDialog(null, "No se pudo grabar en el archivo: " + e.getMessage(), "Grabando...", 0);
        }
        return alumnos;
    }
}