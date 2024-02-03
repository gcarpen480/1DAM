/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javaapplication48;
import java.util.*;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */

/* -----------------------------------ENUNCIADO---------------------------------


   -----------------------------------------------------------------------------
*/
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creamos dos articulos
        
        Articulo articulo = new Articulo();
        Articulo articulo2 = new Articulo();
        
        // Le damos valores a sus atributos
        
        articulo.cod = "001";
        articulo.titulo = "Titulo1";
        articulo.formato = "DVD";
        articulo.precioAlqulier = 2.50f;
        
        articulo2.cod = "002";
        articulo2.titulo = "Titulo2";
        articulo2.formato = "DVD";
        articulo2.precioAlqulier = 3;
        
        // Utilizamos sus metodos
        
        System.out.println("Alquier Art. " + articulo.cod + ", 1 dia: " + articulo.precio());
        System.out.println("Alquier Art. " + articulo.cod + ", 2 dia: " + articulo.precio2());
        System.out.println("Alquier Art. " + articulo.cod + ", 1 semana: " + articulo.precioSemana());
        
        System.out.println("Alquier Art. " + articulo2.cod + ", 1 dia: " + articulo2.precio());
        System.out.println("Alquier Art. " + articulo2.cod + ", 2 dia: " + articulo2.precio2());
        System.out.println("Alquier Art. " + articulo2.cod + ", 1 semana: " + articulo2.precioSemana());
        
    }//main

}//class
