/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.*;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */

/* -----------------------------------ENUNCIADO---------------------------------
    Implementa la siguiente función sobrecargada:
    - int aleatorio (int a, int b) //Devuelve un número aleatorio entre a y b
    - double aleatorio (double x, double y) //Idem anterior, pero con double
    - void aleatorio (int a, int b, int n) //Imprime n números aleatorio entre a y b
   -----------------------------------------------------------------------------
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Un numero aleatorio entero entre "
                + "2 y 5: "+aleatorio(2,5));
        
        System.out.println("Un numero aleatorio double "
                + "entre 6 y 9: "+aleatorio(6.0,9.0));
        
        System.out.println(aleatorio(3,8));
        System.out.println(aleatorio(5.0,10.0));
        
        
    }//main

    public static int aleatorio(int a, int b) {
        int aleatorio;

        do {
            aleatorio = (int) (Math.random()*(b+1));
        } while (aleatorio < a | aleatorio > b);

        return aleatorio;

    }//int aleatorio

    public static double aleatorio(double x, double y) {
        double aleatorio;

        do {
            aleatorio = (Math.random() * y);
        } while (aleatorio < x | aleatorio > y);

        return aleatorio;

    }//double aleatorio

    public static void aleatorio(int a, int b, int n) {
        int aleatorio = 0;

        System.out.println(n+"numeros aleatorios son: "+aleatorio(a,b));
        
        while (n != 0) {
            
            System.out.println(aleatorio+ "");
            n -= 1;
        }
        System.out.println("");

    }//void aleatorio

    public static void aleatorio(double x, double y, int n) {
        double aleatorio;

        System.out.println(n+"numeros aleatorios son: "+aleatorio(x,y));
        
        while (n != 0) {
            aleatorio = aleatorio(x,y);
            System.out.println(aleatorio+ "");
            n -= 1;
        }
        
        System.out.println("");

    }//void aleatorio (double)

}//class
