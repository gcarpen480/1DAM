/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicioa2;
import java.util.*;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */

/* -----------------------------------ENUNCIADO---------------------------------
    El DNI de una persona no puede variar. Añade el modificador final al atributo dni y asegúrate de
    que se guarde su valor en el constructor. Quita el método setDNI(…) que de todos modos ya no se
    podrá utilizar porque Java no te dejará modificar el atributo dni.

    La mayoría de edad a las 18 años es un valor común a todas las personas y no puede variar. Crea
    un nuevo atributo llamado mayoriaEdad que sea static y final. Tendrás que inicializarlo a 18 en la
    declaración. Utilízalo en el método que comprueba si una persona es mayor de edad.

    Crea un método static boolean validarDNI(String dni) que devuelva true si dni es válido (tiene 8
    números y una letra). Si no, devolverá false. Utilízalo en el constructor para comprobar el dni (si no
    es válido, muestra un mensaje de error y no guardes los valores).

    Realiza algunas pruebas en el main para comprobar el funcionamiento de los cambios realizados.
    También puedes utilizar Persona.validarDNI(…) por ejemplo para comprobar si unos DNI
    introducidos por teclado son válidos o no (sin necesidad de crear ningún objeto).
   -----------------------------------------------------------------------------
*/
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p1 = new Persona("Amador","","Rivas",35);
        Persona p2 = new Persona("Maite","","Figueroa",45);
        
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println(p1.getNOMBRE()+" "+p1.getAPELLIDOS()+" "+p1.getDNI()+" "+p1.getEDAD());
        System.out.println(p2.getNOMBRE()+" "+p2.getAPELLIDOS()+" "+p2.getDNI()+" "+p2.getEDAD());
                
        System.out.println("");
        
        if (p1.esMayorEdad() == true) {
            System.out.println(p1.getNOMBRE()+" es mayor de edad");
        }
        else{
            System.out.println(p1.getNOMBRE()+" no es mayor de edad");
        }
        
        if (p2.esMayorEdad() == true) {
            System.out.println(p2.getNOMBRE()+" es mayor de edad");
        }
        else{
            System.out.println(p2.getNOMBRE()+" no es mayor de edad");
        }
        
        System.out.println("");
        
        if (p1.esJubilado()== true) {
            System.out.println(p1.getNOMBRE()+" se encuentra ya jubilado");
        }
        else{
            System.out.println(p1.getNOMBRE()+" no se encuentra ya jubilado");
        }
        
        if (p2.esJubilado()== true) {
            System.out.println(p2.getNOMBRE()+" se encuentra ya jubilado");
        }
        else{
            System.out.println(p2.getNOMBRE()+" no se encuentra ya jubilado");
        }
        
        System.out.println("");
        
        System.out.println("Introduzca su DNI para validar si es correcto: ");
        String dni;
        
        dni = sc.nextLine();
        System.out.println("");
        
        if (Persona.validarDNI(dni)) {
            System.out.println("El DNI introducido es valido");
        }
        
        else{
            System.out.println("El DNI introducido no es valido");
        }
    }//main
    
    

}//class
