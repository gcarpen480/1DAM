/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_9;
import java.util.Scanner;
/**
 *
 * @author Gonzalo Carretero Peñalosa
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        
        int edad;
       
        //Operaciones de entrada
   
        System.out.println("Introduzca su edad actual: ");
        Scanner sc = new Scanner(System.in);
        edad = sc.nextInt();
        
        //Operaciones
        
        if (edad >18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }
        
    }
    
}
