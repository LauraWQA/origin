/*
 *  Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente: 
* * * * 
*      * 
*      *
* * * * 
 */
package java_ejercicios;

import java.util.Scanner;

/*
 * @author Laura S
 */
public class Ejercicio13 {

    public static void main(String args[]) {
        Scanner in= new Scanner (System.in);
        System.out.println("Escriba la dimensión deseada del cuadrado de estrellas");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1) || (i == n)) {
                    System.out.print("* ");
                } else if ((j == 1) || (j == n)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
