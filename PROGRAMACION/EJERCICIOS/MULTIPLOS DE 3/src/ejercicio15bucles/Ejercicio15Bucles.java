/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15bucles;
import java.util.Scanner;
/*
Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que
introducimos por teclado.
/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio15Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador = 0;
        int numero;
        
        System.out.println("Dime un numero:");
        Scanner sc = new Scanner(System.in);
        
        do {    
            numero = sc.nextInt();
        } while (numero > 0);
        
        for (int i = 3; i <= numero; i+=3) {
            contador ++;
        }
        
        System.out.println("Cantidad de multiplos de 3:"+contador);
        
    }
    
}
