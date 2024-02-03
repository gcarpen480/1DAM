/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25a;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio25A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int filas;
        int blancos;
        int num;
        
        System.out.println("Dime un numero para realizar su piramide:");
        
        Scanner sc = new Scanner(System.in);
        filas = sc.nextInt();
        
        blancos = filas-1;
        num = 1;
        
        
        for (int i = 1; i <= filas; i++) {
            for (int j = 1 ; j <= blancos; j++) {
                System.out.print(" ");  
            }            
            for (int j = 1; j <= num; j++) {
                System.out.print(j);         
            }
            for (int j = num - 1; j >= 1; j--) {
                System.out.print(j);
            }
            blancos--;
            num++;
            System.out.println(" ");
        }                  
    }   
}