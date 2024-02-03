/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dada;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Dada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int npersonas,hombres = 0,mujer = 0,sumahombre = 0,sumamujer = 0;
        int sueldomediohombres,sueldomediomujer;
        
        System.out.println("Introduzca el numero de personas ");
        Scanner sc = new Scanner(System.in);
        npersonas = sc.nextInt();
        
        int matrizSueldo[][] = new int[npersonas][2];
        
        for (int i = 0; i < matrizSueldo.length; i++) {
            for (int j = 0; j < matrizSueldo[0].length; j++) {
                if (j == 0) {
                    System.out.print("Ingrese el gÃ©nero (0 para hombre, 1 para mujer) "
                        + "de la persona " + (i + 1) + ": ");
                    matrizSueldo[i][j] = sc.nextInt();
                }
                if (j == 1) {
                    System.out.print("Ingrese el sueldo para la persona " 
                            + (i + 1) + ": ");
                    matrizSueldo[i][j] = sc.nextInt();
                }
            }

            if (matrizSueldo[i][0]== 0) {
                hombres = hombres + 1;
                sumahombre += matrizSueldo[i][1];
            }
            if (matrizSueldo[i][0] == 1) {
                mujer = mujer + 1;
                sumamujer += matrizSueldo[i][1];
            }
            
        }
        
        System.out.println("");
        if (hombres > 0) {
            System.out.println("El sueldo medio de los hombres es "
                + "de "+ sumahombre / hombres+" ï¿½");
        }
        if (mujer > 0) {
            System.out.println("El sueldo medio de las mujeres "
                + "es de "+sumamujer / mujer +" ï¿½");
        }
    }
    
}
