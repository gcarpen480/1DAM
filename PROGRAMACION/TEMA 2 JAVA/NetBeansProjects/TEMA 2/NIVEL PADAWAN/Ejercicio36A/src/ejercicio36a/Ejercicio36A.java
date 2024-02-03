/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio36a;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio36A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int altura = 0;
        boolean repetir;
        
        Scanner scanner = new Scanner(System.in);
        
        do {
            repetir = false;
            try {
                System.out.println("Ingrese la altura para la X");
                altura = scanner.nextInt();

            } catch (Exception e) {
                System.out.println("Valor no válido, tipo de excepción " + e.toString());
                repetir = true;
            }
            
            if (altura % 2 == 0) {
                if (altura < 3) {
                    System.out.println("No valido la altura debe ser numero"+
                            "impar o igual a 3");
                }
                repetir = true;
            }
        } while (repetir);
        
        for (int i = 0; i < altura; i++) { //Salto de linea
                for (int j = 0; j < altura; j++) { //Salto entre los caracteres
                    if (i == j || i + j == altura - 1) {//Imprime los asteriscos
                        System.out.print("*"); //Imprime los asteriscos
                    } else {
                        System.out.print(" ");//Imprime los espacios
                    }
                }
                System.out.println();
            }
    }
    
}
