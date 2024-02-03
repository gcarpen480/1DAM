/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio16;
import java.util.*;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */

/* -----------------------------------ENUNCIADO---------------------------------
    Escribe un programa que cree un array del tamaño indicado por teclado y luego 
    lo rellene con valores aleatorios (utiliza Math.random()). Implementa la función 
    que rellena un array con valores aleatorios.
   -----------------------------------------------------------------------------
*/
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.println("Introduzca el tamaño para el array: ");
        n = sc.nextInt();
        
        int v1[] = new int[n];
        
        rellarNum(v1);
        
    }//main
    
    public static void rellarNum (int[] v1){
        
        for (int i = 0; i < v1.length; i++) {
            v1[i] = (int)(Math.random());
            System.out.println(v1[i]+" ");
        }        
        System.out.println("");
    }

}//class
