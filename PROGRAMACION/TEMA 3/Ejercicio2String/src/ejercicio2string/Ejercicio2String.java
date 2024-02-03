/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2string;
import java.util.Scanner;
/*
Crea un programa que pida dos cadenas de texto por teclado y luego indique 
si son iguales, además de si son iguales sin diferenciar entre 
mayúsculas y minúsculas.

*/
/**
 *
 * @author Gonzalo
 */
public class Ejercicio2String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena , cadena1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca una primera cadena:");
        cadena = sc.next();
        
        System.out.println("Introduzca una segunda cadena:");
        cadena1 = sc.next();
        
        System.out.println("");
        System.out.println(cadena.equalsIgnoreCase(cadena1));
        
        
        
        
    }
    
}
