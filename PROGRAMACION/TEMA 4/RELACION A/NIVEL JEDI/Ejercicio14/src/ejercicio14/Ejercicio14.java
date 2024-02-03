/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/*
Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá recibir
dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.


*/
/**
 *
 * @author usuario
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String caracter;
        
        int lineas;
        
        System.out.println("Introduzca el caracter para la piramide: ");
        caracter = sc.next();
        
        System.out.println("Introduzca el numero de filas para el trinagulo: ");
        lineas = sc.nextInt();
        
        piramide (caracter,lineas);
        
    }
    
    public static void piramide (String caracter , int lineas){

        int blancos = 1,carac = 1;
        
        blancos = lineas -1;
        
        for (int i = 1; i <= lineas; i++) {
            for (int j = 1; j <= blancos; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= carac; j++) {
                System.out.print(caracter);
            }
            
            System.out.println(" ");
            carac = carac + 2;
            blancos = blancos - 1;
            
        }
        
    } 
    
}
