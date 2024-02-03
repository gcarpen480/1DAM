/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bombillas;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */
public class Bombillas {

    //Variables de clase
    private boolean Bombilla;
    
    //Variables de objeto
    private static boolean general = true;

    public Bombillas(boolean Bombilla) {
        
        this.Bombilla = Bombilla;
        
    }
    
    
    public void mostrarEstado(){
        
        if (Bombilla == true && general == true) {
            System.out.println("La bombilla se encuentra encendida");
        }
        else{
            System.out.println("La bombilla se encuentra apagada");
        }
        
    }
    
    public void encenderBom(){
        if (Bombilla == true) {
            Bombilla = false;
        }
        else{
            Bombilla = true;
        }
    }
    
    public void apagadoGeneral(){
        if (general == false) {
            general = true;
        }
        else{
            general = false;
        }
    }
    
    public void estadoGeneral(){
        if (general == false && Bombilla == false) {
            System.out.println("El general se encuentra apagado");
        }
        else{
            System.out.println("El general se encuentra encendido");
        }
    }
    
//    
    
    
}
