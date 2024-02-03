/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/*
Realiza un programa que escriba la tabla de multiplicar de un número 
introducido por teclado. Para ello implementa una función que reciba como 
parámetro un número entero y muestre por pantalla la tabla de multiplicar 
de dicho número.
*/
/**
 *
 * @author usuario
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Introduzca un numero: ");
        numero = sc.nextInt();
        
        System.out.println("");
        
        tabla(numero);
        
    }
    
    public static void tabla (int n){
        for (int i = 1; i < 11; i++) {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
    
}
