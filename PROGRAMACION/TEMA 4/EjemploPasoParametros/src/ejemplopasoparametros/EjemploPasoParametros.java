/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejemplopasoparametros;
import java.util.*;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */

/* -----------------------------------ENUNCIADO---------------------------------


   -----------------------------------------------------------------------------
*/
public class EjemploPasoParametros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //PASO POR VALOR (o COPIA)
        int edad=25;
        System.out.println("edad = " + edad);
        cumplirAños(edad);
        System.out.println("edad = " + edad);
        
        //PASO POR REFERENCIA
        int vector[]=new int[20];
        //Inicializo vector
        for (int i = 0; i < vector.length; i++) {
            vector[i]=i;            
        }
        //Imprimo vector
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector[i] = " + vector[i]);            
        }
        //Llamo a la función agrega(): Paso por referencia
        agrega(vector, 25);
        //Imprimo de nuevo el vector
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector[i] = " + vector[i]);            
        }
        
    }//main
    
    public static void cumplirAños(int edad){
        edad++;
        System.out.println("¡¡Felicidades!! Cumples "+edad+" años.");
    }//cumplirAños()
    
    public static void agrega(int vector[], int valor){
        for (int i = 0; i < vector.length; i++) {
            vector[i]+=valor;            
        }
    }//agrega()
}//class
