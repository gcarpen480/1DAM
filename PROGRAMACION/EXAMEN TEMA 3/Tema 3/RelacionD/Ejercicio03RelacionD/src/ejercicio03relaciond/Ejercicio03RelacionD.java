/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio03relaciond;

/**
 *
 * @author Manuel Ripalda
 */
/*______________________________Enunciado:______________________________________
Realiza un programa que muestre por pantalla un array de 9 filas por 9 columnas 
relleno con números aleatorios entre 500 y 900. A continuación, el programa debe
mostrar los números de la diagonal que va desde la esquina inferior izquierda a 
la esquina superior derecha, así como el máximo, el mínimo y la media de los 
números que hay en esa diagonal.
*/
public class Ejercicio03RelacionD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int array[][]=new int[9][9],media=0,max=500,min=900;
        
        String hueco="\t\t\t\t\t\t\t\t";    //Como se saben las dimensiones, se le da valor directamente. En  caso contrario, se rellenaría con un for.
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                
                array[i][j]=(int)(Math.random()*400)+500;
                
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                
                System.out.print(array[i][j]+"\t");
                
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for (int i = 9; i >= 0; i--) {
            
            for (int j = 0; j < array.length; j++) {
                
                if(j==8-i){

                    
                    System.out.println(hueco.substring(j,8)+array[j][i]);
                    
                    
                    media+=array[i][j];
                    
                    if(array[i][j]>max){
                    
                        max=array[i][j];
                    
                    } 
                    if(array[i][j]<min){
                        
                        min=array[i][j];
                        
                    }    
                }     
            }   
        }
        
        media/=9;
        
        System.out.println("\nLa media de la diagonal es "+media+".");
        
        System.out.println("El número mayor de la diagonal es "+max+".");
        
        System.out.println("El número menor de la diagonal es "+min+".");
        
    }

}
