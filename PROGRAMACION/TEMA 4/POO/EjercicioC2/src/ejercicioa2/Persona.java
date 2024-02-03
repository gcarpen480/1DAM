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
    
    private String nombre,dni,apellidos;
    private int edad;

    public Persona(String nombre, String dni, String apellidos, int edad) {
        this.nombre = nombre;
        this.dni = dni;
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
    
    public void setDNI(String dni) {
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
