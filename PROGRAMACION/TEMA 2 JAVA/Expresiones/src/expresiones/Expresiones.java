/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expresiones;
import java.util.Scanner;
/**
 *
 * @author Gonzalo
 */
public class Expresiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int div, x, y ,z;
        
        x=3;
        y=0;
        boolean repetir;
        
        do {
            repetir = false;
            try{
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            div=x/y;       
            System.out.println("div = " + div);
            System.out.println("Introduce un numero entero");
            z = sc.nextInt();
        }
        catch(ArithmeticException ex){
            System.out.println("No se puede dividir por 0");
            System.out.println("Valor no válido, tipo de excepción " + e.toString());                                             
            sc.nextLine();
            repetir = true;
        }
        finally{
            System.out.println("Esta frase se imprime pase lo que pase "
                    + "porque está incluida dentro de finally");
        }
        } while (true);
        
        
    }
    
}
