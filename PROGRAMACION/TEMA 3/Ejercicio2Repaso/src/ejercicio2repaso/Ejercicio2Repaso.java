/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2repaso;
import java.util.*;
/*

Escribe un programa que contenga un vector de tamaño N definido por una 
constante. A continuación, lee N números por teclado y almacénalos en dicho 
vector. Luego, desplaza los elementos de manera que el de la posición 0 pase a 
la posición 1, el de la posición 1 a la 2, etc. El número que se encuentra en 
la posición final debe pasar a la número 0. Muestra por pantalla el resultado 
inicial y el final. Utiliza un solo vector para todo el proceso.

*/
/**
 *
 * @author Gonzalo
 */
public class Ejercicio2Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        int ultimo, n = 5;

        int v1[] = new int[n];

        System.out.println("Introduzca 5 números: ");
        for (int i = 0; i < n; i++) {
            v1[i] = sc.nextInt();
        }

        ultimo = v1[n - 1];

        for (int i = n - 1; i > 0; i--) {
            v1[i] = v1[i - 1];
        }
        v1[0] = ultimo;

        System.out.println("Estos son los números desplazados:");
        
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");
        }

        System.out.println();

    }

}
