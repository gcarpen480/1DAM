/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioa3;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */

public class Rectangulo {
    
    int x1,y1,x2,y2;
    
    double calcularAnchos(){
        
        double ancho = x2 - x1;
        
        return ancho;
        
    }   
    
    double calcularLados(){
        
        double Lados = y2 - y1;
        
        return Lados;
        
    }
    
    double calcularPerimetro(){
        
        double perimetro = (calcularAnchos()*2 + calcularLados()*2);
        
        if (perimetro < 0) {
            perimetro = perimetro * -1;
            
            return perimetro;
        }
        else{
            
            return perimetro;
            
        }
    }
    
    double calcularArea(){
        
        double Area = (calcularAnchos()*calcularLados());
        
        if (Area < 0) {
            Area = Area * -1;
            
            return Area;
        }
        else{
            return Area;
        }
    }
    
}
