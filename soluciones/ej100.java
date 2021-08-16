package ej100_110;

import java.util.Arrays;
import java.util.Scanner;

public class ej100 {
    public static int KAPREKAR = 6174;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            char[] numero = sc.next().toCharArray();
            if (Integer.parseInt(new String(numero)) == KAPREKAR) {
                System.out.println(0);
                continue;
            }
            System.out.println(calcularKaprekar(numero));
        }
    }

    public static int calcularKaprekar(char[] numero) {
        int iteracion = 0;
        String n = new String(numero);
        while (!n.equals("6174") && iteracion <= 7) {
            while (n.length() < 4) {
                n = "0" + n;
            }
            int mayor = getMayor(n);
            int menor = getMenor(n);
            n = (mayor - menor) + "";            
            iteracion++;
        }

        return iteracion;
    }

    public static int getMayor(String numero) {
        char[] arrNumeros = numero.toCharArray();
        Arrays.sort(arrNumeros);
        String nuevoNumero = "";
        for (int i = arrNumeros.length - 1; i >= 0; i--) {
            nuevoNumero += arrNumeros[i];
        }
        return Integer.parseInt(nuevoNumero);
    }

    public static int getMenor(String numero) {
        char[] arrNumeros = numero.toCharArray();
        Arrays.sort(arrNumeros);
        String nuevoNumero = new String(arrNumeros);
        return Integer.parseInt(nuevoNumero);
    }
}
