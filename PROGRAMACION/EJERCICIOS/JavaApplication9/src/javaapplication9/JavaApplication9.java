/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num, asteriscos = 1,blancos;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");    
        num = sc.nextInt();

        blancos = num -1;
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= blancos; j++) {
                
            }
            for (int j = 1; j <= asteriscos; j++) {
                if (j==1 || j == asteriscos) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            blancos--;
            asteriscos = asteriscos + 2;
            System.out.println("");
        }
        for (int i = 1; i <= asteriscos; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
    }
    
}
