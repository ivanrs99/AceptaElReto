package ej100_110;

import java.util.Arrays;
import java.util.Scanner;

public class ej107 {

    static Scanner sc = new Scanner(System.in);
    static final int tamMax = 100000;
    static int[] pi = new int[tamMax + 1];
    static boolean[] primo = new boolean[tamMax + 1];

    public static void main(String[] args) {
        Arrays.fill(pi, 0);
        Arrays.fill(primo, true);
        primo[0] = false;
        primo[1] = false;
        calcularNumsPrimos();
        
        while (true) {
            String caso = sc.nextLine();
            if (caso.equals("0 0")) {
                break;
            }
            String[] numeros = caso.split(" ");
            int n = Integer.parseInt(numeros[0]);
            int m = Integer.parseInt(numeros[1]);
            if ((n >= 0 && n < 100000) && (m >= 0 && m <= 5)) {
                double errorAbs = calcularErrorAbsoluto(n);
                double errorMax = calcularErrorMaximo(m, n);
                if (errorAbs > errorMax) {
                    System.out.println("Mayor");
                } else if (errorAbs == errorMax) {
                    System.out.println("Igual");
                } else {
                    System.out.println("Menor");
                }
            }
        }
    }

    public static double calcularErrorAbsoluto(int n) {
        return Math.abs(pi[n] * Math.log(n) - n);
    }

    public static double calcularErrorMaximo(int m, int n) {
        return (n * Math.log(n) * Math.pow(10, -m));
    }

    public static void calcularNumsPrimos() {
        for (int i = 2; i <= Math.sqrt(tamMax); ++i) {
            for (int j = i; j <= tamMax / i; ++j) {
                primo[i * j] = false;
            }
        }

        int numPrimos = 0;
        for (int i = 0; i <= tamMax; ++i) {
            if (primo[i]) {
                numPrimos++;
            }
            pi[i] = numPrimos;
        }
    }
}
