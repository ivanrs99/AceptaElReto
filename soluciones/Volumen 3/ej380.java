import java.util.Scanner;

public class ej380 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int total = 0;
            for (int i = 0; i < n; i++) {
                total += sc.nextInt();
            }
            System.out.println(total);
        }
    }

}
