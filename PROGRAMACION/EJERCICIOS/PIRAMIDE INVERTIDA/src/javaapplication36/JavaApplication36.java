/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication36;
import java.util.Scanner;

/**
 *
 * @author Gonzalo Carretero
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int altura;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura del triángulo: ");
        altura = scanner.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" "); // Espacios en blanco para alinear a la izquierda
            }
            for (int j = 1; j <= 2 * (altura - i) + 1; j++) {
                if (j == 1 || j == 2 * (altura - i) + 1 || i == altura) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Espacios en blanco para el interior del triángulo
                }
            }
            System.out.println(); // Cambiar de línea después de cada fila
        }
    }
}
