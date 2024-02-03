/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apartadob3;

/**
 *
 * @author Víctor Quirós Pavón
 */
public class Rectangulo {

    private int x1, x2, y1, y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {

        if (x2 > x1 && y2 > y1) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            
            
            

        } else {
            System.err.println("ERROR al instanciar Rectagulo...");

        }

    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }
    
    public int getY1() {
        return y1;
    }
    
    public int getY2() {
        return y2;
    }
    
    public void setX1(int x1){
        this.x1 = x1;
    }
    
    public void setX2(int x2){
        this.x2 = x2;
    }
    
    public void setY1(int y1){
        this.y1 = y1;
    }
    
    public void setY2(int y2){
        this.y2 = y2;
    }
    
}
