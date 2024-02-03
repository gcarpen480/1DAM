/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejemplo;

/**
 *
 * @author usuario
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][]=new int[5][5],sumFilas=0,sumColumnas=0,minFilas=0,minColumnas=0,mediaColumnas=0,mediaFilas=0,maxFilas=0,maxColumnas=0;
        
        for (int i = 0; i < matriz.length; i++) {
            
            sumFilas=0;
            minFilas=0;
            maxFilas=0;
            mediaFilas=0;
            
            for (int j = 0; j < matriz[0].length; j++) {
                
               
                matriz[i][j]=(int)(Math.random()*10)+1;
                
                System.out.print(matriz[i][j]+"\t");
                
                sumFilas+=matriz[i][j];
                
                
                
            }
            System.out.println(sumFilas+"\t|\t"+minFilas+"\t|\t"+maxFilas+"\t|\t"+mediaFilas+"\t|");

        }
        
        System.out.println("");
        
        for (int i = 0; i < matriz.length; i++) {
                   
            sumColumnas=0;
            minFilas=0;
            maxFilas=0;
            mediaFilas=0;

            for (int j = 0; j < matriz.length; j++) {

                sumColumnas+=matriz[j][i];

            }

            System.out.print(sumColumnas+"\t");
            
        }
        System.out.print("\n|\t"+minColumnas+"\t|\t"+maxColumnas+"\t|\t"+mediaColumnas+"\t|");
            
    }

}
