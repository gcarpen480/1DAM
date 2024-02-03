/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio19ud06;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Manuel Ripalda
 */
/*Necesitamos crear un programa para mostrar el ranking de puntuaciones de un torneo de
ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las puntuaciones de todos los
jugadores (habitualmente valores entre 1000 y 2800, de tipo entero) y luego muestre las
puntuaciones en orden descendente (de la más alta a la más baja).*/
public class Ejercicio19Ud06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        
        int puntuacion,vector[]=new int[8];
        
        for (int i = 1; i <= 8; i++) {
            
            do{
                System.out.println("Introduce la puntuación del jugador nº"+i+": ");
                
                puntuacion=sc.nextInt();
                
            }while(puntuacion<1000 || puntuacion>2800);
            
            
            vector[i-1]=puntuacion;
            
        }
        
        Arrays.sort(vector);
        
        for (int j = 7; j >= 0; j--) {
            
            System.out.print(vector[j]+" ");
            
        }        
    }
}
