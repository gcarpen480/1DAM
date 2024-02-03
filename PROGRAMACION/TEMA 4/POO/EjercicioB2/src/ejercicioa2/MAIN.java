/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicioa2;
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
        
        Persona p1 = new Persona("Amador","789456123C","Rivas",35);
        Persona p2 = new Persona("Maite","123456789A","Figueroa",45);
        
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println(p1.nombre+" "+p1.apellidos+" "+p1.dni+" "+p1.edad);
        System.out.println(p2.nombre+" "+p2.apellidos+" "+p2.dni+" "+p2.edad);
                
        System.out.println("");
        
        if (p1.edad >= 18) {
            System.out.println(p1.nombre+" "+"es mayor de edad");
        }
        else{
            System.out.println(p1.nombre+" "+"no es mayor de edad");
        }
        
        if (p2.edad >= 18) {
            System.out.println(p2.nombre+" "+"es mayor de edad");
        }
        else{
            System.out.println(p2.nombre+" "+"no es mayor de edad");
        }
        
    }//main

}//class
