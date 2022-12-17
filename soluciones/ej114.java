import java.util.Scanner;

public class ej114 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int n = sc.nextInt();
            if (n > 4) {
                System.out.println(0);
            } else if (n == 4) {
                System.out.println(4);
            } else if (n == 3) {
                System.out.println(6);
            } else if (n == 2) {
                System.out.println(2);
            } else if (n == 1 || n == 0) {
                System.out.println(1);
            }
        }
    }
}