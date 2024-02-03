/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
++++++++++++++++++++++++++++++++++ ENUNCIADO +++++++++++++++++++++++++++++++
14. Crea un programa que cree un array de enteros e introduzca la siguiente 
secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta 
introducir 10 diez veces, y luego la muestre por pantalla.
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

/**
 *
 * @author Jesús Pérez
 */
public class Ej14 {
    public static void main(String[] args) {
        int tamanio=0, valor=2, cuenta=2;
        
        //Calcula el tamaño del vector
        for (int i = 1; i <= 10; i++) {
            tamanio=tamanio+i;
        }
        System.out.println("tamanio = " + tamanio);
        int vector[]=new int[tamanio];
        
        vector[0]=1;
        for (int i = 1; i < vector.length; i++) {
            if (cuenta>1) {
                vector[i]=valor;
                cuenta--;
            }else{
                vector[i]=valor;
                valor++;
                cuenta=valor;
            }
        }//for
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");            
        }//for
        System.out.println("");
    }//main
}
