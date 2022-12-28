import java.util.Scanner;

public class ej164 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int Ax = sc.nextInt();
            int Ay = sc.nextInt();
            int Bx = sc.nextInt();
            int By = sc.nextInt();

            if (Bx < Ax || By < Ay) {
                break;
            }

            System.out.println((Bx - Ax) * (By - Ay));
        }
    }

}