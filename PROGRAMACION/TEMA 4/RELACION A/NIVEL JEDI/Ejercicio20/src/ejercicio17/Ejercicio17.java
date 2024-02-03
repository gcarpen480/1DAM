/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero para mostrar su tabla de multiplicar");
        int num = sc.nextInt();

        tabla(num);
    }

    public static void tabla(int num) {
        for (int i = 1; i < 11; i++) {
            int multi = num * i;
            System.out.println(num + "x" + i + "=" + multi);

        }
    }
}
