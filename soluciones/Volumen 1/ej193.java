import java.util.Scanner;

public class ej193 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int aux = n;
            int cifra, inverso = 0;
            while (aux != 0) {
                cifra = aux % 10;
                inverso = (inverso * 10) + cifra;
                aux /= 10;
            }

            if (Integer.toString(n).length() != Integer.toString(inverso).length()) {
                System.out.println("NO");
            } else {
                int sum = n + inverso;
                aux = sum;
                boolean inv = true;
                while (aux != 0 && inv) {
                    cifra = aux % 10;
                    if (cifra % 2 == 0) {
                        inv = false;
                    }
                    aux /= 10;
                }

                if (inv) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

}
