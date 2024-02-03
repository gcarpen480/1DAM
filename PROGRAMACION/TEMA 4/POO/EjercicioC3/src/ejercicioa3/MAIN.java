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
        System.out.println("El perimetro del primer rectangulo es : " + (r1.getX2() + r1.getX1()*2) + (r1.getY2() + r1.getY1()*2));
        System.out.println("El area del primer rectangulo es : " + (r1.getX2() + r1.getX1())*(r1.getY2() + r1.getY1()));
        System.out.println("El perimetro del primer rectangulo es : " + (r2.getX2() + r2.getX1()*2) + (r2.getY2() + r2.getY1()*2));
        System.out.println("El area del primer rectangulo es : " + (r2.getX2() + r2.getX1())*(r2.getY2() + r2.getY1()));

    }//main

}//class
