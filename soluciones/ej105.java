package ej100_110;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ej105 {
    
    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    static Map<Integer, Double> dias = new HashMap<Integer, Double>();
    static Map<Integer, String> diasNombre = new HashMap<Integer, String>();

    public static void main(String[] args) {
        diasNombre.put(1, "MARTES");
        diasNombre.put(2, "MIERCOLES");
        diasNombre.put(3, "JUEVES");
        diasNombre.put(4, "VIERNES");
        diasNombre.put(5, "SABADO");
        diasNombre.put(6, "DOMINGO");
        
        int dia = 1;
        while (true) {
            double ganancia = sc.nextDouble();
            if(ganancia == -1)
                break;
            dias.put(dia, ganancia);
            if(++dia == 7){
                calcularDatos();
                dia = 1;
            }
        }
    }
    
    public static void calcularDatos(){
        int mayorIndice = 0, menorIndice = 0;
        double mayor = 0, menor = Integer.MAX_VALUE;
        double sumaSemanal = 0;
        for (int i = 1; i < 7; i++) {
            if(i < 6){
                sumaSemanal += dias.get(i);
            }
            if(dias.get(i) > mayor){
                mayor = dias.get(i);
                mayorIndice = i;
            }
            if(dias.get(i) < menor){
                menor = dias.get(i);
                menorIndice = i;
            }
        }
        boolean masVentas = (dias.get(6) > (sumaSemanal/5));
        System.out.println(diasNombre.get(mayorIndice) +" "+ diasNombre.get(menorIndice) +" "+ ((masVentas) ? "SI":"NO"));        
    }
}
