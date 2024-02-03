/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
/*
Numeros Pares
*/
/**
 *
 * @author Gonzalo
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num = 0,contador = 0,contador1= 0;

        while (num != 24) {
            num = (int)(Math.random()*101);
            if (num > 0 && num < 100) {
                contador1++;
                if (num % 2 ==0) {
                    System.out.print("   ");
                    System.out.println("Pares");
                    System.out.print("   ");
                    System.out.println(num);
                    contador++;
                }
                
            }    
        }
        System.out.println("Numeros introducidos pares: " +contador);
        System.out.println("Numeros introducidos: "+contador1);
    }
    
}
