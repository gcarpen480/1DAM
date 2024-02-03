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

    private int x1, y1, x2, y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {

        if (x2 > x1 && y2 > y1) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            
            System.out.println("");
            
        } else {
            System.err.println("Los datos introducidos son incorrectos");
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
    
    public void setX1Y1(int x1 , int y1){
        this.x1 = x1;
        this.y1 = y1;
    }
    
    public void setX2Y2(int x2 , int y2){
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public void setAll(int x1,int y1, int x2 ,int y2){
        this.x1 = x1;
        this.y1 = y1;
        
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public void imprime(int x1, int y1, int x2, int y2){
        System.out.println("X1: "+ x1 +" X2: "+ x2 + " Y1: "+ y1 + " Y2: "+ y2);
    }
    
    public int getPerimetro(){
        int perimetro = (x2 + x1)*2 + (y2 + y1)*2;
        
        return perimetro;
    }
    
    public int getArea(){
        int area = (x2 + x1)*(y2 + y1);
        
        return area;
    }
}
