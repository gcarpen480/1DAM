/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio01ud06;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*Crea un programa que pida diez números reales por teclado, los almacene en un array, y
luego muestre todos sus valores.
*/
public class Ejercicio01Ud06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double nums[]=new double[10];
        
        Scanner pregunta=new Scanner(System.in);
        
        pregunta.useLocale(Locale.US);
        
        for (int i = 0; i < nums.length; i++) {
            
            System.out.print("Introduce un número real: ");
            
            nums[i]=pregunta.nextDouble();
            
        }
        for (double i : nums) {
            
            System.out.print(i+" / ");
        }
        
    }

}
