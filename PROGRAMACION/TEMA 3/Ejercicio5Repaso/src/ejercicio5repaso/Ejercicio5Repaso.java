/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5repaso;

import java.util.Scanner;

/*
Crea un programa que lea por teclado una cadena de caracteres e indique la 
cantidad de palabras que tiene. De la clase String, sólo se pueden utilizar los 
métodos length(), charAt() y trim()
 */
/**
 *
 * @author Gonzalo
 */
public class Ejercicio5Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String frase;
        int contPalabras = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una cadena:");
        frase = sc.nextLine();

        frase = frase.trim();   

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            if (caracter == ' ' && frase.charAt(i + 1) != ' ') {
                contPalabras++;
            }
        }

        contPalabras++;

        System.out.println("Hay un total de " + contPalabras + " palabras");

    }

}
