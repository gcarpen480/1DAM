/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio2;
import java.util.*;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */

/* -----------------------------------ENUNCIADO---------------------------------
    Diseñar una función que calcule an, donde a es real y n es entero no negativ 
    Realizar una versión iterativa y otra recursiva
   -----------------------------------------------------------------------------
*/
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        double valor;
        int n;
        
        System.out.println("Introduzca un numero real: ");
        valor = sc.nextDouble();
        
        System.out.println("Introduzca un valor no negativo entero: ");
        n = sc.nextInt();
        
        if (n < 1) {
            System.out.println("No se puede realizar la operacion");
        }
        else{
            System.out.println("Potencia Iterativa: "+iterativa(valor,n));
        }
        System.out.println("Potencia Recursiva: "+recursiva(valor,n));
        
    }//main
    
    public static double iterativa (double a,int b){
        int resultado = 1;
        
        for (int i = 0; i < b; i++) {
            resultado *= a;
        }
        
        return resultado;
        
    }//iterativa

    public static double recursiva (double a,int b){
        double resultado;
        
        if (b == 0) {
            resultado = 1;
        }
        else{
            resultado = a * recursiva(a,(b-1));
        }
        
        return resultado;
        
    }//recursiva
    
}//class
