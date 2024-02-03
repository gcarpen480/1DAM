/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;
import java.util.Scanner;
/*
Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el 
ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo 
números una y otra vez hasta adivinarlo (el usuario deberá indicarle al 
ordenador si es mayor, menor o igual al número que ha pensado).
*/
/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        
        int max , min , num ;
        
        String respuesta;
        
        boolean seguir = false;
        
       Scanner sc = new Scanner(System.in);
        
        max = 101;
        min = 0;
        
        while (seguir==false){
            num = (max + min)/2;
            if (num>=1) {
                System.out.println("¿El numero es "+num+"? (=,+ o -)");
                respuesta = sc.next();
                
                switch (respuesta){
                    case "=":
                        seguir = true;
                        
                        System.out.println("He acertado");
                        
                        break;
                        
                    case "+":
                        min = num;
                        
                        break;
                        
                    case "-":
                        
                        max = num;
                        
                        break;
                        
                    default:
                        
                }
            }
            
            
        }
    }
    
}
