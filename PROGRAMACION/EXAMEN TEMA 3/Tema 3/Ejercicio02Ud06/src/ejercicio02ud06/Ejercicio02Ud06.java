/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio02ud06;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/* Crea un programa que pida diez números reales por teclado, los almacene en un array, y
luego muestre la suma de todos los valores.
*/
public class Ejercicio02Ud06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner pregunta=new Scanner(System.in); 
     
        double[] vector= new double[10]; 
               
        double sumaValores=0;
                
        pregunta.useLocale(Locale.US);
       
        for (int i = 0; i < vector.length; i++) {
            
            System.out.print("Introduce un número real: ");

            vector[i]=pregunta.nextDouble();
            
            sumaValores+=vector[i];
            
        }
        System.out.print("La suma de los valores introducidos es: ");
        System.out.printf("%1.2f",+sumaValores);
    }
}
