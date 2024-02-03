/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bombillas;
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
        
        Bombillas b1 = new Bombillas(true);
        Bombillas b2 = new Bombillas(false);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Estado de las bombillas");
        b1.mostrarEstado();
        b2.mostrarEstado();
        System.out.println("");
        
        System.out.println("Apagando o Enciendo las bombillas");
        b1.encenderBom();
        b2.encenderBom();
        System.out.println("");
        
//        System.out.println("Volvemos a mostar el estado de las bombillas: ");
//        b1.mostrarEstado();
//        b2.mostrarEstado();
//        System.out.println("");
        
        System.out.println("Apagamos el general");
        b1.apagadoGeneral();
        System.out.println("");
        
        
        
        System.out.println("Mostrar estado del general / bombillas");
        System.out.println("");
        
        b1.estadoGeneral();
        b1.mostrarEstado();
        b2.mostrarEstado();
        System.out.println("");
        
        System.out.println("Encendemos el general");
        b1.apagadoGeneral();
        System.out.println("");
        
        System.out.println("Mostrar estado del general / bombillas");
        System.out.println("");
        
        b1.estadoGeneral();
        b1.mostrarEstado();
        b2.mostrarEstado();
        
    }//main

}//class
