/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6;
import java.util.Scanner;

/*
Escribe un programa que dado el precio de un artículo y el precio de venta real 
nos muestre el porcentaje de descuento realizado
*/
/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables definidas
        
        double articulo,venta,porcentaje,descuento;
        
        System.out.println("Introduzca el precio de venta");
        Scanner sn = new Scanner(System.in);
        venta = sn.nextDouble();
        
        System.out.println("Introduzca el precio del articulo");
        Scanner sc = new Scanner(System.in);
        articulo = sc.nextDouble();
        
        //Operaciones
        
        porcentaje = (articulo*100)/venta;
        descuento = 100 - porcentaje;
        
        //Salida de informacion
        
        System.out.println();
        System.out.println("Este el porcentaje de descuento: " + descuento);
        System.out.println();
        System.out.printf("Valor: %.2f", descuento );
        System.out.println();
        System.out.println();
    }  
}
