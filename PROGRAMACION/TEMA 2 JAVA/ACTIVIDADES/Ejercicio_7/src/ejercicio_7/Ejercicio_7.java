/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_7;
import java.util.Scanner;

/*
Escribe un programa que lea un valor correspondiente a una distancia en millas 
marinas y escriba la distancia en metros. Sabiendo que una milla marina 
equivale a 1.852 metros.

*/
/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        
        double millas,operaciones;
        
        //Operaciones de entrada
        
        System.out.println("Introduzca las millas marinas");
        Scanner sn = new Scanner (System.in);
        millas = sn.nextDouble();
        
        //Operaciones
        
        operaciones = millas * 1852;
        
        //Operaciones de salida
        
        System.out.println("Estas son las millas en metros: " + operaciones);
        
        
        
    }
    
}
