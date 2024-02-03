/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4string;
import java.util.Scanner;
/*
Crea un programa que muestre por pantalla cuantas vocales de cada tipo 
hay (cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. 
No se debe diferenciar entre mayúsculas y minúsculas. 
Por ejemplo dada la frase “Mi mama me mima” dirá que hay:

Nº de A's: 3
Nº de E's: 1
Nº de I's: 2
Nº de O's: 0
Nº de U's: 0

*/
/**
 *
 * @author Gonzalo
 */
public class Ejercicio4String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
         
        String frase;
        
        int contA = 0 , contE = 0, contI = 0, contO = 0, contU = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca una frase:");
        frase = sc.nextLine();
        
        frase = frase.toLowerCase();
        
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            
            switch (caracter) {
                case 'a':
                    contA++;
                    break;
                case 'e':
                    contE++;
                    break;
                case 'i':
                    contI++;
                    break;
                case 'u':
                    contU++;
                    break;
                case 'o':
                    contO++;
                    break;
                default:
                    
            }
        }
        
        System.out.println(contA);
        System.out.println(contE);
        System.out.println(contI);
        System.out.println(contO);
        System.out.println(contU);
    }
}
