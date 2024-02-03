/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/*
Realiza un programa que sume independientemente los pares y los impares de 
los números comprendidos entre 100 y 200, y luego muestra por pantalla 
ambas sumas
*/
/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int par , impar , suma = 0;
        
        par = 0;
        impar = 0;
        
        for (int i = 100; i < 200; i++) {
         
            if (i%2==0){
                par = par + i;  
            }
            else{
                impar = impar + i;
            }
            
            suma = par + impar;
        }
        
        System.out.println("La suma de los numeros pares es: " +par);
        System.out.println("La suma de los numeros impares es: " +impar);
        System.out.println("La suma de los pares e impares es: " +suma);
    }
    
}
