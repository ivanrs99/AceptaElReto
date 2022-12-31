import java.util.Scanner;

public class ej663 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int n = sc.nextInt();
            if (n > 0) {
                System.out.println(n - 1);
            } else {
                System.out.println(n);
            }
        }
    }

}