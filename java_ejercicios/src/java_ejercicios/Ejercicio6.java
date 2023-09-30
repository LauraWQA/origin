/*
 * Crear un programa que dado un numero determine si es par o impar. 
 */
package java_ejercicios;

/**
 *
 * @author Laura S
 */
//Importar Scanner
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
         //Imprimir mensaje en pantalla
        System.out.println("Escribe un numero");
        int num = in.nextInt();
        //Condicional para determinar si es par o impar

        if (num%2==0){
            System.out.println("Es par");}
        else {
            System.out.println("Es impar");}
        }
    }
