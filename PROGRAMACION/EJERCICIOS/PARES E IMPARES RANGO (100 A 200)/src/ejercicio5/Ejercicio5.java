/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;


/**
 *
 * @author Gonzalo
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int suma,par,impar;
        
        par = 100;
        impar = 101;
        
        for (int i = 102; i <= 200; i+=2) {
            par = par + i;
        }
        for (int i = 103; i < 200; i+=2) {
            impar = impar + i;
        }
        System.out.println(par);
        System.out.println(impar);
        
        suma = par + impar;
        
        System.out.println(suma);
 
    }
    
}
