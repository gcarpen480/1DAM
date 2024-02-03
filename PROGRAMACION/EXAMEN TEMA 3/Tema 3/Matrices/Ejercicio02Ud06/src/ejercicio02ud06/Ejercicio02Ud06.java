/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio02ud06;

/**
 *
 * @author Manuel Ripalda
 */
/*Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla*/
public class Ejercicio02Ud06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int matriz[][]=new int[10][10];
        
        for (int i = 0; i < matriz.length; i++) {
            
            System.out.print("Tabla del "+(i+1)+":\t");
            
            for (int j = 0; j < matriz.length; j++) {
                
                matriz[i][j]=(i+1)*(j+1);
                
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
