/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio20ud06;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Manuel Ripalda
 */
/*Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros
aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado un valor N y se
mostrará por pantalla si N existe en el array, además de cuantas veces.
*/
public class Ejercicio20Ud06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner  sc=new Scanner(System.in);
        
        int vector[]=new int[1000],num,aparece=0;
        
       
        for (int i = 0; i < vector.length; i++) {
            
            vector[i]=(int)(Math.random()*100);
            
        }
        
        System.out.print("Introduce un valor entre 0 y 99: ");
        
        num=sc.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
            
            if (num==vector[i]){
                
                aparece++;
                
            }
        }
        if(aparece==0){
        
            System.out.println("El número introducido no aparece.");
        }else{
        
            System.out.println("El número introducido aparece "+aparece+" veces.");
            
        }
        
        Arrays.sort(vector);
        
        for (int i : vector) {
            
            System.out.print(i+" ");
            
        }
    }
}
