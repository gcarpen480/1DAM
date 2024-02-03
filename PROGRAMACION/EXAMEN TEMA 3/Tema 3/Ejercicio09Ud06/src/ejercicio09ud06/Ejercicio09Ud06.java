/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio09ud06;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Manuel Ripalda
 */
/*Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y
mostrará en qué posiciones del array aparece N. */
public class Ejercicio09Ud06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        sc.useLocale(Locale.US);
        
        int vector[]=new int[100];
        
        int num;
        
        int mayores=0;
        
        boolean realizado=false;
        
        for (int i = 0; i < vector.length; i++) {
            
            vector[i] = (int)(1+(Math.random()*10));
            
        }
        
        System.out.print("Vector de números entre 0 y 1 generado. Ahora introduzca un número entre 1 y 10: ");
        
        do{
            num=sc.nextInt();
        
            if (num>0 && num<=10){
                
                System.out.print("Posiciones en la array: ");
                
                for (int valor=0;valor<vector.length;valor++) {
                    
                    if(vector[valor]==num){
                        
                        System.out.print(valor+", ");
             
                    }
                }
                realizado=true;
                
            }else{
                      
                System.out.print("Introduce un número entre 1 y 10: ");
                        
                }
            
        }while((num>=0 ||  num<=1)&& realizado==false);
        
    }

}
