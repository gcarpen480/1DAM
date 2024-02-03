/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;

/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador  = 0;
        int suma;
        int dado1 ,dado2 ,dado3;
        
        do {
            contador = contador + 1;
            dado1 = (int)(Math.random()*6 +1);
            dado2 = (int)(Math.random()*6 +1);
            dado3 = (int)(Math.random()*6 +1);
        } while (contador == 3);
        
        suma = (dado1) + (dado2) + (dado3);
        
        
        System.out.println("Tirada 1:"+dado1);
        System.out.println("Tirada 2:"+dado2);
        System.out.println("Tirada 3:"+dado3);
        System.out.println("La suma de los dados es:"+suma);
    }
    
}
