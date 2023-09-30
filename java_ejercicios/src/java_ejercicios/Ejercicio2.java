/*
 *Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
 *pantalla. 
 */
package java_ejercicios;

/*
 * @author Laura S
 */
//Importar Scanner 
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        System.out.println("Escriba su nombre");
        String nombre = in.nextLine();
        System.out.println(nombre);
    }
}
