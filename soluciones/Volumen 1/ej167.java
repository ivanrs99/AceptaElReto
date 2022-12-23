import java.util.Scanner;

public class ej167 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(calcular(n));
        }
    }

    public static int calcular(int n) {
        if (n == 1) {
            return 4;
        }

        return (4 * n) + calcular(n / 2) * 4;
    }
}
