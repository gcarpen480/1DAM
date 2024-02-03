/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio10ud06;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Manuel Ripalda
 */
/*Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
por debajo de la media.*/
public class Ejercicio10Ud06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
      
        sc.useLocale(Locale.US);
        
        double vectorPersonas[],media,max,min;
                
        int numPersonas, altura;
        
        media=0;
        
        min=2.5;        
        
        max=0;
        
        do{
            System.out.print("Introduce cuántas personas se tendrán en cuenta: ");
            
            numPersonas=sc.nextInt();
        
        }while(numPersonas<1);
        
        vectorPersonas=new double[numPersonas];
        
        for (altura = 0; altura < vectorPersonas.length; altura++) {

            
            do{
                
                System.out.print("Introduce la altura de la persona nº "+(altura+1)+":");
                
                vectorPersonas[altura]=sc.nextDouble();
                
                if (vectorPersonas[altura]<0.5 || vectorPersonas[altura]>2.5){
                    
                    System.out.println("Las alturas válidas se encuentran entre 0.5 y 2.5");
                }
                
            }while(vectorPersonas[altura]<0.5 || vectorPersonas[altura]>2.5); 

                media+=vectorPersonas[altura];

                if(vectorPersonas[altura]>max){

                    max=vectorPersonas[altura];
                }
                if(vectorPersonas[altura]<min){

                    min=vectorPersonas[altura];

                }
            
        }
        
        media/=vectorPersonas.length;
        
        System.out.print("La altura media es: ");
        System.out.printf("%1.2f",media);
        System.out.print(".\nLa altura mínima es: ");
        System.out.printf("%1.2f",min);
        System.out.print(".\nLa altura máxima es: ");
        System.out.printf("%1.2f",max);
       
    }
    
    
}
