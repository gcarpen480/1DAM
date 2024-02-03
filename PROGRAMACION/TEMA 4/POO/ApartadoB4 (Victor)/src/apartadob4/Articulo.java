/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apartadob4;

/**
 *
 * @author Víctor Quirós Pavón
 */
public class Articulo {
    
    private String nombre;
    private double precio;
    private double iva = 21;
    private int cuantosQuedan;
    
    
    
    public Articulo(String nombre, double precio, double iva, int cuantosQuedan){
        
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.cuantosQuedan = cuantosQuedan;
        
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public double getprecio(){
        return precio;
    }
    
    public double getiva(){
        return iva;
    }
    
    public int getcuantosQuedan(){
        return cuantosQuedan;
                
    }
    
    public void setnombre(){
        this.nombre = nombre;
    }
    
    public void setprecio(){
        this.nombre = nombre;
    }
    
    public void setiva(){
        this.iva = iva;
    }
    
    public void setcuantosQuedan(){
        this.cuantosQuedan = cuantosQuedan;
    }
    
}
