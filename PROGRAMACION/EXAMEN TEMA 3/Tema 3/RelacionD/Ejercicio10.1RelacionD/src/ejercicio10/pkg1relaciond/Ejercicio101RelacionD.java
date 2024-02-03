/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio10.pkg1relaciond;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Manuel Ripalda
 */
/*________________________________Enunciado:____________________________________
Dado un vector, implemente un método que inserte un elemento en una posición dada
del vector. Como aclaración, al insertar un elemento en el vector, desplaza una 
posición hacia la derecha a los elementos del vector que han de quedar detrás del
elemento insertado. Además, la inserción ocasiona la “desaparición” del último 
elemento del vector.
*/
public class Ejercicio101RelacionD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int vector[]=new int[10];   //Por ejemplo, instanciado a 10.
        
        int numero=-1,posicion=-1;
        
        System.out.println("Vector original:");
        
        for (int i = 0; i < vector.length; i++) {
            
            vector[i]=(int)(Math.random()*10)+1;
            
            System.out.print(vector[i]+"\t");
        }
        
        System.out.println();
        
        do{
        
            try{
            
                System.out.print("Introduce un número: ");
                
                numero=sc.nextInt();
            
            }catch(InputMismatchException e){
            
                System.out.print("Error. Introduce un "
                        + "número entero. ");
                
                sc.nextLine();
                
            }
            
            if(numero<=0){
                
                System.out.println("El número debe ser mayor a 0.");
            }
            
        }while(numero<=0);
        
        do{
        
            try{
            
                System.out.print("Introduce una posición: ");
                
                posicion=sc.nextInt();
            
            }catch(InputMismatchException e){
            
                System.out.print("Error. Introduce un "
                        + "número entero. ");
                
                sc.nextLine();
                
            }
            
            if(posicion<0 ||posicion>9){
                
                System.out.println("El número debe representar una posición "
                        + "del vector (0-9).");
            }
            
        }while(posicion<0 || posicion>9);
        
        for (int i = vector.length-1; i > posicion; i--) {
            
            vector[i]=vector[i-1];
            
        }
        
        vector[posicion]=numero;
        
        System.out.println("Vector modificado:");
        
        for (int i = 0; i < vector.length; i++) {
           
            System.out.print(vector[i]+"\t");
            
        }
    }
}
