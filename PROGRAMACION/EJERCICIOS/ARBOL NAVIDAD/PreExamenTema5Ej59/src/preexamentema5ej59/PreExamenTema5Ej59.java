/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preexamentema5ej59;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Manuel
 */
/*Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
que el usuario introduce una altura mayor o igual a 4.
*/
public class PreExamenTema5Ej59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int altura=0;
        
        String estrella="*",contorno="^",espacio=" ",base="Y";
                
        do{
        
            try{
            
                System.out.print("Introduce la altura del árbol: ");
                
                altura=sc.nextInt();
                
            }catch(InputMismatchException e){
                
                System.out.println("Error. Tipo de dato no válido.");
                
                sc.nextLine();
            }
            
            if(altura<4){
            
                System.out.println("La altura debe ser mayor o igual a 4.");
            
            }
            
        }while(altura<4);

        for (int i = 0; i < altura; i++) {
            
            if(i==0){
                
                altura--;
                
                for (int j = 0; j < altura; j++) {
                    
                    System.out.print(espacio);
                }
                
                System.out.println(estrella); 
                
                for (int j = 0; j < altura; j++) {
                    
                    System.out.print(espacio);
                }
                
                System.out.println(contorno);
                
                
            }else if(i<altura-2){
            
                for (int k = 0; k <= altura*2; k++) {
                    
                    if(k==altura-i||k==altura+i){
                        
                        System.out.print(contorno);
                        
                    }else{
                        
                        System.out.print(espacio);
                    } 
                }
                
                System.out.println();
                
            }else if (i==altura-2){
            
                for (int l = 0; l <= altura*2; l++) {
                    
                    if(l>=altura-i && l<=altura+i){
                        
                        System.out.print(contorno);
                        
                    }else{
                        
                        System.out.print(espacio);
                    } 
                    
                }
                
                System.out.println();
                
            }else{
                
            for (int j = 0; j < altura; j++) {
                    System.out.print(espacio);
                }
                
                System.out.println(base);   
            }

        }       
    }
    
}
