import java.util.Scanner;

public class ej500 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int N = sc.nextInt();
            int Q = sc.nextInt();
            if (N == 0 && Q == 0) {
                break;
            }

            int total = 0;
            for (int i = 1; i <= N; i++) {
                int aux = inverso(i) + i;
                if (aux >= Q && aux <= N) {
                    total++;
                }
            }

            System.out.println(N + " " + Q + " " + total);
        }
    }

    static int inverso(int num) {
        String n = num + "";
        for (int i = n.length(); i < 4; i++) {
            n = "0" + n;
        }

        StringBuilder inv = new StringBuilder(n);        
        return Integer.parseInt(inv.reverse().toString());
    }
}