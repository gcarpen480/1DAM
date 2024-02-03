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
        
        System.out.println(p1.getNOMBRE()+" "+p1.getAPELLIDOS()+" "+p1.getDNI()+" "+p1.getEDAD());
        System.out.println(p2.getNOMBRE()+" "+p2.getAPELLIDOS()+" "+p2.getDNI()+" "+p2.getEDAD());
                
        System.out.println("");
        
        if (p1.getEDAD() >= 18) {
            System.out.println(p1.getNOMBRE()+" "+"es mayor de edad");
        }
        else{
            System.out.println(p1.getNOMBRE()+" "+"no es mayor de edad");
        }
        
        if (p2.getEDAD() >= 18) {
            System.out.println(p2.getNOMBRE()+" "+"es mayor de edad");
        }
        else{
            System.out.println(p2.getNOMBRE()+" "+"no es mayor de edad");
        }
        
    }//main

}//class
