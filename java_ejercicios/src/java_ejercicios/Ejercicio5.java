/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 *doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
 *Math.sqrt(). 
 */
package java_ejercicios;

/*
 * @author Laura S
 */
//Importar Scanner 
import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escribe un numero entero");
        int num = in.nextInt();
        
        System.out.println("El doble es: " + (num*2) + " El triple es: " + (num*3) + " y la raiz cuadrada es: " + Math.sqrt(num));
    }
}
