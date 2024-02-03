/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;

/*
Escribe un programa que toma como dato de entrada un número que corresponde a 
la longitud de un radio y nos escribe la longitud de la circunferencia, el área 
del círculo y el volumen de la esfera que corresponden con dicho radio.
*/


/**
 *
 * @author Gonzalo Carretero
 */
import java.util.Scanner;
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables definidas
        int longitud;
        double area,circunferencia,volumen;
        double pi;
        pi=Math.PI;
        
        System.out.println("Introduzca la longitud");
        Scanner sc = new Scanner(System.in);
        longitud = sc.nextInt();
        
        //Operaciones
        
        area = Math.pow(longitud, 2);
        circunferencia = 2 * pi * longitud;
        volumen = 4/3 * pi * Math.pow(longitud, 2);
        
        System.out.println ("Esta es la circunferencia :" + circunferencia);
        System.out.println ("Este es el area: " + area);
        
        
    }
    
}
