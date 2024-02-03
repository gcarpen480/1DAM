/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;
/*
Piramide de numeros
*/
/**
 *
 * @author Gonzalo
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num,blancos,filas;
//        
         Scanner sc = new Scanner(System.in);
         System.out.println("Dime un numero");
         num = sc.nextInt();
         
         blancos = num - 1;
         filas = 1;
        
         for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= blancos; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= filas; j++) {
                System.out.print(j);
            }
            for (int j = filas -1; j >= 1; j--) {
                System.out.print(j);
            }
            blancos--;
            filas++;
            System.out.println(" ");
        }
        
    }
    
}
