import java.util.Scanner;

public class ej355 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int anio = sc.nextInt();
            if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                System.out.println(29);
            } else {
                System.out.println(28);
            }
        }
    }

}