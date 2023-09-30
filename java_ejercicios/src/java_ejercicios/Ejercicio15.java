/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente. 
 */
package java_ejercicios;

import java.util.Arrays;

/*
 * @author Laura S 
 */
public class Ejercicio15 {

    public static void main(String args[]) {
        int n =1000;
        int[] vector = new int[n];
        llenarVector(vector, n);{
        System.out.println(Arrays.toString(vector));
    }
    }

    public static int[] llenarVector(int[] vector, int tamañoVector) {
        for (int i = 1; i <= tamañoVector; i++) {
            vector[(tamañoVector-i)] = i;
                    }
        return vector;

    }
}
