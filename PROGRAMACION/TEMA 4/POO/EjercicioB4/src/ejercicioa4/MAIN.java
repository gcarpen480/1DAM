/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicioa4;
import java.util.*;

/**
º *
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
        
        Articulo a1 = new Articulo(12,21,4,"Zapatillas");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(a1.nombre + "("+a1.cuantosQuedan+")" + " " + a1.iva +("%"));
        System.out.printf("%.2f",(a1.precio+(a1.precio * a1.iva)/100));
        System.out.println("");
        
    }//main

}//class
