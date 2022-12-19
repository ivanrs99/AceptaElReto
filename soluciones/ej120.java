import java.util.Scanner;

public class ej120 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (n == 0 && k == 0) {
                break;
            }

            int constante = (n * ((n * n) + (k - 1) + k)) / 2;
            System.out.println(constante);
        }
    }
}
