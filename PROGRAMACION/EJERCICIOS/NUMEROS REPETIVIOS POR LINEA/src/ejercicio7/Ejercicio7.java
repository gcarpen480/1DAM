/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;
/*

*/
/**
 *
 * @author Gonzalo
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num,num1,asteriscos = 1,blancos = 1;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el tamaño de la piramide");
        num = sc.nextInt();

        blancos = num -1;

        for (int i = 1; i <= num; i++) {
            System.out.print(i);
            for (int j = 1; j <= i; j++) {
                if (j < i) {
                    System.out.print(i);
                }
                
            }
            System.out.println("");
        }
        
    }
    
}
