/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio03ud06;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
menores que cero y cuántos son igual a cero.
*/
public class Ejercicio03Ud06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.US);

        int num1,num2,mayor=0,menor=0,igual=0;
        
        double valor, matriz[][];
        
        System.out.print("Primer vector de la matriz: ");
        
        num1=sc.nextInt();
        
        System.out.println("Segundo vector de la matriz: ");
        
        num2=sc.nextInt();
        
        matriz=new double[num1][num2];
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.println("Introduce un valor: ");
 
                matriz[i][j]=sc.nextDouble();;
            } 
        }
        
        System.out.println("La matriz introducida es:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.print(matriz[i][j]+"\t");
                if(matriz[i][j]>0){
                    mayor++;
                }else if(matriz[i][j]==0){
                    igual++;
                }else{
                menor++;
                }
            }
        }        
        System.out.println("\nValores iguales a cero: "+igual+"\nValores mayores a 0: "+mayor+"\nValores menores a 0: "+menor);        
    }

}
