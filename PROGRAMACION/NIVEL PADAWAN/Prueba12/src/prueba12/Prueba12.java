/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba12;
import java.util.Scanner;

/*
Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso 
del operador de potencia (^), siendo A y B valores introducidos por teclado, 
y luego muestre el resultado por pantalla.
*/
/**
 *
 * @author Gonzalo Carretero
 */
public class Prueba12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        
        int base , exponente ,potencia;
        
        //Operacines de entrada de la base y exponente si el exponente es 
        //negatvio volvera a preguntar que introduzca la base y exponente.
        
        do {
            System.out.println("Introduce la base de la potencia");
            Scanner sc = new Scanner(System.in);
            base = sc.nextInt();
            System.out.println("Introduce el exponente de la potencia");
            exponente = sc.nextInt();
            
            if (exponente<0) {
                System.out.println("El exponente tiene que ser positivo");
            }
        } while (exponente < 0);
       
        potencia = base;
        
        do {
            if (exponente == 1) {
                potencia = base;
            }
            else{
               potencia  = potencia * base;
               exponente = exponente - 1;
            }
        } while (exponente != 1);
        
        System.out.println("La potencia vale " +potencia);
  
    }
    
}
