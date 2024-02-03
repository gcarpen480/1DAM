/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio31;

/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int mayor = 0;
        int menor = 199;
        int media = 0;
        int suma = 0;
        
        for (int i = 100; i <= 199; i++) {
            int numero = 100+ (int)(Math.random()*100);
            if (numero > 100 & numero < 199) {
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor){
                    menor = numero;
                }
            }
            System.out.print(numero);
            System.out.print(" ");
            suma = suma + numero;
        }
        
        media = suma / 50;
        System.out.println(" ");
        System.out.println("Este es el numero mayor: " +mayor);
        System.out.println("Este es el numero menor: "+menor);
        System.out.println("Esta es la media: "+media);
    }
    
}
