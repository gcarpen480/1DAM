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
    private final String dni;
    private int edad;
    private static final int mayoriaEdad = 18;

    public Persona(String nombre, String dni, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        
        if (validarDNI(dni)) {
            this.dni = dni;
        }
        else{
            System.out.println("El DNI no es valido");
            this.dni = null;
        }
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
  
    public void setEDAD(int edad){
        this.edad = edad;
    }
    
    public void setNOMBRE(String nombre){
        this.nombre = nombre;
    }
    
    public void setAPELLIDOS(String apellidos){
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
    
    public static boolean validarDNI(String dni){
        if (dni.length() != 9) {
            return false;
        }
        
        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(dni.charAt(i))) {
                return false;
            }
        }
        
        return Character.isLetter(dni.charAt(8));
    }
    
}
