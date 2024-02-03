/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16v2;
import java.util.Scanner;

/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio16V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double numero;
        boolean primo = true;
        int i = 2;
        
        System.out.println("Dime un numero:");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        
        
        while (i<= Math.sqrt(numero)||primo == true)
            i ++;
    }
    
}
