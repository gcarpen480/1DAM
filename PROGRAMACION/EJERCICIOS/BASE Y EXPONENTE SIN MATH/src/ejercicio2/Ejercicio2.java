/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int potencia = 1;
        int resultado = 0;
            
        System.out.println("Escribe la base de la potencia");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        
        System.out.println("Escribe el exponente de la potencia");
        int exponente = sc.nextInt();
        
        for (int i = 0; i < exponente; i++) {
            resultado = potencia * base;
            potencia = resultado;
        }
        System.out.println(potencia);
        
    }
    
}
