/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18bucles;
/******************************************************************************
Realiza un programa para calcular la suma de los cuadrados de los 5 primeros 
números naturales.
*/
/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio18Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 5;
        double cuadrado = 0;
        double suma = 0;
        
        do {
            cuadrado = Math.pow(i, 2);
            suma = suma + cuadrado;
            i--;
        } while (i != 0);
        
        System.out.println(suma);
        
    }
    
}
