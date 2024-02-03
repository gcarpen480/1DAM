/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintonizador_fm;

/**
 *
 * @author Gonzalo
 */
public class RadioFrecuencia {
    
    private static final double defecto = 80;
    private static final double maxFrec = 108;
    private static final double upFrec = 0.5;

    private static double Frecuencia = defecto ;
    
    public RadioFrecuencia() {
    }
    
    public double getDefecto(){
        return defecto;
    }
    
    public double getUp(){
        return upFrec;
    }
    
    public double getFrecuencia(){
        return Frecuencia;  
    }
    
    public void Frecu(double respu){
        if (respu > 80 && respu < 108) {
            System.out.println("Frecuencia correcta");
            
            Frecuencia = respu;
        }
        else{
            System.out.println("Frecuencia incorrecta");
        }
    }
    
    public void subida (){
        
        Frecuencia = Frecuencia + this.getUp();
        
        if (Frecuencia > maxFrec) {
            Frecuencia = defecto;
        }
        
    }
    
    public void bajada (){
        
        Frecuencia = Frecuencia - this.getUp();
        
        if (Frecuencia < defecto) {
            Frecuencia = maxFrec;    
        }
 
    }
    
    public void display(){
        System.out.println(this.getFrecuencia());
    }
        
}
