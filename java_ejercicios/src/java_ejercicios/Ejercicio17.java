/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos). 
 */
package java_ejercicios;

import java.lang.Math;
import java.util.Arrays;


public class Ejercicio17 {

    public static void main(String args[]) {
        // Tamaño vector definir
        int n = 100001;
        // Definir vector
        int[] vector = new int[n];
        // el máximo de digitos que quiere buscar
        int digitos = 6;
        llenarVector(vector, n);
        int[] vectorContador = vectorContador(vector, n, digitos);
        //System.out.println(Arrays.toString(vector));
        for (int i=(digitos-1); i >=0; i--){
            System.out.println("Los numeros con " + (i+1) + " digitos son " + vectorContador[(i)]);
        }
        System.out.println(Arrays.toString(vectorContador));
        // System.out.println(Arrays.toString(vector));

    }

    public static void llenarVector(int[] vector, int tamañoVector) {
        for (int i = 0; i < tamañoVector; i++) {
            vector[i] = i;
        }
    }

    public static int[] vectorContador(int[] vector, int tamañoVector, int digitosBuscar) {

        int[] contarDigitos = new int[digitosBuscar];
        for (double potencia = digitosBuscar; potencia > 0; potencia--) {
            digitosBuscar -= 1;
            int j = 1;

            for (int i = 0; i < tamañoVector; i++) {
                if ((((vector[i]) / (Math.pow(10, potencia))) >= 0.1) && ((vector[i]) / (Math.pow(10, potencia))) < 1) {
                    contarDigitos[digitosBuscar] = j++;
                    //System.out.println("vector " + i + "=" + vector[i] + "Con digitos " + potencia + "Contador" + contarDigitos + "=" + contarDigitos[digitosBuscar]);

                }
                if ((potencia==1) && (vector[i]==0)){
                    contarDigitos[digitosBuscar] = j++;
                }
            }
        }
    return (contarDigitos);}
}

// public static int[] contadorVectorDigitos(int[] vector, int tamañoVector, int
// numeroDigitos) {
// int[] contadorVector= new int[(numeroDigitos+1)];
// int j =0;
// double digitos = (numeroDigitos-1);
// for (int i = 0; i < tamañoVector; i++) {

// double n= ((vector[i]))%(;
// System.out.println("WWWWWWWWWWWWWWW"+n);

// if (((vector[i])%(Math.pow(10, digitos)))>1) {
// System.out.println( "VECTOR " + (vector[i]) + "numeroDigitos " +
// numeroDigitos);
// contadorVector[(numeroDigitos)]= j++;}

// else if (digitos>0) { digitos-=1;
// System.out.println("HOLA" +numeroDigitos);
// }

// }
// return contadorVector;

// }
