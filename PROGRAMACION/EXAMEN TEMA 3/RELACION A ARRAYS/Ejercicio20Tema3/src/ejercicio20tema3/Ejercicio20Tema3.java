/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20tema3;

/**
 *
 * @author usuario
 */
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

//Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros
//aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado un valor N y se
//mostrará por pantalla si N existe en el array, además de cuantas veces.
public class Ejercicio20Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se definen las variables y/o arrays que se van a utilizar en el ejercicio
        int v1[]=new int[1000];
        int N;
        int indice;
        boolean seguir = true;
        int J;
        int cuenta;
        
        //Se crea un objeto Scanner para recoger lo escrito por teclado
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        //Se realizan las condiciones y/o los bucles
        for (int i = 0; i < v1.length; i++) {
            v1[i] = (int)(Math.random()*100);
        }
        
        System.out.println("Introduzca un número (0-99)");
        N = sc.nextInt();
        
        Arrays.sort(v1);
        indice = Arrays.binarySearch(v1, N);
        
        if (indice>0) {
            J=indice+1;
            cuenta = 1;
            while (seguir) {
                if (v1[J]==N) {
                cuenta ++;
                J++;
                }else{
                    seguir = false;
                }
            }
            System.out.println("El número "+N+" está y aparece "+cuenta+" veces");
        }else{
            System.out.println("El valor no se encuentra en la lista");
        }
    }
    
}
