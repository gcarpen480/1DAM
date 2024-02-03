/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicioa3;
import java.util.*;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */

/* -----------------------------------ENUNCIADO---------------------------------


   -----------------------------------------------------------------------------
*/
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo();
        
         // Les damos valores
        
        r1.x1 = 0; r1.y1 = 0; r1.x2 = 5; r1.y2 = 5;
        r2.x1 = 0; r2.y1 = 0; r2.x2 = 5; r2.y2 = 5;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------RECTANGULO 1-----------");
        System.out.println("Introduzca el primer punto :");
        r1.x1 = sc.nextInt();
        r1.y1 = sc.nextInt();
        
        System.out.println("Introduzca el segundo punto :");
        r1.x2 = sc.nextInt();
        r1.y2 = sc.nextInt();
        
        System.out.println("------RECTANGULO 2--------");
        System.out.println("Introduzca el primer punto :");
        r2.x1 = sc.nextInt();
        r2.y1 = sc.nextInt();
        
        System.out.println("Introduzca el segundo punto :");
        r2.x2 = sc.nextInt();
        r2.y2 = sc.nextInt();
       
        System.out.println("");
       System.out.println("El perimetro del primer rectangulo es : "+r1.calcularPerimetro());
       System.out.println("El area del primer rectangulo es : "+r1.calcularArea());
       System.out.println("El perimetro del segundo rectangulo es : "+r2.calcularPerimetro());
       System.out.println("El area del segundo rectangulo es : "+r2.calcularArea());
       
       
    }//main

}//class
