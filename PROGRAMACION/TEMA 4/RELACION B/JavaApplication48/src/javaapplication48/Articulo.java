/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication48;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */
public class Articulo {
    
    //Atributos de la clase
    
    String cod;
    String titulo;
    String formato;
    float precioAlqulier;
    
    //Metodos de la clase
    
    float precio(){
        return precioAlqulier;
        
    }//precio()
    
    float precio2(){
        float precioTotal;
        
        precioTotal = precioAlqulier * 1.80f;
        
        return precioTotal;
        
    }//precio2()
    
    float precioSemana(){
        float precioTotal;
        
        precioTotal = precioAlqulier * 5;
        
        return precioTotal;
        
    }//precio_semana()
    
}
