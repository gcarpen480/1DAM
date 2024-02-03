/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.*;

/*
--------------------------------ENUNCIADO---------------------------------------
Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”.
En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo
oportuno. Implementa las funciones:

int menu() // Muestra el menú y devuelve el número elegido
double pideRadio() // Pide que se introduzca el radio y lo devuelve
double circunferencia(double r) // Calcula la circunferencia y la devuelve
double area(double r) // Calcula el área y la devuelve

Modifica el programa añadiendo otra opción llamada “Volumen”, permitiendo que el usuario
también pueda solicitar el cálculo del volumen. Añade la función:
double volumen(double r) // Calcula el volumen y lo devuelve

Modifica el programa añadiendo otra opción llamada “Todas” en la que se pida el radio una sola vez
y se muestren los tres cálculos posibles (circunferencia, área y volumen).

Modifica el programa anterior de modo que el proceso se repita una y otra vez (mostrar menú ->
realizar el cálculo -> volver a mostrar menú). Añade una opción más llamada “Salir” que terminará
el programa si es elegida
--------------------------------------------------------------------------------
 */
/**
 *
 * @author Gonzalo Carretero Peñalosa
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        //Declaramos las variables que vamos a necesitar.
        int respuesta;
        double radio, circunferencia, area, volumen;

        do {
            //Llamamos a la funcion llamada como Menu para mostrar el menu y recoger
            //la respuesta que proporciona el usuario para moverse por el menu 
            
            respuesta = menu();

            try {

                switch (respuesta) {
                    case 1:
                        //Llamamos a la funcion con la que pedimos el radio para
                        //posteriomente realizar el calculo de la circunferencia
                        
                        radio = pideRadio();
                        circunferencia(radio);
                        System.out.println("");

                        break;

                    case 2:
                        //Llamamos a la funcion con la que pedimos el radio para
                        //posteriomente realizar el calculo de la area
                        
                        radio = pideRadio();
                        area(radio);
                        System.out.println("");

                        break;

                    case 3:
                        //Llamamos a la funcion con la que pedimos el radio para
                        //posteriomente realizar el calculo de la volumen
                        
                        radio = pideRadio();
                        volumen(radio);
                        System.out.println("");

                        break;

                    case 4:
                        //Llamamos a la funcion con la que pedimos el radio para
                        //posteriomente realizar el calculo de la circunferencia ,
                        //area , volumen , area.
                        
                        radio = pideRadio();
                        circunferencia(radio);
                        area(radio);
                        volumen(radio);
                        System.out.println("");

                        break;

                    case 5:
                        //Cuando salimos nos muestra este mensaje despedida
                        System.out.println("\033[0;32mNos vemos la proxima vez");
                        break;
                    default:
                        System.out.println("\033[0;31mEl valor introducido es incorrecto");
                }

            } catch (InputMismatchException e) {
                System.out.println("\033[0;31mEl valor introducido es incorrecto");
            }
        } while (respuesta != 5);

    }

    public static int menu() {

        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        
        boolean valido = false;

        //Utilizamos un try para si el usuario coloca un valor fuera de la varible
        // int que nos de un error.
        
        do {
            try {
            //Despues mostramos el menu y le preguntamos al usuario que opcion quiere
            //elegir.
            System.out.println("\033[0;32m-----MENU-----");
            System.out.println("\033[0;34m1. Circunferencia");
            System.out.println("\033[0;34m2. Área");
            System.out.println("\033[0;34m3. Volumen");
            System.out.println("\033[0;34m4. Todas");
            System.out.println("\033[0;34m5. Salir");

            respuesta = sc.nextInt();
            System.out.println("");
            
        } catch (InputMismatchException e) {
            System.out.println("\033[0;31mEl valor introducido es incorrecto");
            
            valido = true;
        }

        return respuesta;
        
        } while (valido != false);
    }

    public static double pideRadio() {

        Scanner sc = new Scanner(System.in);

        double radio = 0;
        boolean respuesta = false;

        //Utilizamos un try para si el usuario coloca un valor fuera de la varible
        // int que nos de un error.
        
        do {
            try {
            System.out.println("\033[0;32mIntroduzca el radio de la circunferencia en unidad de cm: ");
            
            //Le pedimos al usuario que introduzca el tamaño del usuario.
            radio = sc.nextInt();
            
        } catch (InputMismatchException e) {
            System.out.println("\033[0;31mEl valor introducido es incorrecto");
            
            respuesta = true;
            
        }

        return radio;
        
        } while (respuesta != false);

    }

    public static double circunferencia(double r) {

        double circunferencia;

        //Realizamos las operaciones necesarias para calcular la circunferencia
        System.out.print("\033[0;35mLongitud = ");
        circunferencia = r / (2 * Math.PI);
        System.out.println(circunferencia + " cm");

        return circunferencia;
    }

    public static double area(double r) {

        double area;

        //Realizamos las operaciones necesarias para calcular la area
        System.out.print("\033[0;35mArea = ");
        area = Math.PI * (r * r);
        System.out.println(area + " cm2");

        return area;

    }

    public static double volumen(double r) {

        double volumen;

        //Realizamos las operaciones necesarias para calcular el volumen
        
        System.out.print("\033[0;35mVolumen = ");
        volumen = 4 / 3 * Math.PI * Math.pow(r, 3);
        System.out.println(volumen + " cm3");       
        
        return volumen;

    }

}