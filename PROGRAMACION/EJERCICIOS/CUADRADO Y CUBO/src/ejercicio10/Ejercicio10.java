/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;
import java.util.Scanner;
/*
Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
*/
/**
 *
 * @author Gonzalo
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int num,cuadrado = 0,cubo;
        
         Scanner sc = new Scanner(System.in);
         System.out.println("Introduce un numero:");    
         num = sc.nextInt();
         
        for (int i = num; i <= num + 5; i++) {
            //System.out.println(i);
            cuadrado = (int) Math.pow(i, 2);
            cubo = (int) Math.pow(i, 3);
            
            System.out.println(cuadrado);
            System.out.print("   ");
            System.out.println(cubo);
            
        }
        
    }
    
}
