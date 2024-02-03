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
        
        Articulo a1 = new Articulo(12,21,4,"Zapatillas",50);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(a1.getnombre() + "("+a1.getcuantosQuedan()+")" + " " + a1.getiva() +("%"));
        System.out.println("Precio Total con IVA incluido: "+a1.getPVP(5)+"€");
        System.out.println("");
        
        //Descuento
        System.out.println("Precio final con un descuento realizado "+a1.getDescuento(50));
        System.out.println("");
        
        //Ventas
        System.out.println(a1.getvender(3));
        System.out.println("");
        
        
        //Almacenar
        System.out.println(a1.getalmacenar(2));
        System.out.println("");
        
        System.out.println("Total de Productos en Almacen: "+a1.getcuantosQuedan());
    }//main

}//class
