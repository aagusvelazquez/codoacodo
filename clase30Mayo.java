package codoacodo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Comentarios de documentación
 * Título del programa
 * @autor Agustina Velazquez
 * @version 1.0
 */

//Clase del 30/05/2023

/*
 * Temas:
 * Colecciones: ArrayList
 * Repaso crear listas
 * Ingresar valores por teclado
 * Crear un objeto para realizar operaciones matematicas
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Operacion> listaOperaciones = new ArrayList<Operacion>();
        int num1, num2, operador;
        for (int i = 0; i < 5; i++){
            //pido los datos: num1, num2, operacion
            System.out.println("Ingrese el operador:");
            System.out.println("1.- Sumar;  2.- Restar;  3.- Multiplicar;  4-. Dividir");
            operador = sc.nextInt();
            System.out.println("Ingrese el primer número:");
            num1 = sc.nextInt();
            System.out.println("Ingrese el segundo número:");
            num2 = sc.nextInt();
            //creo el objeto Operacion
            Operacion operacionNew = new Operacion(num1, num2, operador);
            //Hacer la operacion
            switch (operador){
                case 1: operacionNew.sumar(num1, num2);break;
                case 2: operacionNew.restar(num1, num2);break;
                case 3: operacionNew.multiplicar(num1, num2);break;
                case 4: operacionNew.dividir(num1, num2);break;
                default:
                    System.out.println("Operador inválido.");
            }
            //Agregar el objeto a la lista: num1, num2, operador, resultado
            if (operador == 1 || operador == 2 || operador == 3 || operador == 4){
                listaOperaciones.add(operacionNew);
            }
        }
        System.out.println(listaOperaciones);
    }
}