/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.*;

/*
Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. 
El programa debe tener una función que reciba como parámetro una cantidad en 
kilómetros y nos la devuelva en millas.
*/
/**
 *
 * @author usuario
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        sc.useLocale(Locale.US);
     
        int km;
        
        System.out.println("Introduzca los km: ");
        km = sc.nextInt();
        
        System.out.println("");
        
        System.out.println("Total de millas: ");
        System.out.printf("%.2f",kilometros_a_millas(km));
        
        System.out.println("");
        
    }
    
    public static double kilometros_a_millas(int km){
        
        double millas;
        
        millas = (1* km/1.60934);
        
        return millas;
        
    }
    
}
