/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplofunciones;
import java.util.*;

/**
 *
 * @author usuario
 */
public class EjemploFunciones {
    
    public static void main(String[] args) {
        int a , b;
        Scanner sc = new Scanner (System.in);
        imprimeHolaMundo();
        
        System.out.println("Introduzca un numero:");
        a = sc.nextInt();
        
        System.out.println("Introduzca un numero:");
        b = sc.nextInt();
        
        System.out.println("La suma es "+sumar(a,b));
        
    }//main
    
    public static void imprimeHolaMundo(){
        System.out.println("Hola Mundo");
    }
    
    public static int sumar(int a, int b){
        int resultado;
        resultado = a + b;
        
        return resultado;
    }
    
    
    
}//class
