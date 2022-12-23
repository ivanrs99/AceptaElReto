import java.util.Scanner;

public class ej116 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0 && n <= 5) {
            System.out.println("Hola mundo.");
            n--;
        }
    }
}