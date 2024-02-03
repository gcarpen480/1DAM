/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dawbank;

/**
 *
 * @author Gonzalo Carretero Peñalosa
 */
public class CuentaBancaria {
    
    //Atributos
    
    //Variables de instancia
    
    //Constantes de instancia;
    private final String titular,IBAN;
    
    private double movimientos[] = new double [maxMovimientos];
    private double saldo = 0;
    private int Nummovimientos = 0;
    
    //Constatntes de clase (estaticas)
    private static final int maxMovimientos = 100;
    private static final int maxSaldo = 3000;
    private static final int minSaldo = -50;
    

    
    public CuentaBancaria(String titular, String IBAN) {
        this.titular = titular;
        this.IBAN = IBAN;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public String getIban() {
        return IBAN;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public double[] getMovimientos() {
        return movimientos;
    }
    
    public double getnumMovimientos() {
        return Nummovimientos;
    }
    
    
    
    public void imprime(){
        System.out.println("Nombre del Titular: "+titular);
        System.out.println("IBAN: "+this.IBAN);
        System.out.println("Saldo:"+this.saldo);
    }
    
    public void ingreso(double ingreso){
        if (ingreso > maxSaldo) {
            System.out.println("AVISO: Notificar a hacienda");
        }
        
        if (Nummovimientos > 100) {
            System.out.println("Has alcanzado el numero maximo de movimientos");
        }
        else{
            movimientos[Nummovimientos] = ingreso;
            saldo += ingreso;
        }
    }
    
    public void retiro (double retiro){
        if ((saldo - retiro)< 0) {
            System.out.println("AVISO: Saldo negativo");
        }
        if (saldo < -50) {
            System.out.println("No se puede realizar la retirada del dinero");
        }
        else{
            movimientos[Nummovimientos] = retiro;
            saldo -= retiro;
        }
    }
}
