/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dawbank;

import java.util.*;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */

/* -----------------------------------ENUNCIADO---------------------------------


   -----------------------------------------------------------------------------
 */
public class DawBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        int respuesta, respingreso;

        CuentaBancaria c1 = new CuentaBancaria("Pablo", "ES789951123357654189789");

        respuesta = menu();

        do {
            switch (respuesta) {
                case 1:
                    c1.imprime();
                    break;

                case 2:
                    c1.getIban();
                    break;

                case 3:
                    c1.getTitular();
                    break;

                case 4:
                    c1.getSaldo();
                    break;

                case 5:
                    System.out.println("Introduzca cuanto quiere ingresar");
                    respingreso = sc.nextInt();
                    c1.ingreso(respuesta);
                    break;

                case 6:

                    break;

                case 7:

                    break;
                case 8:
                    System.out.println("\033[0;32mNos vemos la proxima vez");
                    break;

                default:
                    throw new AssertionError();
            }
        } while (respuesta != 8);

    }//main

    public static int menu() {
        Scanner sc = new Scanner(System.in);

        int respuesta = 0;

        do {
            try {
                System.out.println("----CUENTA----");
                System.out.println("1. Datos de la cuenta");
                System.out.println("2. Mostrar el IBAN");
                System.out.println("3. Mostrar nombre del titular");
                System.out.println("4. Consultar saldo");
                System.out.println("5. Ingreso a la cuenta");
                System.out.println("6. Retirada a la cuenta");
                System.out.println("7. Movimientos de la cuenta");
                System.out.println("8. Salir");

                respuesta = sc.nextInt();
                System.out.println("");

            } catch (Exception e) {
                System.out.println("\033[0;31mEl valor introducido es incorrecto");
            }

            return respuesta;

        } while (respuesta != 8);

    }//menu

}//class
