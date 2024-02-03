/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/*
Realiza un programa que lea una fecha introduciendo el día, mes y año por 
separado y nos diga si la fecha es correcta o no. Supondremos que todos los 
meses tienen 30 días. Se debe crear una función donde le pasemos los datos y 
devuelva si es correcta o no.
*/
/**
 *
 * @author usuario
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dia , meses , año;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca los dias del año: ");
        dia = sc.nextInt();
        
        System.out.println("Introduzca los meses del año: ");
        meses = sc.nextInt();
        
        System.out.println("Introduzca los años: ");
        año = sc.nextInt();
        
        System.out.println("");
        
        if (fecha(año,meses,dia)) {
            System.out.println("Las fechas introducidas son corretas");
            
        }
        else{
            System.out.println("Las fechas introducidas son incorrectas");
        }
    }
    
    public static boolean fecha(int año , int meses , int dia){
        boolean verdadero = true;
        
        if (dia <1 || dia > 30) {
            verdadero = false;
        }
        
        if (meses < 1 || meses > 12) {
            verdadero = false;
        }
        
       return verdadero;
        
    }
    
}
