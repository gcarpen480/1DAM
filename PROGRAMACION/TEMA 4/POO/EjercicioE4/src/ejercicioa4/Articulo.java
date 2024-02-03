/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioa4;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */
public class Articulo {

    private double precio,cuantosQuedan,descuento;
    private String nombre;
    
    public static final double IVAGen = 21;
    public static final double IVARed = 10;
    public static final double IVASup = 4;
    

    public Articulo(double precio, double cuantosQuedan, String nombre,double descuento ) {

        if (nombre.isEmpty()) {
            System.err.println("El valor introducido no es correcto");
        } else {
            this.nombre = nombre;

            if (precio < 0 && cuantosQuedan < 0) {
                this.precio = precio;
                this.cuantosQuedan = cuantosQuedan;

            } else {
                System.err.println("Los valores introducido no son correcto");
            }
        }

    }

    public String getnombre() {
        return nombre;
    }

    public double getprecio() {
        return precio;
    }

    public double getIVA() {
        return IVAGen;
    }
    
    public double getIVAR() {
        return IVARed;
    }
    
    public double getIVASR() {
        return IVASup;
    }

    public double getcuantosQuedan() {
        return cuantosQuedan;

    }
    
    public double descuento(){
        return descuento;
    }

    public void setnombre() {
        this.nombre = nombre;
    }

    public void setprecio() {
        this.nombre = nombre;
    }

    public void setcuantosQuedan() {
        this.cuantosQuedan = cuantosQuedan;
    }
    
    public void setDescuento() {
        this.descuento = descuento;
    }

    public void imprime(){
        System.out.println("Nombre: "+nombre+" Precio: "+precio+" IVA: "+IVAGen+" Stock: "+cuantosQuedan);
    }
    
    public int getPVP(double a1){
        int PVP = (int) (precio+(precio * IVAGen)/100);
        
        return PVP;
    }
    
    public int getPVPR(double a1){
        int PVP = (int) (precio+(precio * IVARed)/100);
        
        return PVP;
    }
    
    public int getPVPS(double a1){
        int PVP = (int) (precio+(precio * IVASup)/100);
        
        return PVP;
    }
    
    public int getDescuento(double a1){
        int Descuento = (int) (precio * descuento / 100);
        
        return Descuento;
    }
    
    public boolean getvender(double x){
        if (x <= cuantosQuedan) {
            cuantosQuedan -= x;
            
            System.out.println("Se ha realizado una venta");
            System.out.println("Total de Productos restantes: "+cuantosQuedan);
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean getalmacenar(double x){
        if (x <= cuantosQuedan || x >= cuantosQuedan) {
            cuantosQuedan += x;
            
            System.out.println("Se añadido stock una cantidad de "+cuantosQuedan+" productos");
            return true;
        }
        else{
            return false;
        }
    }
    
}
