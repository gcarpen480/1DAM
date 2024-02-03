/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package texto;

/**
 *
 * @author Emilio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto texto
        Texto nuevoTexto = new Texto("Hola que tal", 15);
        
        nuevoTexto.mostrarTexto();
        
        //Vamos a añadir al inicio
        nuevoTexto.añadirInicio('X');
        nuevoTexto.mostrarTexto();
        nuevoTexto.añadirInicio("aaa");
        nuevoTexto.mostrarTexto();
        
        //Añadimos al final
        nuevoTexto.añadirFinal("xx");
        nuevoTexto.mostrarTexto();
        nuevoTexto.añadirFinal('#');
        
        //Mostrar las vocales
        System.out.printf("El texto contiene %d vocales.",nuevoTexto.cuentaVocales());
    }//main
    
}//class
