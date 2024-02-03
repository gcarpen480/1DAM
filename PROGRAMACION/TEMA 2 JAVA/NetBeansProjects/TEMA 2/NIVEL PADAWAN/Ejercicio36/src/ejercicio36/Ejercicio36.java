/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio36;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int altura = 0;
        boolean repetir;
        
        //Operaciones de entrada
        Scanner scanner = new Scanner(System.in);
        
        do {
            repetir = false;
            try {
                System.out.print("Ingrese la altura de la X:");
                altura = scanner.nextInt();
                
            } catch (Exception e) {
                System.out.println("Valor no válido, tipo de excepción " + e.toString());                                             
                repetir = true;
            }
            if (altura % 2 == 0) {
                if(altura < 3){
                    System.out.println("No valido la altura debe ser un número impar"+
                    "mayor o igual a 3.");
                    repetir = true;
            } 
        } 
    }
}
