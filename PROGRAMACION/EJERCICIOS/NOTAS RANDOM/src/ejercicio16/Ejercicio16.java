/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author Gonzalo
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        for (int i = 1; i < 20; i++) {
            num = (int)(Math.random()*5);
            switch (num) {
            case 1:
                System.out.println("Suspenso");
                break;
            case 2:
                System.out.println("Suspenso");
                break;
            case 3:
                System.out.println("Bien");
                break;
            case 4:
                System.out.println("Notable");
                break;
            case 5: 
                System.out.println("Sobresaliente");
                break;
        }
        }
        
    }
    
}
