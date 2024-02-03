/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;
/*
Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados 
por espacios.
*/
/**
 *
 * @author Gonzalo
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 1; i <= 20; i++) {
            int num = (int)(Math.random()*10);
            System.out.print(num+" ");
        }
        
    }
    
}
