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

        Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo r2 = new Rectangulo(0, 0, 5, 5);

        // Les damos valores
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("El perimetro del primer rectangulo es : " + (r1.x2 + r1.x1*2) + (r1.y2 + r1.y1*2));
        System.out.println("El area del primer rectangulo es : " + (r1.x2 + r1.x1)*(r1.y2 + r1.y1));
        System.out.println("El perimetro del primer rectangulo es : " + (r2.x2 + r2.x1*2) + (r2.y2 + r2.y1*2));
        System.out.println("El area del primer rectangulo es : " + (r2.x2 + r2.x1)*(r2.y2 + r2.y1));

    }//main

}//class
