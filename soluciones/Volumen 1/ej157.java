import java.util.Scanner;

public class ej157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int dia = sc.nextInt();
            int mes = sc.nextInt();
            int total = meses[mes - 1] - dia;
            for (int j = mes; j < 12; j++) {
                total += meses[j];
            }
            System.out.println(total);
        }
    }
}