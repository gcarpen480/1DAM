/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;
import java.util.Scanner;

/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero;
        int contador=0;
        int contador2 = 1;
        
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        
        do {
            if (numero > 0) {
                System.out.println("*");
                        
                contador++;
            }
            else{
                System.out.println("El numero introduico no es valido");
            }
        } while (contador != numero);
        
        do {
            if (numero % 2 == 0 + 1) {
                System.out.print("*");
                contador++;
            }
        } while (contador2 != numero);
        
        System.out.println("");
        
        
    }
    
}
