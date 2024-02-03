/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;
import java.util.Scanner;

/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int t1 = 1, t2 = 0 , t3 = 0;
        int num;
        
        System.out.println("Introduzca un numero");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        for (int i = 1; i < num-2 ; i++) {
            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
        }
        
        System.out.println(t3);
        
    }
    
    
}
