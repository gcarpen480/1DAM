/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1matriz;
import java.util.*;
/*
Se desean guardar y representar las notas de 5 alumnos en 4 asignaturas 
(números aleatorios con decimales entre 0 y 10) en una matriz. Además, 
tanto para cada asignatura como para cada alumno, se precisa obtener y 
almacenar la nota máxima, mínima y la media aritmética.
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
        
        double v1[][] = new double [4][5];
        double v2[][] = new double [3][5];
        double v3[][] = new double [3][4];
        
        int contador = 0;
        int sumaAsignaturas = 0;
        int contadorAsig = 0;
        double notas,suma = 0;
        double max = 0;
        double min = 0;
        double maxAlum = 0;
        double minAlum = 0;
        
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        for (int ASIGNATURAS = 0; ASIGNATURAS < v1.length; ASIGNATURAS++) {
            for (int ALUMNOS = 0; ALUMNOS < v1[0].length; ALUMNOS++) {
                System.out.println("Introduzca la nota del alumno"+ALUMNOS+"en "
                        + "la asignatura "+ASIGNATURAS+":");
                notas = (Math.random()*10);
                v1[ASIGNATURAS][ALUMNOS] = notas;
                
                    if (v1[ASIGNATURAS][ALUMNOS] > maxAlum) {
                       maxAlum = notas; 
                    }
                    if (notas < maxAlum) {
                        minAlum = notas;
                    }
                    
                    suma = suma + notas;
                    contador++;
                    sumaAsignaturas = sumaAsignaturas;
                    contadorAsig++;
            }
        }
        
        for (int DATOS_ALUMNOS = 0; DATOS_ALUMNOS < v2.length; DATOS_ALUMNOS++) {
            for (int ALUMNOS = 0; ALUMNOS < v2[0].length; ALUMNOS++) {
                if (DATOS_ALUMNOS == 0) {
                    v2[DATOS_ALUMNOS][ALUMNOS] = max;
                }
                if (DATOS_ALUMNOS == 1) {
                    v2[DATOS_ALUMNOS][ALUMNOS] = min;
                }
                if (DATOS_ALUMNOS == 2) {
                    v2[DATOS_ALUMNOS][ALUMNOS] = suma / contador;
                }
                
            }
            
        }
        
        for (int DATOS_ASIGNATURAS = 0; DATOS_ASIGNATURAS < v3.length; DATOS_ASIGNATURAS++) {
            for (int ASIGNATURAS = 0; ASIGNATURAS < v2[0].length; ASIGNATURAS++) {
                if (DATOS_ASIGNATURAS == 0) {
                    v2[DATOS_ASIGNATURAS][ASIGNATURAS] = max;
                }
                if (DATOS_ASIGNATURAS == 1) {
                    v2[DATOS_ASIGNATURAS][ASIGNATURAS] = min;
                }
                if (DATOS_ASIGNATURAS == 2) {
                    v2[DATOS_ASIGNATURAS][ASIGNATURAS] = suma / contador;
                }
                
            }
            
        }
    }
    
}
