/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* RELACIÓN D - EJERCICIO 10
Dado un vector, implemente un método que inserte un elemento en una posición
dada del vector. Como aclaración, al insertar un elemento en el vector, desplaza 
una posición hacia la derecha a los elementos del vector que han de quedar 
detrás del elemento insertado. Además, la inserción ocasiona la “desaparición” 
del último elemento del vector.
*/

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class DEjercicio10 {
    public static void main(String[] args) {
        int longitud, posicion, nuevo;
        Scanner sc=new Scanner(System.in);
        
        //Solicitamos el tamaño del vector
        System.out.print("Introduzca el tamaño del vector de enteros: ");
        longitud=sc.nextInt();
        
        //Creamos el vector
        int vector[]=new int[longitud];
        int aux[]=new int[longitud];
        
        //Pedimos la inserción de los elementos del vector
        System.out.println("Introduzca los elementos del vector...");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento "+i+":");
            vector[i]=sc.nextInt();
            aux[i]=vector[i];
        }
        
        //Pedimos la posición de inserción.
        //Controlamos que esté en los parámetros permitidos
        do{
        System.out.print("Introduzca la posición de inserción (0 - "+longitud+"): ");
        posicion=sc.nextInt();
        } while (posicion<0||posicion>longitud-1);
        
        //Pedimos el elemento a insertar
        System.out.print("Introduzca el elemento nuevo: ");
        nuevo=sc.nextInt();
        
        //INSERCIÓN
        //Si la posición es la última, lo escribimos directamente
        if (posicion==(longitud-1)) {
            vector[longitud-1]=nuevo;
        } else {
            //Comenzando por el siguiente, guardo los elementos que almacené
            //en el vector aux.
            for (int i = posicion; i < aux.length-1; i++) {
                vector[i+1]=aux[i];
            }
            vector[posicion]=nuevo;
        }
        
        //Mostramos el resultado
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+"\t");
        }//for
        System.out.println("");
    }//main
}
