/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2matrices;
import java.util.*;

/**
 *
 * @author usuario
 */
public class Ejercicio2Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int matrizTablas[][]=new int [10][10];
        
        for (int i = 0; i < matrizTablas.length; i++) {
            for (int j = 0; j < matrizTablas[0].length; j++) {
                matrizTablas[i][j] = (i + 1)*(j+1);
                System.out.print(matrizTablas[i][j]+"\t");
                
            }
            System.out.println("");
        }
        
    }
    
}
