/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa). 
 */
package java_ejercicios;

import java.util.Arrays;
import java.util.Random;

/*
 * @Laura S
 */
public class Ejercicio18 {

    public static void main(String args[]) {
        int f = 4;
        int c = 4;
        int[][] matriz = new int[f][c];
        int [][] matrizTranspuesta = new int [f][c];
        System.out.println("Matriz rellena números random");
        rellenarMatriz(matriz, f, c);
        System.out.println("Matriz traspuesta");
        
        trasponerMatriz(matriz, matrizTranspuesta, f, c);
        //System.out.println(Arrays.deepToString(matriz));
        //System.out.println(Arrays.deepToString(matrizTranspuesta));
    }

    public static void rellenarMatriz(int matriz[][], int tamañoFila, int tamañoColumna) {
        Random random = new Random();
        for (int i = 0; i < tamañoFila; i++) {
            for (int j = 0; j < tamañoColumna; j++) {
                matriz[i][j] = random.nextInt(1, 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void trasponerMatriz(int matriz[][], int matrizTranspuesta[][], int tamañoFila, int tamañoColumna) {
        for (int i = 0; i < tamañoFila; i++) {
            for (int j = 0; j < tamañoColumna; j++) {
                matrizTranspuesta[i][j] = matriz[j][i];
                 System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
