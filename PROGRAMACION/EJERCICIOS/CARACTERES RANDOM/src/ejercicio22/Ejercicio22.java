/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;
/*
Numeros aleatorios que posteriomente se convierte en caracteres a traves de un
switch.
*/
/**
 *
 * @author Gonzalo
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num,longitud;
        
        for (int i = 1; i < 10; i++) {
            longitud = (int)(Math.random()*40);
            for (int j = 1; j <=longitud; j++) {
                num = (int)(Math.random()*6);
                switch (num) {
                    case 1:
                        System.out.print("*");
                        break;
                    case 2:
                        System.out.print("-");
                        break;
                    case 3:
                        System.out.print("=");
                        break;
                    case 4:
                        System.out.print(".");
                        break;
                    case 5:
                        System.out.print("|");
                        break;
                    case 6:
                        System.out.print("@");
                        break;
                }
            }
            System.out.println("");
        }
        
    }
    
}
