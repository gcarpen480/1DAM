/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio3;
import java.util.*;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */

/* -----------------------------------ENUNCIADO---------------------------------
    Diseñar una función recursiva que calcule el enésimo término de la serie de Fibonacci. 
    En esta serie el enésimo valor se calcula sumando los dos valores anteriores de la serie. 

    Es decir:

    fibonacci(n) = fibonacci(n-1)+fibonacci(n-2)
    fibonacci(0) = 1
    fibonacci(1) = 1
   -----------------------------------------------------------------------------
*/
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.print("Introduzca un numero: ");
        num = sc.nextInt();
        
        System.out.println("El fibonacci del numero "+num+" es "
                + ": "+fibonacci(num));
        
        
    }//main
    
    public static int fibonacci(int num){
        
        int resultado = 0;
        
        if (num == 0 | num == 1) {
            resultado = 1;
       }
        else{
            resultado = fibonacci(num - 1) + fibonacci (num -2);
        }
        
        return resultado;
}

}//class
