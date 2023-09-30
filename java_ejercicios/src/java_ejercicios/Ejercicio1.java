/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
 *El programa deberá después mostrar el resultado de la suma 
 */
package java_ejercicios;

/*
 * @author Laura S
 */
//Importar Scanner 
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String args[]) {
        Scanner leer = new Scanner (System.in);
        //Pedir la información 
        System.out.println("Por favor escribe dos números para sumarlos");
        int num1= leer.nextInt();
        int num2=leer.nextInt();
        //Mostrar el resultado 
        System.out.println("La suma es igual a: " + (num1+num2));
    }
}
