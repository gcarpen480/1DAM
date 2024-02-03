/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioa3;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */
public class Rectangulo {

    int x1, y1, x2, y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {

        if (x2 > x1 && y2 > y1) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            
            System.out.println("");
            
            System.out.println("Los datos introducidos son correctos");
        } else {
            System.err.println("Los datos introducidos son incorrectos");
        }

    }

}
