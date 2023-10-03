/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9. 
El código sirve para matrices cuadradas de cualquier dimensión. Solo debe cambiarse X!!!
 */
package java_ejercicios;

import java.util.Scanner;
import java.util.Arrays;

/* 
 * @author Laura S
 */
public class Ejercicio20 {

    public static void main(String args[]) {
        //Numero de filas y de columnas 
        int x = 3;
        //Inicializar matriz 
        int[][] matriz = new int[x][x];
        if (comprobarMatriz(matriz, x, x) == true) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("la matriz no es mágica");
        }

    }

    //Rellena la matriz con input de usuario. Comprueba que el input sea int de 1 a 9. 
    public static void rellenarMatriz(int matriz[][], int tamañoFila, int tamañoColumna) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese los números de la matriz 3x3 para comprobar si es mágica");
        for (int i = 0; i < tamañoFila; i++) {
            for (int j = 0; j < tamañoColumna; j++) {
                int numero = in.nextInt();
                if (numero >= 1 && numero <= 9) {
                    matriz[i][j] = numero;
                } else {
                    //Se asegura que esté entre 1 y 9
                    System.out.println("Debe escribir número entre 1 y 9");
                    //Devolver cuenta para que lo reescriba
                    j--;
                }
            }
        }
    }

    //Entrega matriz con suma de filas[0][i] y columnas [1][i]
    public static int[][] sumarFilasColumnas(int matriz[][], int tamañoFila, int tamañoColumna) {
        int[][] sumaT = new int[2][tamañoFila];

        //Sumar las columnas y las filas
        for (int i = 0; i < tamañoFila; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;

            for (int j = 0; j < tamañoColumna; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            //Almacenar el valor en matriz. La fila 0 para sumas de filas y la 1 para suma de Columnas
            sumaT[0][i] = sumaFila;
            sumaT[1][i] = sumaColumna;
            //Retorna la matriz con las sumas
        }
        return sumaT;
    }

    //Entrega suma de diagonales 
    public static int[] sumarDiagonales(int matriz[][], int tamañoFila, int tamañoColumna) {
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;
        int[] sumaDiagonales = new int[2];
        //Contadores para la diagonal 2
        int x = 0;
        int y = (tamañoFila - 1);

        //Encontrar diagonal principal y secundaria
        for (int i = 0; i < tamañoFila; i++) {

            for (int j = 0; j < tamañoColumna; j++) {
                //Diagonal principal 1 y j siempre son iguales
                if (i == j) {
                    sumaDiagonal1 += matriz[i][j];

                }//Encontrar segunda diagonal
                if ((i == x) && (j == y)) {
                    sumaDiagonal2 += matriz[i][j];
                }

            }
            x++;
            y--;
        }

        //En el array poner los valores 
        sumaDiagonales[0] = sumaDiagonal1;
        sumaDiagonales[1] = sumaDiagonal2;
        return sumaDiagonales;
    }

    public static boolean comprobarMatriz(int matriz[][], int tamañoFila, int tamañoColumna) {
        //Matriz en la que quedan las filas y la columnas 
        int[][] sumaFilasColumnas = new int[tamañoFila][2];
        int[] sumaDiagonales = new int[2];
        //Si una condicion se incumple check pasará a ser falso. 
        boolean check = true;
        //Se rellena la matriz con input del usuario. 
        rellenarMatriz(matriz, tamañoFila, tamañoColumna);
        System.out.println("Matriz ingresada\n" + Arrays.deepToString(matriz));
        //Se hacen las respectivas sumas 
        sumaFilasColumnas = sumarFilasColumnas(matriz, tamañoFila, tamañoColumna);
        System.out.println("Suma de las filas [0][a] y de las columnas [1][a]\n" + Arrays.deepToString(sumaFilasColumnas));
        sumaDiagonales = sumarDiagonales(matriz, tamañoFila, tamañoColumna);
        System.out.println("Suma de las diagonales. Diagonal principal [0] y diagonal secundiaria [1]\n" + Arrays.toString(sumaDiagonales));

        //Comprobación de fila vs fila y columna vs columna 
        for (int i = 0; i < 2; i++) {
            int x = (tamañoFila - 1);
            //int y = (tamañoFila - 1);
            while (x >= 1) {
                //System.out.println(" i " + i + " y " + y + " vector " + sumaFilasColumnas[i][y--] + " i " + i + "y " + y + "vector " + sumaFilasColumnas[i][y]);
                if (sumaFilasColumnas[i][x--] != sumaFilasColumnas[i][x]) {
                    check = false;
                }
            }
        }
        //Comprobación diagonal vs diagonal 
        if (sumaDiagonales[0] != sumaDiagonales[1]) {
            check = false;
        }
        //Comprobación columna vs fila vs diagonales
        for (int j = 0; j < tamañoFila; j++) {
            if ((sumaFilasColumnas[0][j] != sumaFilasColumnas[1][j]) || (sumaFilasColumnas[1][j] != sumaDiagonales[1])) {
                check = false;
            }
        }
        return check;
    }
}
