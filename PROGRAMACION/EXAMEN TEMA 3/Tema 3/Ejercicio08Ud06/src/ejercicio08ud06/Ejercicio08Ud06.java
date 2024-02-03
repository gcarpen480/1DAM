/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio08ud06;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author usuario
 */
/*
Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
cuántos valores del array son igual o superiores a R.
*/
public class Ejercicio08Ud06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        sc.useLocale(Locale.US);
        
        double vector[]=new double[100];
        
        double num;
        
        int mayores=0;
        
        boolean realizado=false;
        
        for (int i = 0; i < vector.length; i++) {
            
            vector[i] = Math.random();
        }
        System.out.print("Vector de números entre 0 y 1 generado. Ahora introduzca un número entre 0 y 1: ");
        
        do{
            num=sc.nextDouble();
        
            if (num>=0 && num<=1){
                
                for (double valor : vector) {
                    
                    if(valor>num){
                        
                        mayores++;
             
                    }
                }
                
                realizado=true;
                
            }else{
                      
                System.out.print("Introduce un número entre 0 y 1: ");
                        
                }
            
        }while((num>=0 ||  num<=1)&& realizado==false);

        System.out.println("Los números en el vector que son mayores que "+num+" son "+mayores);
        
    }

}
