/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio4;
import java.util.*;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */

/* -----------------------------------ENUNCIADO---------------------------------
    Escribe una función iterativa que decida si dos números enteros positivos son 
    amigos. 

    Dos números a y b son amigos si la suma de los divisores propios 
    (distintos de él mismo) de a es igual a b. Y viceversa.

    Para probar, se pueden usar los números 220 y 284, que son amigos
   -----------------------------------------------------------------------------
*/
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int num1 , num2;
        
        System.out.println("Introduzca el primer numero");
        num1 = sc.nextInt();
        
        System.out.println("Introduzca el segundo numero");
        num2 = sc.nextInt();
        
    }//main
    
    public static boolean iterativa (int  num1, int num2){
        
        int div,sum1 = 0,sum2 = 0,div2;
        boolean resultado = false;
        
        for (int i = 2; i < num1; i++) {
            
            if (num1 % i == 0) {
                sum1+= i;
            }
        }
        
        for (int i = 2; i < num2; i++) {
            
            if (num2 % i == 0) {
                sum2+= i;
            }
        }
        
        if (sum1 == num2 && sum2 == num1) {
            resultado = true;
        }
        
        return resultado;
    }

}//class
