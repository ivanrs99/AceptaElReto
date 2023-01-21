import java.util.Scanner;

public class ej456 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            double n = sc.nextInt();
            double m = sc.nextInt();
            double r = sc.nextInt();
            double tabletas = Math.ceil(r / (n * m));
            System.out.println((int) tabletas);
        }
    }

}