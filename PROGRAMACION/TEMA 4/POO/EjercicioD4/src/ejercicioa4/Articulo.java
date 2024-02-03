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

    private double precio, iva, cuantosQuedan,descuento;
    private String nombre;

    public Articulo(double precio, double iva, double cuantosQuedan, String nombre,double descuento ) {

        if (nombre.isEmpty()) {
            System.err.println("El valor introducido no es correcto");
        } else {
            this.nombre = nombre;

            if (iva == 21 && precio > 0 && cuantosQuedan > 0) {
                this.precio = precio;
                this.iva = iva;
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

    public double getiva() {
        return iva;
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

    public void setiva() {
        this.iva = iva;
    }

    public void setcuantosQuedan() {
        this.cuantosQuedan = cuantosQuedan;
    }
    
    public void setDescuento() {
        this.descuento = descuento;
    }

    public void imprime(){
        System.out.println("Nombre: "+nombre+" Precio: "+precio+" IVA: "+iva+" Stock: "+cuantosQuedan);
    }
    
    public int getPVP(double a1){
        int PVP = (int) (precio+(precio * iva)/100);
        
        return PVP;
    }
    
    public int getDescuento(double a1){
        int Descuento = (int) (precio * (1 - descuento / 100));
        
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
