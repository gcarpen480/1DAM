/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17tema3;

/**
 *
 * @author usuario
 */
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

//Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un
//array y los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario
//si son iguales o no.
public class Ejercicio17Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se definen las variables y/o arrays que se van a utilizar en el ejercicio
        int num;
        int v1[]=new int[10];
        int v2[]=new int[10];
        
        //Se crea un objeto Scanner para recoger lo escrito por teclado
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        //Se indica que es lo que tiene que introducir por teclado el usuario
        System.out.println("Introduzca 20 números");
        
        //Se realizan las condiciones y/o los bucles
        for (int i = 0; i < v1.length; i++) {
            num = sc.nextInt();
            v1[i] = num;
        }
        for (int i = 0; i < v2.length; i++) {
            num = sc.nextInt();
            v2[i] = num;
            
        }
        if (Arrays.equals(v1, v2)) {
            System.out.println("Los dos vectores son iguales");
        }else{
            System.out.println("Los dos vectores no son iguales");
        }
    }
    
}
