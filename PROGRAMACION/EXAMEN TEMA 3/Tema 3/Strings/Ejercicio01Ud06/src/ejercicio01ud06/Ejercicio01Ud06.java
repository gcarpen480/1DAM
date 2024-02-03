/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio01ud06;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*________________________________Enunciado:__________________________________________
Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra
de la cadena en una línea distinta.*/
public class Ejercicio01Ud06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Introduce una cadena: ");
         
        String cadena=sc.nextLine();    
              
        if (cadena.contains(" ")){
            
            cadena=cadena.replace(' ', '\n');

        }
            System.out.println(cadena);
    }

}
