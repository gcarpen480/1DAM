/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1string;
import java.util.*;
/*
Crea un programa que pida una cadena de texto por teclado y luego muestre 
cada palabra de la cadena en una línea distinta.
*/
/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio1String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String Cadena;
        
        String [] Cadena2;
        
        Scanner lector = new Scanner (System.in);
        
        Cadena = lector.nextLine();
        
        Cadena2 = Cadena.split( " ");
        
        for (int i = 0; i < Cadena2.length; i++) {
            System.out.println(Cadena2[i]);
            
        }
        
    }
    
}
