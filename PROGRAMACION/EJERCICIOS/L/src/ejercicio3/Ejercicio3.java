/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero;
    
        System.out.println("Escrible la altura de la L:");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        
        for (int i = 0; i < numero - 1; i++) {
            System.out.println("*");
        }
        
        numero = numero / 2;
        for (int i = 0; i < numero + 1; i++) {
            System.out.print("*");
            
            
            
        }
        System.out.println(" ");
        
    }
    
}
