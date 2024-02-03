/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio18ud06;
import java.util.Arrays;


/**
 *
 * @author Manuel Ripalda
 */
/*Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0
y 9 (utiliza Math.random()*10). Luego ordena los valores del array y los mostrará por
pantalla.*/
public class Ejercicio18Ud06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int vector[]=new int[30];
        
        for (int i = 0; i < vector.length; i++) {
            
            vector[i]=(int)(Math.random()*10);
           
        }
        
        Arrays.sort(vector);
        
        for (int j = 0; j < vector.length; j++) {
            
            System.out.print(vector[j]+" ");
            
        }
    }
}
