/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio09relaciond;
/**
 *
 * @author Manuel Ripalda
 */
/*_________________________________Enunciado:___________________________________
Realiza un programa que calcule la estatura media, mínima y máxima en 
centímetros de personas de diferentes países. El array que contiene los nombres 
de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”, “USA”}. Los 
datos sobre las estaturas se deben simular mediante un array de 4 filas por 10 
columnas con números aleatorios generados al azar entre 140 y 210. Los decimales
de la media se pueden despreciar. Los nombres de los países se deben mostrar 
utilizando el array de países (no se pueden escribir directamente).
*/
public class Ejercicio09RelacionD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String pais[]={"España","Rusia","Japón","USA"};
        
        int numeros[][]=new int[4][10],min,max,media;
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                
                numeros[i][j]=(int)((Math.random()*71)+140);
                
            }  //for j
        }//for i
        
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.print(pais[i]+":\t");
            min=210;
            max=140;
            media=0;
            
            for (int j = 0; j < numeros[i].length; j++) {
                
                System.out.print(numeros[i][j]+"\t");
                
                media+=numeros[i][j];
                
                if(min>numeros[i][j]){
                
                min=numeros[i][j];
                
                }
                if(max<numeros[i][j]){
                
                    max=numeros[i][j];
                    
                }
            }
            
            media/=10;
            System.out.println("|\t"+min+"\t"+max+"\t"+media);
        }
   
    }

}
