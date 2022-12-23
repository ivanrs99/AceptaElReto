import java.util.Scanner;

public class ej313 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int saldo = sc.nextInt();
            int cambio = sc.nextInt();
            System.out.println((saldo + cambio >= 0) ? "SI" : "NO");
        }
    }

}