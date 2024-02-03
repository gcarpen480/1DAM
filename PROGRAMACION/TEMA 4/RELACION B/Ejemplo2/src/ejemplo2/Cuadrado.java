/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */
public class Cuadrado {
    //Atributos
    double x1,x2,y1,y2;
    
    double CalcularDiagonal(){
        
        double resultado;
        
        resultado = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        
        return resultado;
    }
    
    double CalcularPerimetro(){
        double diagonal = CalcularDiagonal();
        
        double lado = diagonal / Math.sqrt(2);
        
        return (4 * lado);
    }
    
    double CalcularArea(){
        double diagonal = CalcularDiagonal();
        
        return (0.5*diagonal*diagonal);
        
    }
}
