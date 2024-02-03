/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_8;
import java.util.Scanner;

/*
Escribe un programa que pide la edad por teclado y nos muestra el mensaje de
“Eres mayor de edad” solo si lo somos.

*/
/**
 *
 * @author Gonzalo Carretero Peñalosa
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int edad;
        
        //Operaciones de entrada
        
        System.out.println("Escriba tu edad actual: ");
        Scanner sc = new Scanner(System.in);
        edad = sc.nextInt();
        
        //Operaciones
        
        if (edad > 18)
        {
            System.out.println("Eres mayor de edad");
        }  
    } 
}
