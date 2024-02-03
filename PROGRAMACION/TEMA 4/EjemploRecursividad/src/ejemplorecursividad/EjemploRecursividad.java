/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplorecursividad;

import java.util.*;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */

/* -----------------------------------ENUNCIADO---------------------------------


   -----------------------------------------------------------------------------
 */
public class EjemploRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int n, f;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entero no negativo: ");
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("Lo siento, el número es negativo");
        } else {
            System.out.println("El factorial de " + n + " es " + factorial(n));

        }
    }//main

    public static long factorial(int n) {
        long resultado;
        if (n == 0) { //caso base: el factorial de 0 es 1
            resultado = 1;
        } else {
            resultado = n * factorial(n - 1); //llamada recursiva: el factorial de n es 
            //igual a n*factorial de n-1
        }
        return resultado;
    }//factorial()

}//main
