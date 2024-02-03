/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioa2;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */
public class Persona {
    
    private String nombre,apellidos;
    private String dni;
    private int edad;
    private static final int mayoriaEdad = 18;

    public Persona(String nombre, String dni, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public String getDNI(){
        return dni;
    }
    
    public int getEDAD(){
        return edad;
    }
    
    public String getNOMBRE(){
        return nombre;
    }
    
    public String getAPELLIDOS(){
        return apellidos;
    }
  
    public void setEDAD(){
        this.edad = edad;
    }
    
    public void setNOMBRE(){
        this.nombre = nombre;
    }
    
    public void setAPELLIDOS(){
        this.apellidos = apellidos;
    }
    
    public void imprime(){
        System.out.println("Nombre: "+nombre+" Apellidos: "+apellidos+" DNI: "+dni+" Edad: "+edad);
    }
    
    public boolean esMayorEdad(){
        if (edad <= mayoriaEdad) {
            return false;
        }
        else{
            return true;
        }
    }
    
    public boolean esJubilado(){
        if (edad >= 65) {
            return true;
        }
        else{
            return false;
        }
    }
    
}
