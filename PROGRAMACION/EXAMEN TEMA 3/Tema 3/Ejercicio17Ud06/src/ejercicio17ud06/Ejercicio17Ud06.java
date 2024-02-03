/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio17ud06;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Manuel Ripalda
 */
/*. Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un
array y los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario
si son iguales o no.*/
public class Ejercicio17Ud06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int vector1[]=new int[5],vector2[]=new int[5],num,inicio=0;
        
        System.out.println("Introduce 10 números enteros. ");
        
        for (int i = 1; i <= 10; i++) {
            
            System.out.println("Introduce el número nº"+i+":");
            
            num=sc.nextInt();
            
            if(i<=5){
            
                Arrays.fill(vector1, inicio, inicio+1, num);
            
            }else{
                
                if(i==6){
                
                    inicio=0;   
                }
                
                Arrays.fill(vector2, inicio, inicio+1, num);
            }
            
            inicio+=1;
        }
            
        if(Arrays.equals(vector1, vector2)==true){
        
            System.out.println("Los vectores son iguales");
            
        }else{
        
            System.out.println("Los vectores no son iguales");
        }
    }
}
