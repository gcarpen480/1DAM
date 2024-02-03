/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_preexamen;

import java.util.Scanner;

/**
 *
 * @author 34640
 */
public class Ejercicio_14_rombohueco {
    public static void main(String[] args) {
        
        int altura, blancos=1, asteriscos=1;
        
        Scanner sc= new Scanner(System.in);
        
        //Pedimos el número por teclado
        System.out.print("Introduzca un número positivo: ");
        altura=sc.nextInt();
        System.out.println("");//estético
            
        //Hacemos un bucle for desde 1 hasta el número indicado, que será
        //el número de filas que tendrá la pirámide
        for (int i = 1; i <= altura; i++) {

            //un bucle para los espacios blancos
            for (int j = blancos; j < altura/2; j++) {
                System.out.print(" ");
            }

            //realizamos un bucle para determinar los espacios huecos y 
            // pintados de la pirámide hueca.
            if (i<altura) {
                //Pintamos el primer y último ASTERISCO de cada fila.
                for (int j = 1; j <= asteriscos; j++) {
                if (j==1||j==asteriscos) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //Para la siguiente fila, hay 2 espacios más
            asteriscos+=2;
            //Incrementamos blancos para pintar uno menos cada vez.
            blancos++;
            System.out.println("");
            }
                
            
        }
        // colocamos una pirámide hueca invertida
        // Bucle principal
        for (int i = altura/2 - 1; i >= 1; i--) {

            // Bucle para los espacios en blanco
            for (int j = blancos; j < altura; j++) {
                System.out.print(" ");
            }

            // Bucle para los asteriscos y espacios
            
            for (int j = 1; j <= asteriscos; j++) {
                if (j == 1 || j == asteriscos) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            
            System.out.println("");
            // para la siguiente fila, hasy dos espacios menos.
            asteriscos-=2;
            // quitamos blancos para que hayan más cada vez
            blancos--;
        }
        
    }
}
