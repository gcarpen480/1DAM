/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20bucle;
import java.util.*;
/*
********************************************************************************
* Crea un programa que cree un array de tamaño 1000 y lo rellene con valores   *
* enteros aleatorios entre 0 y 99 (utiliza Math.random()*100).                 *
* Luego pedirá por teclado un valor N y se mostrará por pantalla               *
* si N existe en el array, además de cuantas veces.                            *
********************************************************************************
*/
/**
 *
 * @author usuario
 */
public class Ejercicio20Bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int v1 [] = new int [1000];
        
        for (int i = 0; i < v1.length; i++) {
            v1[i]=(int)(Math.random()*100);
            
        }
        
    }
    
}
