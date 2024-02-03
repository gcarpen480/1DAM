/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosobrecarga;

import java.util.*;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */

/* -----------------------------------ENUNCIADO---------------------------------


   -----------------------------------------------------------------------------
 */
public class EjemploSobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int n = 4, m = 12, p = 10;
        double x = 4.6, y = 6.4;
        float f = 34.5f, g = 30.9f;

        System.out.println("La suma de los dos valores enteros es " + sumar(n, m));
        System.out.println("La suma de los tres valores enteros es " + sumar(n, m, p));
        System.out.println("La suma de los dos valores float es " + sumar(f, g));
        System.out.println("La suma de los dos valores double es " + sumar(x, y));

    }//main

    //La función sumar() se encuentra sobrecargada
    public static int sumar(int n, int m) {
        return n + m;
    }

    public static int sumar(int n, int m, int p) {
        return n + m + p;
    }

    public static float sumar(float f, float g) {
        return f + g;
    }

    public static double sumar(double x, double y) {
        return x + y;
    }

}//main
