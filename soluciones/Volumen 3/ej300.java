import java.util.Scanner;

public class ej300 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            String palabra = sc.next();
            if (palabra.contains("a") && palabra.contains("e") && palabra.contains("i") && palabra.contains("o") && palabra.contains("u")) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

}
