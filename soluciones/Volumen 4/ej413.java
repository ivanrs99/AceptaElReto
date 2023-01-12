import java.util.Scanner;

public class ej413 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int ancho = sc.nextInt();
            int alto = sc.nextInt();
            int totalLosetas = ancho * alto;
            if (totalLosetas % 2 != 0) {
                System.out.println(totalLosetas / 2 + 1 + " " + totalLosetas / 2);
            } else {
                System.out.println(totalLosetas / 2 + " " + totalLosetas / 2);
            }
        }
    }

}