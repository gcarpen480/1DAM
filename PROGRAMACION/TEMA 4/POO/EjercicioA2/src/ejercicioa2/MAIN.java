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
        
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------PERSONA 1-----------");
        System.out.println("Introduzca su nombre:");
        p1.nombre = sc.nextLine();
        
        System.out.println("Introduzca su apellido:");
        p1.apellidos = sc.nextLine();
        
        System.out.println("Introduzca su edad:");
        p1.edad = sc.nextInt();
        
        System.out.println("Introduzca tu DNI:");
        p1.dni = sc.nextLine();
        
        System.out.println("------PERSONA 2--------");
        System.out.println("Introduzca su nombre:");
        p2.nombre = sc.nextLine();
        
        System.out.println("Introduzca su apellido:");
        p2.apellidos = sc.nextLine();
        
        System.out.println("Introduzca su edad:");
        p2.edad = sc.nextInt();
        
        System.out.println("Introduzca su DNI:");
        p2.dni = sc.nextLine();
        
        System.out.println(p1.nombre+p1.apellidos);
                
    }//main

}//class
