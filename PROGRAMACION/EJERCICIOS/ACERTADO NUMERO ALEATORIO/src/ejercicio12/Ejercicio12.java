/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador = 5,num,num1;
        boolean acierto = true;
        
        num = (int)(Math.random()*100); 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");    
        System.out.println(num);

        while (acierto == true) {
            num1 = sc.nextInt();
            if (num1 == num) {
                System.out.println("Has acertado Maricon");
                acierto = false;
            }
            if (num > num1) {
                System.out.println("El numero introducido es mayor");
                System.out.println("Intento menos");
                System.out.println("Intentos restantes:"+contador);
            }
            else {
                System.out.println("El numero introducido es menor");
                System.out.println("Intento menos");
                System.out.println("Intentos restantes:"+contador);
            }
            contador--;
            if (contador ==0) {
               System.out.println("Te has quedado sin aciertos"+contador);
               acierto = false;
            }
        }
        
    }
    
}
