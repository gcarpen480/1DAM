/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio13ud6;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Manuel Ripalda
 */
/*Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y
luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un
valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería
1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al
usuario V, I además de N (nº de valores a crear).
*/
public class Ejercicio13Ud6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int num,incremento,cantidad;
        
        int vector[];
        
        System.out.print("¿Desde dónde empieza la secuencia?: ");
        
        num=sc.nextInt();
        
        System.out.print("¿Incremento de la secuencia?: ");
        
        incremento=sc.nextInt();
        
        System.out.println("Cantidad de valores?: ");
        
        cantidad=sc.nextInt();
        
        vector=new int[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            
            vector[i]=num;
            
            num+=incremento;
            
            System.out.print(vector[i]+" ");
        }
        
    }

}
