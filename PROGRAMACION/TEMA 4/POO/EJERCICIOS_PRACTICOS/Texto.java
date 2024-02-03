/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package texto;
import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 *
 * @author Emilio
 */
public class Texto {
    //Atributos

    // Variables de instancia
    private int tamaño;
    private String contenido;
    private LocalDate creacion;
    private LocalDateTime modificacion;

    //Constantes de instancia
    // Constructores
    public Texto(String contenido, int tamaño) {
        this.contenido = contenido.length() <= tamaño ? contenido : "El tamaño no puede ser inferior a la cadena.";
        this.tamaño = tamaño;
        this.creacion= creacion.now();
        this.modificacion= modificacion.now();
    }//constructor

    // Métodos
    public void añadirInicio(char c) {
        if (tamaño > contenido.length()) {
            contenido = c + contenido;
            this.modificacion= modificacion.now(); //podemos darle el valor null modificacion=null;
        } else {
            System.out.println("No queda espacio en el texto.");
        }
    }//añadir al inicio caracter

    /*
    public void añadirInicio(char c) {
    añadirInicio(Character.toString(c));
}
     */
    public void añadirInicio(String cadena) { //La primera condición sobra
        if (tamaño > contenido.length() && tamaño >= (cadena + contenido).length()) {
            contenido = cadena + contenido;
            this.modificacion= modificacion.now();
        } else {
            System.out.println("No queda espacio en el texto.");
        }
    }//añadir al inicio cadena

    public void añadirFinal(char c) {
        if (tamaño > contenido.length()) {
            contenido = contenido + c;
            this.modificacion= modificacion.now();
        } else {
            System.out.println("No queda espacio en el texto.");
        }
    }//añadir al inicio caracter

    public void añadirFinal(String cadena) {
        if (tamaño > contenido.length() && tamaño >= (cadena + contenido).length()) {
            contenido = contenido + cadena;
            this.modificacion= modificacion.now();
        } else {
            System.out.println("No queda espacio en el texto.");
        }
    }//añadir al inicio cadena

    public int cuentaVocales() {
        int total = 0;
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        for (char c : contenido.toCharArray()) {
            if (vocales.indexOf(c) != -1) {
                total++;
            }
        }
        return total;
    } //cuenta vocales
    
    public void mostrarTexto() {
        System.out.println(this.contenido);
        System.out.println("Creado: "+creacion.now());
        System.out.println("Modificado: "+modificacion.now());
        
    }// mostrar texto
    
    
}//class
