/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22bucles;
import java.util.Scanner;

/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio22Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        int blancos;
        int asteriscos;
        
        System.out.println("Dime un numero para realizar su piramide:");
        
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        blancos = num-1;
        asteriscos = 1;
        
        for (int i = 1; i <= num; i++) {
       
            for (int j = 1 ; j <= blancos; j++) {
                System.out.print(" ");  
            }            
            for (int j = 1; j <= asteriscos; j++) {
                System.out.print("*");         
            } 
            blancos--;
            asteriscos+=2;
            System.out.println(" ");
        }                  
    }   
}

