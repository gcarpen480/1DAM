/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;
/*
Dado un inicio y un final de rango mostrar aquellos numeros multiplos de 7 o mas
facil sumar 7 al numero

*/
/**
 *
 * @author Gonzalo
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,num1;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        num = sc.nextInt();
        
        System.out.println("Dime otro numero");
        num1 = sc.nextInt();
        
       if (num < num1 && num1 > num) {
                for (int i = num; i <= num1; i+=7) {
                    System.out.println(i);
                }
            }
        
    }
    
}
