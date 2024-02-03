/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1 = 0 , n2 = 1 , n3 = 0;

        System.out.println("Introduzca un numero para mostrar posteriormente"+
                "su termino en Fibonacci");
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for (int i = 1; i < num; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            
            System.out.println(n3);
        }
        
        
        
    }
    
}
