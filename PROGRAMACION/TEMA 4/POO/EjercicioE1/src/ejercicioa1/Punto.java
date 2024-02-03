/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioa1;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */
public class Punto {
    
    private int x,y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
//    public void setX(int x) {
//        this.x = x;
//    }
//    
//    public void setY (int y){
//        this.y = y;
//    }
    
    public void imprime(){
        System.out.println("("+x+","+y+")");
    }
   
    public void XY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void desplaza (int dx, int dy){
        this.x = x + dx;
        this.y = y + dy;
    }
    
    public int distancia(int x2, int y2){
        int punto_p = (int) Math.sqrt((Math.pow((x2 - x),2)) + (Math.pow((y2-y),2)));
        return punto_p;
    }
    
    public static Punto creaPuntoAleatorio(){
        int x = (int) (Math.random() * 201 - 100);
        
        int y = (int) (Math.random() * 201 - 100);
        
        return new Punto (x,y);
    }
    
    
    
    
}
