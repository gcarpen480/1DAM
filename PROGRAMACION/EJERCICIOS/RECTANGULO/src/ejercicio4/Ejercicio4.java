/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Introduzca la altura del rectangulo: ");
        Scanner sc = new Scanner(System.in);
        int alto = sc.nextInt();
       
        System.out.print("Introduzca la anchura del rectangulo: ");
        int ancho = sc.nextInt();
        
       // Palos verticales de la U
        
        for (int i = 1; i <= ancho; i++) {
            System.out.print("*");
        }
        for (int i = 2; i < alto; i++) {
            System.out.print("\n*");
            for (int j = 2; j < ancho; j++) {
                System.out.print(" "); 
                }
                System.out.print("*");
             }
            System.out.println();
            
        for (int i = 1; i <= ancho; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
     }
}  
