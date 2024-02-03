/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1matriz;
import java.util.*;
/*
--------------------------------------------------------------------------------
Se desean guardar y representar las notas de 5 alumnos en 4 asignaturas 
(números aleatorios con decimales entre 0 y 10) en una matriz. Además, 
tanto para cada asignatura como para cada alumno, se precisa obtener y 
almacenar la nota máxima, mínima y la media aritmética.
--------------------------------------------------------------------------------
*/
/**
 *
 * @author Gonzalo Carretero
 */
public class Ejercicio1Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Colocamos las variables una para los alumnos y otra para las asignaturas
        double suma = 0;
        double max = 0;
        double min = 10;
        double media = 0;
        
        double suma2 = 0;
        double max2 = 0;
        double min2 = 10;
        double media2 = 0;
        
        //Incializamos la variable Asignaturas a 4 y Alumnos 5 para posteriomente asignarlo a la matriz
        final int ASIGNATURAS = 4;
        final int ALUMNOS = 5;
        
        double v1[][] = new double [ALUMNOS][ASIGNATURAS];
        double v2[][] = new double [ALUMNOS][3];
        double v3[][] = new double [3][ASIGNATURAS];
        //Creamos las matrices
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        for (int i = 0; i < ALUMNOS; i++) {
            for (int j = 0; j < ASIGNATURAS; j++) {
                v1[i][j] = (Math.random() * 10);
                //Rellenamos la matriz v1 con numeros aleatorios
            }
            
        }
        
        for (int i = 0; i < ALUMNOS; i++) {
             max = 0;
             min = 10;
             suma = 0;
             //Inicilizamos las variables para obtener la suma , numero maximo y minimo de la primera matriz
             for (int j = 0; j < ASIGNATURAS; j++) {
                 if (v1[i][j] > max) {//Comporamos v1 que esta relleno de numeros aleatorios con la nota maxima
                     max = v1[i][j];
                 }
                 if (v1[i][j] < min) {//Comporamos v1 que esta relleno de numeros aleatorios con la nota minima
                     min = v1[i][j];
                 }
                 
                 suma = suma + v1[i][j];
                 
            }
             media = suma / ASIGNATURAS;
             
             //Se pasa el valor variables max,min y media a la matriz v2
             v2[i][0] = max;    
             v2[i][1] = min;
             v2[i][2] = media;
             
        }
        
        for (int i = 0; i < ASIGNATURAS; i++) {
             max2 = 0;
             min2 = 10;
             suma2 = 0;
             //Inicilizamos las variables para obtener la suma , numero maximo y minimo de la segunda matriz
             for (int j = 0; j < ALUMNOS; j++) {
                 if (v1[j][i] > max2) {//Comporamos v2 que esta relleno de numeros aleatorios con la nota maxima
                     max2 = v1[j][i];
                 }
                 if (v1[j][i] < min2) {//Comporamos v2 que esta relleno de numeros aleatorios con la nota minima
                     min2 = v1[j][i];
                 }
                 
                 suma2 = suma2 + v1[j][i];
                 
            }
             media2 = suma2 / ALUMNOS;
             
             //Se pasa el valor variables max,min y media a la matriz v3
             v3[0][i] = max2;
             v3[1][i] = min2;
             v3[2][i] = media2;
             
        }
        
        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v1[0].length; j++) {
                System.out.printf("%.1f  ",v1[i][j]);
                //Mostramos las notas generadas aleatoriamente con un decimal
            }
            
            //Mostramos las maxima , minima y la media de las notas
            System.out.printf("  "+ "%.1f", v2 [i][0]);
            System.out.printf("  "+"%.1f", v2 [i][1]);
            System.out.printf("  "+"%.1f", v2 [i][2]);
            
            System.out.println(" ");
            
        }
        
        System.out.println(" ");
        
        for (int i = 0; i < v3.length; i++) {
            for (int j = 0; j < v3[0].length; j++) {
                 System.out.printf("%.1f  ", v3 [i][j]); 
                //Mostramos la maxima , minima y media de las asignaturas
            }
            System.out.println(" ");
        }
 
    }
    
}
