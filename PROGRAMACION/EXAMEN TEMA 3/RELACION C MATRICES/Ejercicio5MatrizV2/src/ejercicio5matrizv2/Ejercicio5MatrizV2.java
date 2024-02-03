/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5matrizv2;
import java.util.*;
/**
 *
 * @author Gonzalo
 */
public class Ejercicio5MatrizV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantas personas tiene la empresa:");
        int personas = sc.nextInt();
        
        int v1[][] = new int [personas][2];
        int genero,cobro;
        int cobrototalhomb = 0;
        int totalhomb = 0, totalmuj = 0;
        int conthomb = 0 , contmuj = 0;
        
        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v1[0].length; j++) {
                if (j == 0) {
                    System.out.println("Introduzca su genero 0 - Hombre o 1 Mujer:");
                    v1[i][j] = sc.nextInt();
                    
                }
                if (j == 1) {
                    System.out.println("Cuanto cobra:");
                    v1[i][j] = sc.nextInt();
                    
                }
            }
           
        }
        
        for (int i = 0; i < v1.length; i++) {
            if (v1[i][0] == 0) {
                totalhomb = totalhomb + v1[i][1];
                conthomb++;
                
            }
            if (v1[i][0] == 1) {
                totalmuj = totalmuj + v1[i][1];
                contmuj++;
            }
            
        }
        
        System.out.println("Media de salario de hombres: "+(totalhomb /conthomb ));
        System.out.println("Media de salario de mujeres: "+(totalmuj /contmuj ));
        
    }
    
}
