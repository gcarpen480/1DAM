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
    En España existen tres tipos de IVA según el tipo de producto:
    • El IVA general (21%): para la mayoría de productos a la venta.
    • El IVA reducido (10%): hostelería, transporte, vivienda, etc.
    • El IVA super reducido (4%): alimentos básicos, libros, medicamentos, etc.

Estos tres tipos de IVA no pueden variar y a cada artículo se le aplicará uno de los tres.
Razona qué cambios sería necesario realizar a la clase Articulo e impleméntalos.
   -----------------------------------------------------------------------------
*/
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Articulo a1 = new Articulo(12,4,"Zapatillas",50);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el producto que va a comprar "
                + "dependiendo del producto se le aplicara un IVA distinto");
        
        System.out.println("--- ARTICULOS ---");
        System.out.println("1. Cualquier producto que no se "
                + "mencionado en las otras opciones");
        System.out.println("2. Hosteleria , Transporte , Vivienda");
        System.out.println("3. Alimentos Basicos , Libros , Medicamentos");
        int respuesta = sc.nextInt();
        
        switch (respuesta) {
            case 1:
                System.out.println(a1.getnombre() + "("+a1.getcuantosQuedan()+")" + " " + a1.getIVA()+("%"));
                System.out.println("Precio Total con IVA incluido: "+a1.getPVP(0)+"€");
                System.out.println("");
                break;
            case 2:
                System.out.println(a1.getnombre() + "("+a1.getcuantosQuedan()+")" + " " + a1.getIVAR()+("%"));
                System.out.println("Precio Total con IVA incluido: "+a1.getPVPR(0)+"€");
                System.out.println("");
                break;
            case 3:
                System.out.println(a1.getnombre() + "("+a1.getcuantosQuedan()+")" + " " + a1.getIVASR()+("%"));
                System.out.println("Precio Total con IVA incluido: "+a1.getPVPS(0)+"€");
                System.out.println("");
                break;
            default:
                throw new AssertionError();
        }
        
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
