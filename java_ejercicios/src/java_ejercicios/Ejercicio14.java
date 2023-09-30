/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void). 
El cambio de divisas es: 
    * 0.86 libras es un 1 € 
    * 1.28611 $ es un 1 € 
    * 129.852 yenes es un 1 € 
 */
package java_ejercicios;

import java.util.Scanner;

/*
 * @author Laura S
 */
public class Ejercicio14 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escriba la moneda a convertir entre libra, dolar o yen y la cantidad de euros");
        String moneda = in.nextLine().toLowerCase();
        double euros = in.nextDouble();
        conversor(euros, moneda);

    }

    public static void conversor(double cantidadEuros, String tipoMoneda) {
        double libra = 0.86, dolar = 1.28611, yen = 129.852;
        switch (tipoMoneda) {
            case "libra":
                System.out.println(cantidadEuros + " euros en libras es: " + (cantidadEuros * libra));
            case "dolar":
                System.out.println(cantidadEuros + " euros en dolares es: " + (cantidadEuros * dolar));
            case "yen":
                System.out.println(cantidadEuros + " euros en yenes es: " + (cantidadEuros * yen));
        }

    }
}
