/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;
/*
Dado un numero sus digitos mirar si son pares o impares
*/
/**
 *
 * @author Gonzalo
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num,digito,par,impar;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");     
        num = sc.nextInt();     
        
        par= 0;
        impar=0;
       
        while (num > 0) {
            digito = num % 10;
            if (digito % 2 == 0) {
                par = par +1;
            }
            else {
                impar = impar +1;
            }
            num = num /10; //Para eliminar numero
        }
        
        System.out.println( "Cantidad de numeros pares: "+par);
        System.out.println("Cantidad de numeros impares: "+impar);
        
    }
    
}
