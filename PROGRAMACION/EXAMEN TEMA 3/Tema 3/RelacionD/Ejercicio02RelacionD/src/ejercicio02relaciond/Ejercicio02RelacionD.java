/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio02relaciond;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*_____________________________Enunciado:_______________________________________

Escribe un programa que contenga un vector de tamaño N definido por una constante. 
A continuación, lee N números por teclado y almacénalos en dicho vector. Luego, desplaza
los elementos de manera que el de la posición 0 pase a la posición 1, el de la posición 1
a la 2, etc. El número que se encuentra en la posición final debe pasar a la número 0. 
Muestra por pantalla el resultado inicial y el final. Utiliza un solo vector para todo el 
proceso.
*/
public class Ejercicio02RelacionD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int N=10,ultimaPos;
        
        int vector[]=new int[N];
        
        for(int i=0;i<N;i++){
        
            vector[i]=sc.nextInt();
             
        }
        
        System.out.print("Resultado inicial:\t");
        
        for (int i = 0; i < vector.length; i++) {
            
            System.out.print(vector[i]+"\t");
            
        }
        
        System.out.println("");
        
        ultimaPos=vector[N-1];    
        
        System.arraycopy(vector, 0, vector, 1, N-1);
        
        vector[0]=ultimaPos;
        
        System.out.print("Resultado final:\t");
        
        for (int i = 0; i < vector.length; i++) {
            
            System.out.print(vector[i]+"\t");
            
        }
    }
}
