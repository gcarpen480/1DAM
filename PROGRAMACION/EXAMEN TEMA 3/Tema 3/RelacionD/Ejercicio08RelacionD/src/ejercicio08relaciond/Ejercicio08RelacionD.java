/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio08relaciond;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author usuario
 */
/*_______________________________Enunciado:_____________________________________
Escribe un programa que rellene un array de 20 elementos con números enteros 
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el 
programa mostrará el array y preguntará si el usuario quiere resaltar los 
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array 
escribiendo los números que se quieren resaltar entre corchetes.

Ejemplo:
159 204 20 250 178 90 353 32 229 357 224 54 260 310 140 249 335 326 223 13

¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): 
1 159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260] [310] [140] 249 [335] 
326 223 13
*/
public class Ejercicio08RelacionD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int vector[]=new int[20],multiplo=0;
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*401);
        }
        
        for (int i = 0; i < vector.length; i++) {
            
            System.out.print(vector[i]+" ");
            
        }
        System.out.println("");
        do{

            try{
            
                System.out.print("¿Qué números quiere resaltar? 1 – los múltiplos de"
                + " 5, 2 – los múltiplos de 7): ");
        
                multiplo=sc.nextInt();
                
            }catch(InputMismatchException e){
                
                System.out.print("Introduce un 1 para resaltar los múltiplos"
                        + " de 5 o un 2 para los mútilplos de 7: ");
                
                sc.nextLine();
                
            }
                
        }while(multiplo!=1 && multiplo!=2);
       
        if(multiplo==1){
        
            multiplo=5;
        
        }else{
        
            multiplo=7;
            
        }
        
        for (int i = 0; i < vector.length; i++) {
            
            if(vector[i]%multiplo==0){
            
                System.out.print("["+vector[i]+"] ");
                
            }else{
            
                System.out.print(vector[i]+" ");
                
            }
            
        }
        
    }
}
