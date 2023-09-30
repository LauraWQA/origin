/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial. 
 */
package java_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Laura S
 */
public class Ejercicio10 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el valor límite"); 
        int valorLimite= in.nextInt();
        int suma= 0;
        while (suma<=valorLimite){
            System.out.println("Ingrese el valor a sumar");
            int valorSuma=in.nextInt();
            suma=suma+valorSuma;
            System.out.println("valor suma " + suma + " Valor limite " + valorLimite);
        }
    }
}
