/*
9. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java. 
 */
package java_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio9 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba la frase");
        String frase = in.nextLine();
         String fraseFirstLetter = frase.substring(0,1);
         System.out.println(fraseFirstLetter);
        if (fraseFirstLetter.equals("A")){
            System.out.println("Correcto");}
        else{
            System.out.println("Incorrecto");
        }
    }
}
