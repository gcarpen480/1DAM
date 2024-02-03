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
        int num;

        do {
            System.out.println("Introduzca una secuencia de numero para parar introduzca un 0");
            num = sc.nextInt();

            primo(num);

            if (primo(num) == true) {
                System.out.println("El numero es primo");
            } else {
                System.out.println("El numero no es primo");
            }

        } while (num != 0);

    }

    public static boolean primo(int num) {

        boolean primo = true;

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                primo = false;
            }
        }

        return primo;

    }

}
