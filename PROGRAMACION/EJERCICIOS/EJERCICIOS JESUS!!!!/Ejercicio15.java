/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.util.Scanner;

/*
Escribe un programa que lea tres números distintos y nos diga cuál es el mayor
*/

/**
 *0
 * @author Gonzalo Carretero
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        
        int num1;
        int num2;
        int num3;
        
        //Operaciones para introducir los numeros
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tres numero para compararlos");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        
        //Operaciones
        
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El numero " + num1 + " es el mayor");
            }
            else{
                System.out.println("El numero " + num3 + " es el mayor");
            }
        }
        else{
            if (num2 > num3) {
                System.out.println("El numero " + num2 + " es el mayor");
            }
            else{
                System.out.println("El numero " + num3 + " es el mayor");
            }
        }
        
    }
    
}
