/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio16ud06;
import java.util.Arrays;

/**
 *
 * @author Manuel Ripalda
 */
/*Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5 etc. hasta introducir 10 diez veces, y luego la
muestre por pantalla. En esta ocasión has de utilizar Arrays.fill().*/
public class Ejercicio16Ud06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int vector[],longitudVector=0,inicio=0;
        
        for (int i = 1; i <= 10; i++) { 
            for (int j = 1; j <= i; j++) {
             
                longitudVector++;   
            } 
        }     
        vector=new int[longitudVector];
        
        for (int i = 1; i <= 10; i++) { 
   
            Arrays.fill(vector, inicio, inicio+i, i);
               
            inicio+=i;     
        }
        
        for (int j = 0; j < vector.length; j++) {
            
            System.out.print(vector[j]+" ");
            
        }
    }

}
