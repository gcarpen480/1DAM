/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;
import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int altura,anchura = 0;
        
    
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduzca la altura de la U:");
       altura = sc.nextInt();
       
       
        for (int i = 1; i < altura; i++) {
            for (int j = 1; j < altura; j++) {
                if (j == 1 | j == altura - 1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
            
        }
        for (int j = 1; j < altura; j++) {
                if (j == 1 | j == altura - 1) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }

            }
        
    }
    
}
