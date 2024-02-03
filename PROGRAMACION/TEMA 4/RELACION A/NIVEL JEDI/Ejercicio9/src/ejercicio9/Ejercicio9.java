/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/*
Realiza un programa que pida introducir tres valores enteros y nos diga cuál 
de ellos es el más elevado. Impleméntalo creando únicamente una función a la 
que le pasemos dos valores (no tres) y nos devuelva el máximo de los dos valores
*/
/**
 *
 * @author usuario
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int num1 , num2 , num3;
        
        
        System.out.println("Introduzca un numero: ");
        num1 = sc.nextInt();
        
        System.out.println("Introduzca otro numero: ");
        num2 = sc.nextInt();
        
        System.out.println("Introduzca otro numero: ");
        num3 = sc.nextInt();
        
        num1 = valores(num1,num2);
        
        num2 = num3;
        
        System.out.println("Valor maximo: "+valores(num1,num2));
        
    }
    
    public static int valores (int num1 ,int  num2){
        
        int mayor;   
        
        if (num1 < num2) {
            mayor = num2;
        }
        else{
            mayor = num1;
        }
        
        
        return mayor;
        
    }
    
}
