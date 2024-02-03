/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.util.*;

/**
 *
 * @author Gonzalo
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        double[] v1;
//        v1 = new double[10];
//
//        double num;
//
        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < v1.length; i++) {
//            System.out.println("Introduzca un numero");
//            v1[i] = sc.nextDouble();
//        }
//
//        for (int i = 0; i < v1.length; i++) {
//            System.out.print("");
//            System.out.print(v1[i] + " ");
//
//        }

//        double [] v1;
//        v1 = new double [5];
//        
//        double num,suma = 0;
//        
//        Scanner sc = new Scanner (System.in);
//        
//        for (int i = 0; i < v1.length; i++) {
//            System.out.println("Introduzca un numero");
//            v1[i] = sc.nextDouble();
//            
//            suma = suma + v1[i];
//            
//        }
//        
//        System.out.println(suma);
//        int v1 [] = new int [15]; //Declaramos el vector y colocamos el tamaño de el l5
//        
//        for (int i = 0; i < v1.length; i++) {//Recore el vector pidiendo numero
//            System.out.println("Ingrese numeros");
//            v1[i] = sc.nextInt();//Insertamos un valor al vector
//            
//        }
//        int cont = 0;
//        
//        for (int i = 0; i < v1.length; i++) {//Recore el vector para comprobar si hay algun 3
//            if (v1[i] == 3) {//En el if no se pone solo el i tambien el vector
//                cont++; //Si introducimos un valor en 3 se le suma al contador
//            }//if
//        }//for
//        
//        System.out.println(cont);
//         int num [] = new int[12];
//         
//         num[0] = 39;
//         num[1] = -2;
//         num[4] = 0;
//         num[6] = 14;
//         num[8] = 8;
//         num[9] = 120;
//         
//         for (int i = 0; i < num.length; i++) {
//             System.out.println(num[i]);
//            
//        }
//        char simbolo[] = new char[10];
//        
//        simbolo[0] = 'a';
//        simbolo[1] = 'x';
//        simbolo[4] = '@';
//        simbolo[6] = ' ';
//        simbolo[7] = '+';
//        simbolo[8] = 'Q';
//        
//        for (int i = 0; i < simbolo.length; i++) {
//            System.out.println(simbolo[i]);            
//        }
//------------------------------------------------------------------------------        
//        int num [] = new int[10];
//        int num1 [] = new int[10];
//        int j = 9;
//        
//        System.out.println("Introduzca una seire de 10 numeros:");
//        for (int i = 0; i < num.length; i++) {
//            num[i] = sc.nextInt();
//            System.out.print(num[i]);
//        }
//        
//        for (int i = 0; i < num1.length; i++) {
//            num1[i] = num[j];
//            System.out.print(num[i]);
//            System.out.print(num1[i]);
//            System.out.println("");
//            j--;
//        }
//------------------------------------------------------------------------------
//        int numero[] = new int[20];
//        int cuadrado[] = new int[20];
//        int cubo[] = new int[20];
//
//        for (int i = 0; i < numero.length; i++) {
//            numero[i] = (int) (Math.random() * 101);
//
//        }
//
//        for (int i = 0; i < cuadrado.length; i++) {
//            cuadrado[i] = (int) Math.pow(numero[i], 2);
//
//        }
//
//        for (int i = 0; i < cubo.length; i++) {
//            cubo[i] = (int) Math.pow(numero[i], 3);
//
//        }
//
//        for (int i = 0; i < cubo.length; i++) {
//            System.out.print(numero[i] + "\t");
//            System.out.print(cuadrado[i] + "\t");
//            System.out.print(cubo[i] + "\t");
//            System.out.println("");
//
//        }
//------------------------------------------------------------------------------

//        int numero[] = new int[10];
//        int max = 0 , min = 0;
//        boolean variable = false;
//        boolean correcto = false;
//
//        try {
//            System.out.println("Introduzca 10 valores ENTERO:");
//            while (variable == false) {
//                for (int i = 0; i < numero.length; i++) {
//                    numero [i] = sc.nextInt();
//                    variable = true;
//                    correcto = true;
//                    
//                    if (numero[i] > max) {
//                        max = numero[i];
//                    }
//                    if (numero[i] < min) {
//                        min = numero[i];
//                    }
//                }
//            }
//            
//        } catch (Exception e) {
//            System.out.println("El valor introducido no pertenece a "
//                    + "al valor introducido");
//            
//            String error = sc.nextLine();
//        }
//        
//        if (correcto) {
//            System.out.println("El numero maximo es "+max);
//            System.out.println("El numero minimo es "+min);
//        }
        
//------------------------------------------------------------------------------
        
//        int N = 5;
//        int numero [] = new int [N];
//        int ultimo = 0;
//        
//        System.out.println("Introduzca 15 valores");
//        for (int i = 0; i < numero.length; i++) {
//            numero[i] = sc.nextInt();
//        }
//        
//        for (int i = 0; i < numero.length; i++) {
//            System.out.print(numero[i]+"\t");
//            
//        }
//        
//        ultimo=numero[N-1];
//        
//        System.out.println(ultimo);
//
//        for (int i = numero.length - 1; i > 0; i--) {
//            numero[i] = numero[i-1];
//            System.out.println(numero[i]);
//            
//        }
//        
//        numero[0]=ultimo;
//        
//        System.out.println(numero[0]);
//        
//        for (int i = 0; i < numero.length; i++) {
//            System.out.println("");
//            System.out.print(numero[i]+"\t");
//            
//        }

        
//--------------------------------------------------------------------------------

//        int numero [] = new int[100];
//        
//        for (int i = 0; i < numero.length; i++) {
//            numero[i] = (int)(Math.random()*21);
//            System.out.print(numero[i]+" ");
//        }
//        
//        System.out.println("");
//        System.out.println("Introduzca el valor a cambiar:");
//        int valor = sc.nextInt();
//        
//        System.out.println("Introduzca el valor nuevo");
//        int valornuevo = sc.nextInt();
//        
//        for (int i = 0; i < numero.length; i++) {
//            if (valor == valornuevo) {
//                numero[i] = valornuevo;
//                System.out.print("|"+numero[i]+"|");
//            }
//            else{
//                System.out.print(numero[i]+" ");
//            }
//        }
//        
//------------------------------------------------------------------------------

//        int v1 [] = new int [8];
//        
//        for (int i = 0; i < v1.length; i++) {
//            v1[i] = sc.nextInt();
//        }
//        
//        for (int i = 0; i < v1.length; i++) {
//            
//            if (v1[i] % 2 ==0) {
//                System.out.println(v1[i]+ " El numero es par");
//            }
//            else{
//                System.out.println(v1[i]+ " El numero es impar");
//            }
//            
//        }
        
//------------------------------------------------------------------------------
 
//        int vector[]=new int[20],numPares=0,pares[],numImpares=0,impares[],contadorPares=0,contadorImpares=0;
//        
//        System.out.println("Vector original:");
//        for (int i = 0; i < vector.length; i++) {
//            
//            vector[i]=(int)(Math.random()*101);
//            
//            if(vector[i]%2==0){
//            
//                numPares++;
//                
//            }else{
//            
//                numImpares++;               
//            }
//            System.out.print(vector[i]+"\t");
//        }
//        
//        pares=new int[numPares];
//                
//        impares=new int[numImpares];
//        
//        for (int i = 0; i < vector.length; i++) {
//            if(vector[i]%2==0){
//            
//                pares[contadorPares]=vector[i];
//                
//                contadorPares++;
//            }else{
//            
//                impares[contadorImpares]=vector[i];
//                
//                contadorImpares++;
//            }
//        }
//        
//        System.out.println("\nVector modificado: ");
//        
//        for (int i = 0; i < vector.length; i++) {
//            
//            if(i<numPares){
//            
//            vector[i]=pares[i];
//                
//            }else{
//            
//            vector[i]=impares[i-numPares];
//            
//            }
//            System.out.print(vector[i]+"\t");
//            
//        }
        
//------------------------------------------------------------------------------

//    String mes [] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio",""
//            + "Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
//    
//    int temperatura [] = new int [5];
//    
//        System.out.println("Introduzca la temperatura:");
//        
//        for (int i = 0; i < temperatura.length; i++) {
//            temperatura[i] = sc.nextInt();
//        }
//        
//        for (int i = 0; i < temperatura.length; i++) {
//             System.out.print(mes[i].substring(0,3)+":\t| "+temperatura[i]+"\tºC |-->\t");
//             
//             for (int j = 0; j < temperatura[i]; j++) {
//                
//                 System.out.print("*");
//                
//            }        
//            System.out.println("");
//        }

//------------------------------------------------------------------------------

//        int v1[][] = new int [5][5];
//        
//        for (int i = 0; i < v1.length; i++) {
//            for (int j = 0; j < v1[0].length; j++) {
//                v1[i][j] = (int)(Math.random()*10);
//                
//            }
//            
//        }
//        
//        for (int i = 0; i < v1.length; i++) {
//            for (int j = 0; j < v1[0].length; j++) {
//                System.out.print(v1[i][j]+" ");
//                
//            }
//            System.out.println("");
//        }
        

//------------------------------------------------------------------------------

//        int v1[][] = new int [10][10];
//        
//        for (int i = 0; i < v1.length; i++) {
//            for (int j = 0; j < v1[0].length; j++) {
//                v1[i][j] = (i+1) * (j+1);
//                
//                System.out.print(v1[i][j]+" ");
//                System.out.print("");
//                
//            }
//            System.out.println("");
//        }
        
//------------------------------------------------------------------------------

//        System.out.println("Introduzca cuantas filas va a tener la matriz");
//        int filas = sc.nextInt();
//        System.out.println("Introduzca cuantas columas va a tener la matriz");
//        int columnas = sc.nextInt();
//        
//        int v1[][] = new int[filas][columnas];
//        int contencima = 0, contabajo = 0 , contigual = 0;
//
//        System.out.println("Introduzca valores para añadir a la matriz");
//        for (int i = 0; i < v1.length; i++) {
//            for (int j = 0; j < v1[0].length; j++) {
//                v1[i][j] = sc.nextInt();
//                
//            }
//            
//        }
//        
//        for (int i = 0; i < v1.length; i++) {
//            for (int j = 0; j < v1.length; j++) {
//                
//                if (v1[i][j] > 0) {
//                    contencima++;
//                }
//                else if (v1[i][j] < 0) {
//                    contabajo++;
//                }
//                else if (v1[i][j] == 0) {
//                    contigual++;
//                }
//                
//            }
//            
//        }
//        
//        System.out.println("");
//        System.out.println("Por encima de 0: "+contencima);
//        System.out.println("Por abajo de 0: "+contabajo);
//        System.out.println("Igual que 0: "+contigual);
//        System.out.println("");
//        
//        for (int i = 0; i < v1.length; i++) {
//            for (int j = 0; j < v1.length; j++) {
//                System.out.print(v1[i][j]+" ");
//                
//            }
//            System.out.println("");
//        }
//------------------------------------------------------------------------------

       
//        int v1[][] = new int[4][2];
//        int max = 0, min = 10 ,media = 0;
//        
//        System.out.println("Introduzca las notas de los alumnos:");
//        for (int i = 0; i < v1.length; i++) {
//            for (int j = 0; j < v1[0].length; j++) {
//                System.out.println("Introduzca la nota del alumno " +i);
//                v1[i][j] = sc.nextInt();
//                
//                if (v1[i][j] > max) {
//                    max = v1[i][j];
//                }
//                if (v1[i][j] < min){
//                    min = v1[i][j];
//                }
//                
//                media = v1[i][j] / 2;
//            }
//            
//            System.out.println("La nota max del usuario "+i + 1+" es de: "+max);
//            System.out.println("La nota min del usuario "+i + 1+" es de: "+min);
//            System.out.println("La nota media del usuario "+i + 1+" es de: "+media);
//        }
        
//------------------------------------------------------------------------------
        
//        System.out.println("Cuantas personas tiene la empresa:");
//        int personas = sc.nextInt();
//        
//        int v1[][] = new int [personas][2];
//        int genero,cobro;
//        int cobrototalhomb = 0;
//        int totalhomb = 0, totalmuj = 0;
//        int conthomb = 0 , contmuj = 0;
//        
//        for (int i = 0; i < v1.length; i++) {
//            for (int j = 0; j < v1[0].length; j++) {
//                if (j == 0) {
//                    System.out.println("Introduzca su genero 0 - Hombre o 1 Mujer:");
//                    v1[i][j] = sc.nextInt();
//                    
//                }
//                if (j == 1) {
//                    System.out.println("Cuanto cobra:");
//                    v1[i][j] = sc.nextInt();
//                    
//                }
//            }
//           
//        }
//        
//        for (int i = 0; i < v1.length; i++) {
//            if (v1[i][0] == 0) {
//                totalhomb = totalhomb + v1[i][1];
//                conthomb++;
//                
//            }
//            if (v1[i][0] == 1) {
//                totalmuj = totalmuj + v1[i][1];
//                contmuj++;
//            }
//            
//        }
//        
//        System.out.println("Media de salario de hombres: "+(totalhomb /conthomb ));
//        System.out.println("Media de salario de mujeres: "+(totalmuj /contmuj ));

//------------------------------------------------------------------------------

//        String cadena;
//        
//        String cadena2 [] ;
//        
//        System.out.println("Introduzca una cadena de texto:");
//        cadena = sc.nextLine();
//        
//        cadena2 = cadena.split(" ");
//        
//        for (int i = 0; i < cadena2.length; i++) {
//            System.out.println(cadena2[i]+" ");
//            
//        }

//-------------------------------------------------------------------------------

//        String cadena , cadena2;
//        boolean iguales = false;
//        
//        System.out.println("Introduzca una primera cadena:");
//        cadena = sc.nextLine();
//        
//        System.out.println("Introduzca una segunda cadena:");
//        cadena2 = sc.nextLine();
//        
//        if (cadena.equals(cadena2)) {
//            
//        }

//------------------------------------------------------------------------------

//        String nombre , apellido1 , apellido,concat;
//        
//        System.out.println("Introduzca tu nombre:");
//        nombre = sc.nextLine();
//        
//        System.out.println("Introduzca tu primer apellido:");
//        apellido = sc.nextLine();
//        
//        System.out.println("Introduzca tu segundo apellido:");
//        apellido1 = sc.nextLine();
//        
//        concat = nombre.substring(0, 3) + apellido.substring(0, 3
//        ) + apellido1.substring(0, 3);
//        
//        System.out.println(concat.toUpperCase());

//------------------------------------------------------------------------------
//
//        String frase;                            //Ejercicio 4 String
//        
//        System.out.println("Introduzca una frase");
//        frase = sc.nextLine();
//        
//        for (int i = 0; i < frase.length(); i++) {
//            char caracter = frase.charAt(i);
//            
//            switch (caracter) {
//                case 'a':
//                    
//                    break;
//                case 'i':
//                    break;
//                case 'u':
//                    
//                case 'o':
//                    
//                case 'e':
//                    
//                default:
//            }
//        }


//------------------------------------------------------------------------------




    }

}
