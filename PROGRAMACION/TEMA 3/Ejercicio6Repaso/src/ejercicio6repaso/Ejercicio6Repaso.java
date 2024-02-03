/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6repaso;

import java.util.Scanner;

/*

Escribir un programa que pida el nombre completo al usuario y lo 
muestre sin vocales (mayúsculas, minúsculas y acentuadas). 
Por ejemplo, "Jesús Pérez" se mostrará "Jss Prz".

*/
/**
 *
 * @author usuario
 */
public class Ejercicio6Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nombre,apellido1;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un nombre:");
        nombre = sc.nextLine();
        
        for (int i = 0; i < nombre.length(); i++) {
            char caracter = nombre.charAt(i);
            
            switch (caracter) {
                case 'a':
                    nombre = nombre.replace("a","");
                    break;
                case 'e':
                    nombre = nombre.replace("e","");
                    break;
                case 'i':
                    nombre = nombre.replace("i","");
                    break;
                case 'u':
                    nombre = nombre.replace("u","");
                    break;
                case 'o':
                    nombre = nombre.replace("o","");
                    break;
                case 'á':
                    nombre = nombre.replace("á","");
                    break;
                case 'é':
                    nombre =  nombre.replace("é", "");
                    break;
                case 'í':
                    nombre = nombre.replace("í","");
                    break;
                case 'ú':
                    nombre = nombre.replace("ú","");
                    break;
                case 'ó':
                    nombre = nombre.replace("ó","");
                default:
                    
            }
            
        }
        
        
    }
    
}
