/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/*
Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad
o no. Implementa y utiliza la función:
boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario

*/
/**
 *
 * @author usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int a;
        
        System.out.println("Introduzca tu edad:");
        Scanner sc = new Scanner (System.in);
        a = sc.nextInt();
        
        System.out.println("La edad introducidad "+esMayorEdad(a));
        
    }
    
    public static boolean esMayorEdad (int a){
        boolean edad = false;
        
        if (a >= 18) {
            edad = true;
        }
        
        return edad;
    }
    
    
}
