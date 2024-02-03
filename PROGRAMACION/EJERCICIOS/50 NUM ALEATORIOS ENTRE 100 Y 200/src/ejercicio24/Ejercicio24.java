/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;
/*
50 numeros en el rango establecio con numero maximo,minimo y media
*/
/**
 *
 * @author Gonzalo
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numa = 0;
        int numi = 0;
        int suma = 0;
        
        for (int i = 100; i <= 199; i++) {
            int num = 100+(int)(Math.random()*100);
            if (i > 100 && i < 199)  {
            if (num > numa) {
                numa = num;
            }
            if (num < numi) {
                numi = num;
            }
            }
            System.out.println(num);
            System.out.println(" ");
            suma = suma + num;
        } 
        
        int media = suma / 50;
        
        System.out.println(" ");
        System.out.println("Numero maximo: "+numa);
        System.out.println("Numero minimo: "+numi);
        System.out.println("Media de numeros: "+media);
        
    }
    
}
