import java.util.Scanner;

public class ej217 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            System.out.println(n % 2 == 0 ? "DERECHA" : "IZQUIERDA");
        }
    }

}