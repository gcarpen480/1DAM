/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19bucles;
import java.util.Scanner;

/*******************************************************************************
Realiza un programa que lea un número y a continuación escriba el carácter “*” 
tantas veces igual al valor numérico leído. En aquellos casos en que el valor 
leído no sea positivo se deberá escribir un único asterisco.
*******************************************************************************/
/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio19Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero;
        int contador=0; 
        
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        
        do {
            if (numero > 0) {
                System.out.print("*");
                        
                contador++;
            }
            else{
                System.out.println("El numero introduico no es valido");
            }
        } while (contador != numero); 
        System.out.println("");
    }
}
