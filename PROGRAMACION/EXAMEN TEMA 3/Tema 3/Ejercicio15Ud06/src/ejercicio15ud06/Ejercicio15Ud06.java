/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio15ud06;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Manuel Ripalda
 */
/*Crea un programa que pida la usuario dos valores N y M y luego cree un array de tamaño N
que contenga M en todas sus posiciones. Luego muestra el array por pantalla.*/
public class Ejercicio15Ud06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      Scanner sc=new Scanner(System.in);
      
        int numN,numM;
      
        int vector[];
      
        System.out.print("Longitud del vector: ");
        
        numN=sc.nextInt();
        
        System.out.print("Valor a insertar en el vector: ");
        
        numM=sc.nextInt();
      
        vector=new int[numN];
        
        Arrays.fill(vector, numM);
        
        for (int i : vector) {
            
            System.out.print(vector[i]+" ");
            
        }
    }
}
