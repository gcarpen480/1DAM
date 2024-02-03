package apartadob1;
import java.util.Scanner;

/*
ENUNCIADO:


*\
/**
 * @author Víctor Quirós Pavón
 */
public class Principal {

    
    public static void main(String[] args) {

        Punto pu1 = new Punto(5,0);
        Punto pu2 = new Punto(10, 10);
        Punto pu3 = new Punto(-3, 7);
        
//       pu1.x = 5;    pu1.y = 0;
//       pu2.x = 10;    pu2.y = 10;
//       pu3.x = -3;    pu3.y = 7;
       

//        System.out.println("Punto 1 = "+pu1.x+":"+pu1.y);
//        System.out.println("Punto 2 = "+pu2.x+":"+pu2.y);
//        System.out.println("Punto 3 = "+pu3.x+":"+pu3.y);

        System.out.println("Punto 1: " + pu1.getX() + ":" + pu1.getY());
        System.out.println("Punto 2: " + pu2.getX() + ":" + pu2.getY());
        System.out.println("Punto 3: " + pu3.getX() + ":" + pu3.getY());


    }//main

}//class
