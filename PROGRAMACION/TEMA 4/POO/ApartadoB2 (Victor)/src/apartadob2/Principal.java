package apartadob2;
//import java.util.Scanner;

/*
ENUNCIADO:


*\
/**
 * @author Víctor Quirós Pavón
 */
public class Principal {

    
    public static void main(String[] args) {
        
        Persona p1 = new Persona (123456789, 18, "Víctor", "Quirós");
        
        
        if (p1.getEDAD() >= 18){
            System.out.println(p1.getNOMBRE()+" "+p1.getAPELLIDOS()+" con DNI "+p1.getDNI()+" es mayor de edad");
        }
        else{
            System.out.println(p1.getNOMBRE()+" "+p1.getAPELLIDOS()+" con DNI "+p1.getDNI()+" no es mayor de edad");
        }
        
        
    }//main

}//class
