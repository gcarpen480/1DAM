/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejemplo2;
import java.util.*;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */

/* -----------------------------------ENUNCIADO---------------------------------


   -----------------------------------------------------------------------------
*/
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creamos dos cuadrados
        Cuadrado c1 = new Cuadrado();
        Cuadrado c2 = new Cuadrado();
        
        // Les damos valores
        
        c1.x1 = 2; c1.y1 = 2; c1.x2 = 4; c1.y2 = 4;
        c2.x1 = 1; c2.y1 = 1; c2.x2 = 5; c2.y2 = 5;
        
        // Usamos sus metodos
        
        System.out.println("El perimetro de c1 es : "+c1.CalcularPerimetro());
        System.out.println("El area de c1 es : "+c1.CalcularArea());
        System.out.println("El perimetro de c2 es : "+c2.CalcularPerimetro());
        System.out.println("El area de c2 es: "+c2.CalcularArea());
        
    }//main

}//class
