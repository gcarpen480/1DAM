/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3matrices;
import java.util.*;
/*
********************************************************************************
Crea un programa que cree una matriz de tamaño NxM (tamaño introducido         * 
por teclado) e introduzca en ella NxM valores (también introducidos por teclado)    
. Luego deberá recorrer la matriz y al final mostrar por pantalla cuántos      *
valores son mayores que cero, cuántos son menores que cero y cuántos son       * 
igual a cero.                                                                  * 
********************************************************************************
*/
/**
 *
 * @author usuario
 */
public class Ejercicio3Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int filas,columnas,cero = 0,menor = 0,mayor = 0;
        
        System.out.println("Introduzca el tamaño de la matriz");
        System.out.println("Filas");
        filas = sc.nextInt();
        System.out.println("Columnas");
        columnas = sc.nextInt();
        
        int matriz_carretero[][] = new int[filas][columnas];
        
        for (int i = 0; i < matriz_carretero.length; i++) {
            for (int j = 0; j < matriz_carretero[0].length; j++) {
                System.out.println("Valor "+i+","+j+": ");
                matriz_carretero[i][j] = sc.nextInt();
            }//for interno
            
        }//for externo
        
        System.out.println(" ");
        
        for (int i = 0; i < matriz_carretero.length; i++) {
            for (int j = 0; j < matriz_carretero[0].length; j++) {
                if (matriz_carretero[i][j]==0) {
                    cero++;
                }
                if (matriz_carretero[i][j]>0) {
                    mayor++;
                }
                else{
                    menor++;
                }
                
            }
            
        }
        
    }//main
    
}//class
