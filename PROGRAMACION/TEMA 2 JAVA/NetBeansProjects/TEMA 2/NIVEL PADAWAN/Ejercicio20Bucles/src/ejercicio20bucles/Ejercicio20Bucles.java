/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20bucles;
import java.util.Scanner;

/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio20Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Se definen las variables que se van a utilizar en el ejercicio
        int num;
        
        //Se indica que es lo que tiene que introducir por teclado el usuario
        System.out.println("Escrciba un número entero entre 0 y 20");
        
        //Se crea un objeto Scanner para recoger lo escrito por teclado
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        //Se realizan las condiciones y/o los bucles
        for (int i = 1; i <= num; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
        }
        System.out.println("");
        
    }
    
}
