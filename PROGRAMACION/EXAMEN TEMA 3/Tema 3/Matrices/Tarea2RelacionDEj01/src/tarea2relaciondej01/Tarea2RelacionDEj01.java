/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tarea2relaciondej01;

/**
 *
 * @author Manuel Ripalda
 */
/*Se desean guardar y representar las notas de 5 alumnos en 4 asignaturas (números aleatorios con decimales entre 0 y 10) en una matriz. Además, 
tanto para cada asignatura como para cada alumno, se precisa obtener y almacenar la nota máxima, mínima y la media aritmética.*/
public class Tarea2RelacionDEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int ALUMNOS=5,ASIGNATURAS=4, NOTAS=3;
         
        double array[][][]=new double[ALUMNOS][ASIGNATURAS][NOTAS],minAlumno,maxAlumno,mediaAlumno,minAsig,maxAsig,mediaAsig;
        
        double vector[][]=new double[ASIGNATURAS][NOTAS];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length; j++) {
                vector
                
                for (int k = 0; k < array[i][j].length; k++) {
                    
                    if (k==0||k==1){
                    
                        array[i][j][k]=Math.random()*10;
   
                    }else{
                    
                        array[i][j][k]=(array[i][j][0]+array[i][j][1])/2;
                        
                    } 
                    vector[j][k]=array[i][j][k];
                }  
               
                
                
            } 
        }
     
       /* for (int i = 0; i < array.length; i++) {
            
            System.out.println("Alumno nº"+(i+1)+":");
            
            
            for (int j = 0; j < array[i].length; j++) {
                
                System.out.println("Asignatura nº"+(j+1)+":");
                
                for (int k = 0; k < array[i][j].length; k++) {
                    
                    if(k==0){
                    System.out.print("Nota máxima:\t");
                    }else if(k==1){
                    
                        System.out.print("Nota mínima:\t");
                        
                    }else{
                    
                        System.out.print("Nota media:\t");
                    }
                    
                    System.out.printf("%.2f",array[i][j][k]);
                    System.out.println("");
                }
                
            }
            
        }*/
        for (int i = 0; i < array.length; i++) {
            
            mediaAlumno=0;
             
            minAlumno=10;
            
            maxAlumno=0;
            
            for (int j = 0; j < ASIGNATURAS+3; j++) {

                if(j<4){
                    
                    System.out.printf("%.2f",array[i][j][2]);

                    System.out.print("\t");

                    mediaAlumno+=array[i][j][2];
                    
                    if(array[i][j][2]<minAlumno){
                
                        minAlumno=array[i][j][2];
                    }
                    if(array[i][j][2]>maxAlumno){
                        maxAlumno=array[i][j][2];
                    }
                }else{
                    
                    if(j==ASIGNATURAS+1){

                        System.out.printf("%.2f",minAlumno);
                        System.out.print("\t");

                    }else if(j==ASIGNATURAS+2){

                        System.out.printf("%.2f",maxAlumno);
                        System.out.print("\t");
                    }else{
                        mediaAlumno/=ASIGNATURAS;
                        System.out.printf("%.2f",mediaAlumno);
                        System.out.print("\t");

                    }   
                }
            }
            System.out.println("");
        }
        
        for (int i = 0; i < array.length; i++) {
            
            mediaAsig=0;
             
            minAsig=10;
            
            maxAsig=0;
            
                        
        }
        
    }

}
