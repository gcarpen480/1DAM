/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;
/*
Realiza un programa que pinte una X hecha de asteriscos. 
El programa debe pedir la altura. Se debe comprobar que la altura sea un número 
impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
*/
/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables
        
        int altura = 0;
        
        //Operaciones de entrada
        System.out.print("Ingrese la altura de la X:");
        Scanner scanner = new Scanner(System.in);
        altura = scanner.nextInt();
        //Comprobacion si el numero es par o menor de 3
        if (altura % 2 == 0) {
            if(altura < 3){
                System.out.println("No valido la altura debe ser un número impar"+
                    "mayor o igual a 3.");
            }
        //Realizamos las operaciones para imprimir los espacios y asteriscos     
        } else {
            for (int i = 0; i < altura; i++) { //Salto de linea
                for (int j = 0; j < altura; j++) { //Salto entre los caracteres
                    if (i == j || i + j == altura - 1) {//Imprime los asteriscos
                        System.out.print("*"); //Imprime los asteriscos
                    } else {
                        System.out.print(" ");//Imprime los espacios
                    }
                }
                System.out.println();
            }
        }
    }
}
