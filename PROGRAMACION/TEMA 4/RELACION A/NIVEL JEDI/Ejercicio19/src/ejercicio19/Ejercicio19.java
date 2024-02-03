/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el valor de X: ");
        int x = sc.nextInt();
        
        System.out.println("Introduzca el valor de Y: ");
        int y = sc.nextInt();
        
        System.out.println("Introduzca el valor de Z: ");
        int z = sc.nextInt();
        
        pitagoras(x,y,z);
        
    }
    
    public static void pitagoras (int x, int y, int z){
        
        int xcua = (int) Math.pow(x, 2);
        int ycua = (int) Math.pow(y, 2);
        int zcua = (int) Math.pow(z, 2);
        
        if ((xcua + ycua) == zcua) {
            System.out.println("Son iguales");
        }
        else{
            System.out.println("No son iguales");
        }
        
    }
    
}
