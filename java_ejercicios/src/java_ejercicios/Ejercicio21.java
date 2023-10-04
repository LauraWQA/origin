/*
 Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P. 
 */
package java_ejercicios;

//import java.util.Scanner;

import java.util.Arrays;

/**
 *
 * @author LauraS
 */
public class Ejercicio21 {

    public static void main(String args[]) {
        int m = 10;
        int p = 3;
        int[][] matrizM = new int[m][m];
        int[][] matrizP = new int[p][p];
        rellenarMatriz(matrizM,m,m);
        rellenarMatriz(matrizP,p,p);
        System.out.println(Arrays.deepToString(matrizM));
        System.out.println(Arrays.deepToString(matrizP));

    }

    public static void rellenarMatriz(int matriz[][], int tamañoFila, int tamañoColumna) {
        System.out.println("Ingrese los números de la matriz 3x3 para comprobar si es mágica");
        for (int i = 0; i < tamañoFila; i++) {
            for (int j = 0; j < tamañoColumna; j++) {
                {
                    matriz[i][j] = i+j;
                }
            }
        }
    }
    public static void desplazarMatriz(int matrizM[][], int tamañoFilaM, int tamañoColumnaM, int matrizP[][],int tamañoFilaP, int tamañoColumnaP){
    
        
    
    
    }
}
