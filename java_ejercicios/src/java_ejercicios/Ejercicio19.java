/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa). 
 */
package java_ejercicios;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Laura S
 */
public class Ejercicio19 {

    public static void main(String args[]) {
        int f = 4;
        int c = 4;
        int[][] matriz = new int[f][c];
        int[][] matrizTranspuesta = new int[f][c];
        System.out.println("Matriz rellena números random");
        rellenarMatriz(matriz, f, c);
        System.out.println("Matriz traspuesta");

        trasponerMatriz(matriz, matrizTranspuesta, f, c);
        System.out.println(comprobarMatrizAsimetrica(matriz, matrizTranspuesta,f,c));
        //System.out.println(Arrays.deepToString(matriz));
        //System.out.println(Arrays.deepToString(matrizTranspuesta))
    }

    public static void rellenarMatriz(int matriz[][], int tamañoFila, int tamañoColumna) {
        Random random = new Random();
        for (int i = 0; i < tamañoFila; i++) {
            for (int j = 0; j < tamañoColumna; j++) {
                //matriz[i][j] = random.nextInt(-10, 10);
                matriz[i][j] = 1;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void trasponerMatriz(int matriz[][], int matrizTranspuesta[][], int tamañoFila, int tamañoColumna) {
        for (int i = 0; i < tamañoFila; i++) {
            for (int j = 0; j < tamañoColumna; j++) {
                matrizTranspuesta[i][j] = ((matriz[j][i]) * -1);
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static boolean comprobarMatrizAsimetrica(int matriz[][], int matrizAsimetrica[][], int tamañoFila, int tamañoColumna) {
        boolean n = true;
        for (int i = 0; i < tamañoFila; i++) {
            for (int j = 0; j < tamañoColumna; j++) {
                if ((matriz[i][j] != ((matrizAsimetrica[i][j]) * -1))) {
                    n = false;
                }
            }
        }
        return (n);
    }
}
