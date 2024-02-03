/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;

/*
 Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso 
 del operador de potencia (^), siendo A y B valores introducidos por teclado, y 
 luego muestre el resultado por pantalla.
*/
/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Varibles
        
        int base , exponente ,potencia;
        
        //Operaciones
        
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
        
        potencia = 1;
        
        do {
            if (exponente > 0) {
                potencia = base;
            }
            else{
                potencia  = potencia * base;
                exponente = exponente - 1;
        } while (exponente == 0);
        }
        System.out.println("La potencia vale " +potencia);
