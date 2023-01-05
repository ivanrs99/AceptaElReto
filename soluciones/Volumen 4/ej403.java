import java.util.Scanner;

public class ej403 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int min = 90 * 45;
        int max = 120 * 90;
        for (int i = 0; i < casos; i++) {
            int superficie = sc.nextInt();
            int campos = sc.nextInt();
            if (superficie >= min * campos && superficie <= max * campos) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

}