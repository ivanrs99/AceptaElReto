import java.util.Scanner;

public class ej407 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int c = sc.nextInt();
            int p = sc.nextInt();
            int t = sc.nextInt();

            if (c == 0 && p == 0 && t == 0) {
                break;
            }

            int dif = c - p;
            if (dif < t) {
                System.out.println(c - (t - dif));
            } else {
                System.out.println(p + t);
            }
        }
    }

}