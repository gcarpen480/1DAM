/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
/*
Tirada de dados y su posteriomente su suma
*/
/**
 *
 * @author Gonzalo
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           int dado1,dado2,dado3,contador = 0,total;

            dado1 = (int)(Math.random()*6 + 1);
            dado2 = (int)(Math.random()*6 + 1);
            dado3 = (int)(Math.random()*6 + 1);
        
        
        System.out.println(dado1);
        System.out.println(dado2);
        System.out.println(dado3);
        
        total = dado1 + dado2 + dado3;
        
        System.out.println(total);
        
    }
    
}
