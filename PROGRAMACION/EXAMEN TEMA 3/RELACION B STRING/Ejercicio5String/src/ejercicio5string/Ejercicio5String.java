/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5string;

import java.util.*;

/*

Realiza un programa que lea una frase por teclado e indique si la frase es 
un palíndromo o no (ignorando espacios y sin diferenciar entre mayúsculas y 
minúsculas). Supondremos que el usuario solo introducirá letras y 
espacios (ni comas, ni puntos, ni acentos, etc.). Un palíndromo es un texto 
que se lee igual de izquierda a derecha que de derecha a izquierda.
Por ejemplo:

Amigo no gima
Dabale arroz a la zorra el abad
Amo la pacífica paloma
A man a plan a canal Panama


 */
/**
 *
 * @author Gonzalo
 */
public class Ejercicio5String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String frase;
        boolean palindromo = true;
        int longitud;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una frase:");
        frase = sc.nextLine();

        frase = sc.nextLine();
        frase = frase.replace(" ", "");
        
        frase = frase.toLowerCase();
        
        longitud = frase.length();

        for (int i = 0; i < longitud && palindromo; i++) {
            if (frase.charAt(i) != frase.charAt((longitud - 1) - i)) {
                palindromo = false;
            }
        }

        if (palindromo) {
            System.out.println("La frase es palindromo");
        } else {
            System.out.println("La frase no es palindromo");
        }

    }
}
