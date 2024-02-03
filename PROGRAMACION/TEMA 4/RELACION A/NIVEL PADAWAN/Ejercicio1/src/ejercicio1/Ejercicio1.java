/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/*
Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
resultado de multiplicarlos. Implementa y utiliza la función:

double multiplica(double a, double b) // Devuelve la multiplicación de dos números
*/
/**
 *
 * @author usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        double a , b;
        
        sc.locale.
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduzca un numero:");
        a = sc.nextDouble();
        
        System.out.println("Introduzca otro numero:");
        b = sc.nextDouble();
        
        System.out.println("La multiplicacion es "+multiplica(a,b));
        
    }
    
    public static double multiplica(double a , double b){
        double multiplicar;
        
        multiplicar = a * b;
        
        return multiplicar;
    }
    
}
