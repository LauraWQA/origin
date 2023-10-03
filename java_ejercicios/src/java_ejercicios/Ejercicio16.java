/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido 
 */
package java_ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * @author Laura S
 */
public class Ejercicio16 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba el tamaño del vector y el rango de los números random");
        int tamañoVector = in.nextInt();
        int rangoRandom = in.nextInt();
        System.out.println("Escribe un número para buscarlo en el vector que sea de 0 a " + rangoRandom);
        int numeroBuscar = in.nextInt();
        int[] vector = new int[tamañoVector];
        rellenarVectorRandom(vector, tamañoVector, rangoRandom, numeroBuscar);
        System.out.println(Arrays.toString(vector));
    }

    public static int[] rellenarVectorRandom(int[] vector, int tamañoVector, int rangoRandom, int numeroBuscar) {
        //Clase Random 
        Random random = new Random();
        //Rellenar Vector y buscar
        for (int i = 0; i < tamañoVector; i++) {
            vector[i] = random.nextInt(rangoRandom);
            if (vector[i] == numeroBuscar) {
                System.out.println("El número " + numeroBuscar + " se encuentra en la posición " + (i + 1));
            }
        }

        return vector;
    }
}
