/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;
import java.util.Scanner;

/*
Realiza un programa que lea una secuencia de notas (con valores que van de 0 a 10) que
termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.
*/
/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        int nota;
        boolean esDiez = false;
        
        //Operaciones de entrada de datos
        Scanner sc = new Scanner(System.in);
        
        //Operaciones
        
        do {
             System.out.println("Introduzca una serie de notas");
             nota = sc.nextInt();
             if (nota==10) {
               esDiez = true;
            }
        }
        while (nota != -1);
            
        if (esDiez == true) {
            System.out.println("Se ha introducido algun diez");
        }
        else{
            System.out.println("No se ha introducido ningun diez");
        }
            
        
        
  }
}
