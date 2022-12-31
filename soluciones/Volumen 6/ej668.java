import java.util.Scanner;

public class ej668 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            if (a == 0 && b == 0 && n == 0) {
                break;
            }

            n = n % 6;
            System.out.println(restanacci(n, a, b));
        }
    }

    public static int restanacci(int num, int a, int b) {
        if (num == 0) {
            return a;
        } else if (num == 1) {
            return b;
        }

        return restanacci(num - 1, a, b) - restanacci(num - 2, a, b);
    }
}