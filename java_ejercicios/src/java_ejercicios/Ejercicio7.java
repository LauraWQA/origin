/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java. 
 */
package java_ejercicios;

/*
 * @author Laura S
 */
//Importar Scanner
import java.util.Scanner; 
public class Ejercicio7 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba la contraseña");
        String contraseña = in.nextLine();
        if (contraseña.equals("Eureka")) {
            System.out.println("Correcto");}
        else {
            System.out.println("Incorrecto");}
        }
}
