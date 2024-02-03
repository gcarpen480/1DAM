/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apartadob2;

/**
 *
 * @author Víctor Quirós Pavón
 */
public class Persona {
    
    private int dni, edad;
    private String nombre, apellidos;
    
    
    public Persona(int dni, int edad, String nombre, String apellidos){
        
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        
    }
    
    public int getDNI(){
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
    
    public void setDNI(int dni) {
        this.dni = dni;
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
    
}
