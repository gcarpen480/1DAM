/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio01ud06;

/**
 *
 * @author Manuel Ripalda Delgado
 */
/*Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
y luego muestre la matriz por pantalla.*/
public class Ejercicio01Ud06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int matriz[][]=new int [5][5],num=1;
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                
                matriz[i][j]=num;
                
                num++;
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                System.out.print(matriz[i][j]+"\t");
                
            }
            System.out.println();
        }
    }
}
