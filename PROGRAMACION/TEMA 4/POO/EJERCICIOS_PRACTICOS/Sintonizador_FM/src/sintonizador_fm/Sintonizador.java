/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sintonizador_fm;
import java.util.*;
/**
 *
 * @author Gonzalo
 */
public class Sintonizador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
     
        int respuesta = 0;
        
         RadioFrecuencia f1 = new RadioFrecuencia();
        
        do {
            System.out.println("---RADIO---");
            System.out.println("1.Introducir frecuencia: ");
            System.out.println("2.Mostrar frecuencia: ");
            System.out.println("3.Subir frecuencia: ");
            System.out.println("4.Bajar frecuencia: ");
            System.out.println("5.Salir");
            
            respuesta = sc.nextInt();
            System.out.println("");
            
            switch (respuesta) {
                case 1:
                    double respu;
                    respu = sc.nextDouble();
                    f1.Frecu(respu);
                    break;
                
                case 2:
                    f1.display();
                    break;
                    
                case 3:
                    f1.subida();
                    break;
                    
                case 4:
                    f1.bajada();
                    break;
                    
                case 5:
                    
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (respuesta != 5);
        
    }
    
}
