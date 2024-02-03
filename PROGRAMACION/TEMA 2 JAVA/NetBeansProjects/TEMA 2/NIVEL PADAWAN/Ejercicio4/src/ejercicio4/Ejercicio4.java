/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        System.out.println("Introduzca un numerito porfavore:");
        
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
        
    }
    
}
