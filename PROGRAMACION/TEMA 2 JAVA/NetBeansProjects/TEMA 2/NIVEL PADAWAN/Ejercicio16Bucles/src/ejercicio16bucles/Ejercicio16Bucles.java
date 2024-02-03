/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16bucles;
import java.util.Scanner;

/**
Realiza un programa en java que pida un número entero positivo y nos diga si 
es primo o no.
*/
/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio16Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double numero;
        boolean primo = true;
        
        System.out.println("Dime un numero:");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
      
        for (int i = 2; i < Math.sqrt(numero); i++) {
            if (numero%i == 0) {
                primo = false;
            }
        }
      
        if (primo) {
            System.out.println("Es primo");
        }
        else
            System.out.println("No es primo");
    }
}
