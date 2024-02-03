
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jesús Pérez
 */
public class Ej01b {
    public static void main(String[] args){
         double reales[]=new double[10];
         int i=0, pos=0;
         Scanner sc=new Scanner(System.in);
         sc.useLocale(Locale.US);//Uso de punto decimal en lugar de coma
         
         System.out.println("Introduzca números con decimales...");
         
         //El algoritmo se puede mejorar con un bucle WHILE que me pida de nuevo 
         //el dato mal introducido
         while (i<reales.length) {
             try {
                 System.out.print("Número "+i+": ");
                 reales[i]=sc.nextDouble();  
             } catch (InputMismatchException e) {
                 System.out.println("Tipo de dato incorrecto o mal introducido");
                 sc.nextLine();
                 i--;
             } //catch
             i++;
         } //while
     } //main
}
