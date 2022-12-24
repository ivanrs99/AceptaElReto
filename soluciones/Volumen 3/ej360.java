import java.util.Scanner;

public class ej360 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int inicial, minimo, auxInicial, veces, perdida;
        for (int i = 0; i < casos; i++) {
            inicial = sc.nextInt();
            minimo = sc.nextInt();            
            perdida = sc.nextInt();
            auxInicial = inicial;
            veces = 0;
            
            while (perdida != -1) {
                auxInicial -= perdida;
                if(auxInicial < minimo){
                    auxInicial = inicial;
                    veces++;
                }
                perdida = sc.nextInt();
            }
            
            System.out.println(veces);
        }
    }
    
}