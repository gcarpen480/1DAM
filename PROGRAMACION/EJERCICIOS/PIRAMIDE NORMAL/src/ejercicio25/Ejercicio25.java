/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;
/*
PIRAMIDE NORMAL
*/
/**
 *
 * @author Gonzalo
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num,num1,asteriscos = 1,blancos = 1;
        
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        blancos = num -1;
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= blancos; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= asteriscos; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
            asteriscos = asteriscos + 2;
            blancos = blancos - 1;
        }
/*
        ESPECIAL L
        */        
        
        
//        for (int i = 1; i < num; i++) {
//            System.out.println("*");
//        }
//        
//        num1 = num/2 + 1;
//        for (int i = 0; i < num1; i++) {
//            System.out.print("*");
//        }
        
    }
    
}
