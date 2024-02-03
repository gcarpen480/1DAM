/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_10;
import java.util.Scanner;

/*
Escribe un programa que lee dos números, calcula y muestra el valor de su 
suma, resta, producto y división. (Ten en cuenta la división por cero)
*/

/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        
        double n1 , n2 , suma , resta , producto , division = 0;
        
        //Se le informa al usuario que debe de introducir los numeros
        
        
        System.out.println("Introduzca un numero");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextDouble();
        
        System.out.println("Introduzca otro numero");
        Scanner sn = new Scanner(System.in);
        n2 = sc.nextDouble();
        
        //Operaciones
        
        suma = n1 + n2;
        resta = n1 - n2;
        producto = n1 * n2;
        
        if (n2 == 0){
            System.out.println("No se puede realizar la operacion");
        }
        else{
            division = n1 / n2;
        }
        
        //Operaciones de salida (Se muestra en pantalla los resultados)
        
        System.out.println("Este el resultado de la suma: " +suma);
        System.out.println("Este es el resultado de la resta: " +resta);
        System.out.println("Este es el resultado  del producto: " +producto);
        System.out.println("Este es el resultado del producto: " +division);
        
    }
    
}