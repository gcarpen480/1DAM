/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1matrices;
import java.util.*;
/**
 *
 * @author usuario
 */
public class Ejercicio1Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        int matrizEntero[][]=new int [5][5];
        
        int contador = 1;
        
        for (int i = 0; i < matrizEntero.length; i++) {
            for (int j = 0; j < matrizEntero[0].length; j++) {
                matrizEntero[i][j]= contador;
                contador = contador + 1;
                 System.out.print(matrizEntero[i][j]+"\t");
            }
            System.out.println("");
        }
        
       
        
    }
    
}
