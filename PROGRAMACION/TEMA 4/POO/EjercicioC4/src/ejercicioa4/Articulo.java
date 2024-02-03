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

    private double precio, iva, cuantosQuedan;
    private String nombre;

    public Articulo(double precio, double iva, double cuantosQuedan, String nombre) {

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

}
