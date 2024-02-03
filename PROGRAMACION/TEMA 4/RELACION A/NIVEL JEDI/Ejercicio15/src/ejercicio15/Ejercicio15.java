/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
/*
Escribe un programa que cree un array de tamaño 100 con los primeros 100 números naturales.
Luego muestra la suma total y la media. Implementa una función que calcule la suma de un
array y otra que calcule la media de un array.

*/
/**
 *
 * @author Gonzalo Carretero Peñalosa
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int v1[] = new int[100];
        int longitud = 0;
        
        for (int i = 0; i < v1.length; i++) {
            v1[i] = i + 1;
            longitud += 1;
        }
        
        System.out.println("La suma total es: " + Sumatotal(v1));
        System.out.println("Media del numero anterior: " +mediaTotal(Sumatotal(v1),longitud));
    }
    
    public static int Sumatotal(int v1[]) {
        
        int suma = 0;
        
        for (int i = 0; i < v1.length; i++) {
            suma += v1[i];
        }
        
        return suma;
    }
    
    public static double mediaTotal(double suma , double longitud){
        
        longitud = 100;
        double media;
        
        media = (suma / longitud);
        
        
        return media;
    }
}
