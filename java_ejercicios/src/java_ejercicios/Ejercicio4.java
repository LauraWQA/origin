/*
*4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
*Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). 
 */
package java_ejercicios;

/**
 *
 * @author Laura S
 */
//Importar Scanner 
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba los grados centigrados");
        float gradosC = in.nextInt();
        float gradosF = 32 + (9 * gradosC / 5);
        System.out.println("Los grados Fahrenheit son: " + gradosF );
    }
}
