/*
*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
*en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java. 
 */
package java_ejercicios;

/*
 * @author Laura S
 */
//Importar Scanner
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba una frase");
        String frase = in.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        
    }
    
}
