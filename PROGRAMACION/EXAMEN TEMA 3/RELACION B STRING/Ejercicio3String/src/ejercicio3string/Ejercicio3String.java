/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3string;
import java.util.Scanner;
/*
Realiza un programa que lea una frase por teclado e indique si la frase 
es un palíndromo o no (ignorando espacios y sin diferenciar entre mayúsculas 
y minúsculas). Supondremos que el usuario solo introducirá letras y espacios 
(ni comas, ni puntos, ni acentos, etc.). Un palíndromo es un texto que se 
lee igual de izquierda a derecha que de derecha a izquierda. Por ejemplo:

Amigo no gima
Dabale arroz a la zorra el abad
Amo la pacífica paloma
A man a plan a canal Panama

*/
/**
 *
 * @author Gonzalo
 */
public class Ejercicio3String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena , cadena1 , cadena2, s3,s4,s5,s6;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca tu nombre:");
        cadena = sc.next();
        
        System.out.println("Introduzca tu primer apellido:");
        cadena1 = sc.next();
        
        System.out.println("Introduzca tu segundo apellido:");
        cadena2 = sc.next();
        
        s4=cadena.substring(0,3);
        s5=cadena1.substring(0,3);
        s6=cadena2.substring(0,3);
        
        s3 = s4 + s5 + s6;
        
        System.out.println("");
        System.out.println(s3.toUpperCase());
        
    }
    
}
