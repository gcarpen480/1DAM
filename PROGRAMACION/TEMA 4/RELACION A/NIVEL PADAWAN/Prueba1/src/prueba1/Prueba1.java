/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        double v1[][][] = new double[3][4][3];

        double randnum, total = 0;
        double sum1 = 0, sum2 = 0, sum3 = 0;
        int opcion;

        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v1[0].length; j++) {
                for (int k = 0; k < v1[0][0].length; k++) {
                    do {
                        v1[i][j][k] = (Math.random() * 9000) + 1;

                    } while (v1[i][j][k] < 5000 | v1[i][j][k] > 9000);

                }

            }

        }

        do {
            System.out.println("---------------------MENU--------------------");
            System.out.println("Bienvenido para moverte por el menu pulse los numeros que deseas");
            System.out.println("1. Listado de todas las ventas por establecimiento");
            System.out.println("2. Mostrar el total de ventas de cada establecimiento.");
            System.out.println("3. Mostrar la media de cada establecimiento.");
            System.out.println("4. Mostrar el total de ventas de la empresa.");
            System.out.println("5. Mostrar las ventas del mes de diciembre.");
            System.out.println("6. Salir");
            System.out.println("---------------------------------------------");
            
            opcion = sc.nextInt();
            System.out.println("");
            
            switch (opcion) {
                case 1:
                    for (int i = 0; i < v1.length; i++) {
                        System.out.println("\n" + "Establecimiento " + i + "\n");

                        System.out.print("\t\tOctubre \t");
                        System.out.print("Noviembre \t");

                        System.out.print("Diciembre \t");
                        System.out.println("");

                        for (int j = 0; j < v1[0].length; j++) {

                            if (j == 0) {
                                System.out.print("Arranque\t");

                            }
                            if (j == 1) {
                                System.out.print("Tortilla Papas\t");

                            }
                            if (j == 2) {
                                System.out.print("Tortilla\t");

                            }
                            if (j == 3) {
                                System.out.print("Pescaito Var\t");
                            }

                            for (int k = 0; k < v1[0][0].length; k++) {

                                System.out.printf("%.2f", v1[i][j][k], "\t");
                                System.out.print("\t\t");

                                //Variables ejercicio 2
                                if (k == 0) {
                                    sum1 += v1[i][j][k];
                                }
                                if (k == 1) {
                                    sum2 += v1[i][j][k];
                                }
                                if (k == 2) {
                                    sum3 += v1[i][j][k];
                                }

                            }

                            System.out.println("");

                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < v1.length; i++) {
                        System.out.println("");

                        if (i == 0) {
                            System.out.print("Octubre: \t");
                            System.out.println("");
                        }
                        if (i == 1) {
                            System.out.print("Noviembre: \t");
                            System.out.println("");
                        }
                        if (i == 2) {
                            System.out.print("Diciembre: \t");
                            System.out.println("");
                        }

                        System.out.println("");
                        System.out.print("Establecimiento 1 = ");
                        System.out.printf("%.2f", sum1);
                        System.out.println("");

                        System.out.print("Establecimiento 2 = ");
                        System.out.printf("%.2f", sum2);
                        System.out.println("");

                        System.out.print("Establecimiento 3 = ");
                        System.out.printf("%.2f", sum3);
                        System.out.println("");
                    }

                    sum1 = 0;
                    sum2 = 0;
                    sum3 = 0;

                    break;
                case 3:
                    for (int i = 0; i < v1.length; i++) {
                        System.out.println("");

                        if (i == 0) {
                            System.out.println("Octubre");
                        }
                        if (i == 1) {
                            System.out.println("Noviembre");
                        }
                        if (i == 2) {
                            System.out.println("Diciembre");
                        }

                        for (int j = 0; j < v1[0].length; j++) {
                            for (int k = 0; k < v1[0][0].length; k++) {

                                if (k == 0) {
                                    sum1 += v1[i][j][k];
                                }
                                if (k == 1) {
                                    sum2 += v1[i][j][k];
                                }
                                if (k == 2) {
                                    sum3 += v1[i][j][k];
                                }

                            }

                        }

                        sum1 = sum1 / v1[0].length;
                        sum2 = sum2 / v1[0].length;
                        sum3 = sum3 / v1[0].length;

                        System.out.println("");
                        System.out.print("Establecimiento 1 = ");
                        System.out.printf("%.2f", sum1);
                        System.out.println("");

                        System.out.print("Establecimiento 2 = ");
                        System.out.printf("%.2f", sum2);
                        System.out.println("");

                        System.out.print("Establecimiento 3 = ");
                        System.out.printf("%.2f", sum3);
                        System.out.println("");
                    }
                    System.out.println("");

                    sum1 = 0;
                    sum2 = 0;
                    sum3 = 0;
                    
                    break;
                case 4:
                    for (int i = 0; i < v1.length; i++) {
                        for (int j = 0; j < v1[0].length; j++) {
                            for (int k = 0; k < v1[0][0].length; k++) {

                                if (i == 0) {
                                    sum1 += v1[i][j][k];
                                }
                                if (i == 1) {
                                    sum2 += v1[i][j][k];
                                }
                                if (i == 2) {
                                    sum3 += v1[i][j][k];
                                }

                            }

                        }

                    }

//                    System.out.printf("%.2f", sum1);
//                    System.out.println("");
//                    System.out.printf("%.2f", sum2);
//                    System.out.println("");
//                    System.out.printf("%.2f", sum3);

                    total = sum1 + sum2 + sum3;

                    System.out.print("Total de Ventas de la empresa: ");
                    System.out.printf("%.2f",total);

                    System.out.println("");

                    sum1 = 0;
                    sum2 = 0;
                    sum3 = 0;
                    
                    break;
                    
                case 5:
                    for (int i = 0; i < v1.length; i++) {
                        for (int j = 0; j < v1[0].length; j++) {
                            for (int k = 0; k < v1[0][0].length; k++) {
                                
                                if (i == 2) {
                                    sum1 += v1[i][j][k];
                                }
                                
                            }
                            
                        }
                        
                    }
                    System.out.print("Total de Ventas en Diciembre: ");
                    System.out.printf("%.2f",sum1);
                    System.out.println("");
                    
                    sum1 = 0;
                    sum2 = 0;
                    sum3 = 0;
                    
                    break;
                    
                default:    
            }
        } while (opcion != 6);
        System.out.println("Nos vemos la proxima vez Chaooo!!!!!");
        
    }
    
}
