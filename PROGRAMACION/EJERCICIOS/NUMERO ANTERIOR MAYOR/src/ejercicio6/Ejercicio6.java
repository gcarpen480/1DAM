/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero1 , numero2 = 1;
        int mal = 0;
        int total = 0;
        int nummayor = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero siempre debe ser mayor que el anterior  ");
        numero1 = sc.nextInt();
        
        nummayor = numero1;
        
        while (numero2 != 0) {
            System.out.println("Dime otro numero");
            numero2 = sc.nextInt();
            total = total + 1;
            
            if (numero2 < nummayor) {
                nummayor = numero2;
                System.out.println("Fallo es menor");
                mal = mal + 1;
        }

    }
        mal = mal - 1;
        System.out.println("Numeros totales: "+total);
        System.out.println("Numeros mal introducidos: "+mal);

        
    }
    
}
