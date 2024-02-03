    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4repaso;
import java.util.*;
/*
Crea un algoritmo que pida 5 palabras por teclado y que al final nos 
muestre la de mayor y menor longitud. Si coinciden dos o más palabras con 
la mayor o menor longitud, entonces se mostrará la primera que se introdujo.

*/
/**
 *
 * @author Gonzalo
 */
public class Ejercicio4Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        String palabra,palabraMayor = "",palabraMenor = "";
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca una palabra:");
            palabra = sc.nextLine();
            
            if (i == 0 || palabra.length() > palabraMayor.length()) {
                palabraMayor = palabra;
            }
            
            if (i == 0 || palabra.length() < palabraMenor.length()) {
                palabraMenor = palabra;
            }
            
        }
        
        System.out.println("La palabra con mayor longitud es :"+palabraMayor);
        System.out.println("La palabra con menor longitud es :"+palabraMenor);
    }
    
}
