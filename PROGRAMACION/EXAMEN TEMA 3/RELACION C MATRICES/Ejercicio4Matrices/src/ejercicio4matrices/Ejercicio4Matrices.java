/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4matrices;

import java.util.*;

/**
 *
 * @author Gonzalo
 */
public class Ejercicio4Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        int v1[][] = new int[4][2];
        int max = 0, min = 10, media = 0;

        System.out.println("Introduzca las notas de los alumnos:");
        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v1[0].length; j++) {
                System.out.println("Introduzca la nota del alumno " + i);
                v1[i][j] = sc.nextInt();

                if (v1[i][j] > max) {
                    max = v1[i][j];
                }
                if (v1[i][j] < min) {
                    min = v1[i][j];
                }

                media = v1[i][j] / 2;
            }

            System.out.println("La nota max del usuario " + i + 1 + " es de: " + max);
            System.out.println("La nota min del usuario " + i + 1 + " es de: " + min);
            System.out.println("La nota media del usuario " + i + 1 + " es de: " + media);
        }
    }
}
