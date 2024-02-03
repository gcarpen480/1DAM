/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;
import java.util.Scanner;
/*
Media de los digitos del numero introducido
*/
/**
 *
 * @author Gonzalo
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num,digito,invertido = 0,media = 0,suma=0;
        int contador = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");     
        num = sc.nextInt();

        while (num !=0) {
             digito = num % 10;
             contador = contador +1;
             suma = suma + digito;
             num = num / 10;

        }
        
        media = suma / contador;
        System.out.print(media);
        System.out.println("");
        
    }
    
}
