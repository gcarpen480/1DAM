/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2repasobis;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio2RepasoBis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        int ultimo, n = 5, desplazar;

        int v1[] = new int[n];

        System.out.println("Introduzca 5 números: ");
        for (int i = 0; i < n; i++) {
            v1[i] = sc.nextInt();
        }

        System.out.println("Cuantas posiciones quieres desplazar el vector:");
        desplazar = sc.nextInt();

        for (int j = 1; j < desplazar; j++) {
            ultimo = v1[n - 1];

            for (int i = n - 1; i > 0; i--) {
                v1[i] = v1[i - 1];
            }

            v1[0] = ultimo;
        }
        
        System.out.println("Estos son los números desplazados:");
        
        for (int i = 0; i < v1.length; i++) {
                System.out.print(v1[i] + " ");
            }

        System.out.println();

    }

}
