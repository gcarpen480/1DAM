/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5string;

/**
 *
 * @author usuario
 */
import java.util.Scanner;

//
public class Ejercicio5String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        String frase;
        int i, j;
        boolean esPalindromo = true;
        
        //
        Scanner sc = new Scanner(System.in);
        
        //
        System.out.println("Escriba una frase");
        frase = sc.nextLine();
        
        //
        frase = frase.toLowerCase();
        frase = frase.replace(" ", "");
        
        i=0;
        j=frase.length()-1;
        while (i<=(frase.length()/2)||esPalindromo) {
            if (frase.charAt(i)!=frase.charAt(j)) {
                esPalindromo = false;
            }
            i++;
            j--;
        }
        if (esPalindromo = false) {
            System.out.println("La frase no es un palíndromo");
        }else{
            System.out.println("La frase es un palíndromo");
        }
    }
    
}
