/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio04ud06;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’,
cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me mima” dirá que hay:
Nº de A's: 3
Nº de E's: 1
Nº de I's: 2
Nº de O's: 0
Nº de U's: 0*/
public class Ejercicio04Ud06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String frase;
        
        int a=0,e=0,i=0,o=0,u=0;
        
        System.out.print("Introduce una frase: ");
        
        frase=sc.nextLine();
        
        for (int j = 0; j < frase.length(); j++) {
            
            if(frase.charAt(j)=='a'||frase.charAt(j)=='A'){
            
               a++;
                
            }else if(frase.charAt(j)=='e'||frase.charAt(j)=='E'){
            
                e++;
            
            }else if(frase.charAt(j)=='i'||frase.charAt(j)=='I'){
            
                i++;
            
            }else if(frase.charAt(j)=='o'||frase.charAt(j)=='O'){
            
                o++;
            
            }else if(frase.charAt(j)=='u'||frase.charAt(j)=='U'){
            
                u++;
            
            }
        }
        
        System.out.println("Nº de A's:"+a);
        System.out.println("Nº de E's:"+e);
        System.out.println("Nº de I's:"+i);
        System.out.println("Nº de O's:"+o);
        System.out.println("Nº de U's:"+u);
        
        
    }

}
