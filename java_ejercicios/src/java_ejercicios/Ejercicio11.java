/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú: 
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción: 
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú. 
 */
package java_ejercicios;

import java.util.Scanner;

/*
 * @author Laura S
 */
public class Ejercicio11 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escribe dos numeros enteros");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int opcion = 0;
        
        while (opcion!=5) {
            System.out.println("Elige una opción escribiendo el número \n MENU \n 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir \n 5. Salir");
            opcion = in.nextInt();
            switch (opcion) {
                case 1 -> System.out.println("La suma es " + (num1+num2));
                case 2 -> System.out.println("La resta es " + (num1-num2));
                case 3 -> System.out.println("La multiplicación es " + (num1*num2));
                case 4 -> System.out.println("La división es " + (num1/num2));
                case 5 -> System.out.println("Cerrando menu ");
                default -> System.out.println("Opción invalida");
                          }         
                }
            }
        }
