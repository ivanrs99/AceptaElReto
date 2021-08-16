package ej100_110;

import java.util.Scanner;

public class ej103 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {        
        while (true) {
            int grado = sc.nextInt();
            if(grado == 20) break;
            int[] polinomio = new int[grado+1];
            for (int i = 0; i < grado+1; i++) {
                polinomio[i] = sc.nextInt();
            }
            double n = sc.nextDouble();
            calcularArea(grado, polinomio, n);
        }
    }
    
    public static void calcularArea(int grado, int[] polinomio, double n){
        double sumaCain = 0;
        for (int i = 0; i < n; i++) {
            double base = 1/n;
            double altura = i*(1/n);
            altura = calcularFuncion(altura, polinomio);
            if(altura > 0 && altura <= 1){
                sumaCain += base*altura;
            }else if(altura > 1){
                sumaCain += base;
            }
        }
        double sumaAbel = 1-sumaCain;
        
        if(sumaCain >= sumaAbel){
            if((sumaCain-sumaAbel) <= 0.001)
                System.out.println("JUSTO");
            else
                System.out.println("CAIN");
        }
        else{
            if((sumaAbel-sumaCain) <= 0.001)
                System.out.println("JUSTO");
            else
                System.out.println("ABEL");
        }
    }
    
    public static double calcularFuncion(double altura, int[] polinomio){
        double suma = 0;
        int elevado = polinomio.length-1;
        for (int i = 0; i < polinomio.length; i++) {
            double value = polinomio[i] * (Math.pow(altura, elevado));
            suma += value;
            elevado--;
        }
        
        return suma;
    }
}
