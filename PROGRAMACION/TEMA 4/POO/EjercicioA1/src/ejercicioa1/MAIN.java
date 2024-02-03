/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicioa1;
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
        
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        Punto p3 = new Punto();
        
        p1.x = 5; p1.y = 0;
        p2.x = 10; p2.y = 10;
        p3.x = -3; p3.y = 7;
        
        System.out.println("El primer punto de P1: "+p1.x+" : "+p1.y);
        System.out.println("El primer punto de P1: "+p2.x+" : "+p2.y);
        System.out.println("El primer punto de P1: "+p3.x+" : "+p3.y);
        
    }//main

}//class
