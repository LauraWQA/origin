/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java. 
 */
package java_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio8 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca la frase");
        String frase = in.nextLine();
        if (frase.length()== 8) {
            System.out.println("Correcto");}
        else{
            System.out.println("Incorrecto");
        }
    }
}
