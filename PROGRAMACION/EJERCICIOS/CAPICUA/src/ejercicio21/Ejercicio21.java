/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;
/*
CAPICUA
*/
/**
 *
 * @author Gonzalo
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num,digito,invertido = 0,numoriginal;

            Scanner sc = new Scanner(System.in);
            System.out.println("Dime un numero");
            num = sc.nextInt();

            numoriginal = num;

            while (num > 0) {
                digito = num % 10;
                invertido = invertido * 10 + digito;
                num = num / 10;
        }
            if (numoriginal == invertido) {
                System.out.println("Es capicua");
        }
            else{
                System.out.println("No es capicua");
            }
        
    }
    
}
