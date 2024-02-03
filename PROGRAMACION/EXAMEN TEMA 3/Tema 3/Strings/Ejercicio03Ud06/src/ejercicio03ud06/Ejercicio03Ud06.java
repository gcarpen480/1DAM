/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio03ud06;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*_________________________________Enunciado______________________________________________
Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego
mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres
primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y
“Alcocer” mostrará “LIOTARALC”.

*/
public class Ejercicio03Ud06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String nombre,ape1,ape2,codigoUsuario;
        
        System.out.print("Nombre: ");
        
        nombre=sc.next();
        
        System.out.print("Primer apellido: ");
        
        ape1=sc.next();
        
        System.out.print("Segundo apellido: ");
        
        ape2=sc.next();
        
        codigoUsuario=nombre.substring(0,3)+ape1.substring(0, 3)+ape2.substring(0,3);
        
        System.out.println(codigoUsuario.toUpperCase());
        
    }

}
