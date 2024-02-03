/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio10relaciond;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*Como el ejercicio 02 pero preguntando el número de posiciones a cambiar
*/
public class Ejercicio10RelacionD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int N=10,posicion, vector[]=new int[N],temporal;
        
        for (int i = 0; i < vector.length; i++) {
            
            System.out.print("Valor nº"+(i+1)+": ");
            
            vector[i]=sc.nextInt();
            
        }
        
        System.out.println("Ahora introduce cuánto desplazar los números "
                + "dentro de la secuencia: ");
        
        posicion=sc.nextInt();
        
        System.out.print("Vector original:\t");
        
        for (int i = 0; i < vector.length; i++) {
            
            System.out.print(vector[i]+"\t");
            
        }
        System.out.println("");
        for (int i = 0; i < posicion; i++) {
            
            temporal=vector[N-1];
            
            System.arraycopy(vector, 0, vector, 1, N-1);

            vector[0]=temporal;
        }
        
        System.out.print("Nuevo vector:\t\t");
        
         for (int j = 0; j < vector.length; j++) {
             
                System.out.print(vector[j]+"\t");
                
            }
    }

}
