/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio05ud06;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o
no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). Supondremos que
el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.). Un
palíndromo es un texto que se lee igual de izquierda a derecha que de derecha a izquierda.
Por ejemplo:
Amigo no gima
Dabale arroz a la zorra el abad
Amo la pacífica paloma
A man a plan a canal Panama
*/
public class Ejercicio05Ud06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String palindromo,comprobante="";
        
        
        System.out.print("Introuce una frase: ");
        
        palindromo=sc.nextLine();
        
        palindromo=palindromo.replace(" ", "");
        
        for (int i =1; i <= palindromo.length() ; i++) {
               
            comprobante+=palindromo.charAt(palindromo.length()-i);
            
        }
        
        if(palindromo.equalsIgnoreCase(comprobante)==true){
        
            System.out.println("Es un palíndromo.");
        
        }else{
        
            System.out.println("No es un palíndromo");
        
        }
    }
}
