import java.util.Scanner;

public class ej200 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n < 0) {
                break;
            }

            print(n, 0);
            System.out.println("====");
        }
    }

    static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fib(n - 2) + fib(n - 1);
    }

    static void print(int n, int nivel) {
        String tab = "   ";
        String espacio = "";
        for (int i = 0; i < nivel; i++) {
            espacio += tab;
        }

        if (n == 0 || n == 1) {
            System.out.println(espacio + n);
            return;
        }

        System.out.println(espacio + fib(n));
        print(n - 2, nivel + 1);
        print(n - 1, nivel + 1);
    }
}