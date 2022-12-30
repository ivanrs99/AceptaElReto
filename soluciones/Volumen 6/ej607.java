import java.util.Scanner;

public class ej607 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int n = sc.nextInt();
            int total = 0;
            int lineasActuales = 1;
            while (n > lineasActuales) {
                lineasActuales *= 2;
                total++;
            }
            System.out.println(total);
        }
    }

}