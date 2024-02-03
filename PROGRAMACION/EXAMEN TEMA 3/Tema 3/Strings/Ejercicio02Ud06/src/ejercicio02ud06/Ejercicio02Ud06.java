/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio02ud06;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
public class Ejercicio02Ud06 {

    /**
     * @param args the command line arguments
     */
    /*_______________________________Enunciado:______________________________________________
    Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
    además de si son iguales sin diferenciar entre mayúsculas y minúsculas
    */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String cadena1,cadena2;
        
        System.out.print("Primera cadena: ");
        
        cadena1=sc.nextLine();
        
        
        System.out.print("Segunda cadena: ");
        
        cadena2=sc.nextLine();
           
        if (cadena1.equalsIgnoreCase(cadena2)==true){
    
            System.out.println(cadena1+" es igual a "+cadena2);
    
        }else{
        
            System.out.println(cadena1+" no es igual a "+cadena2);
        }
        
    }

}
