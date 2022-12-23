import java.util.Scanner;

public class ej117 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < casos; i++) {
            String[] frase = sc.nextLine().split(" ");
            String nombre = frase[1];
            System.out.println("Hola, " + nombre + ".");
        }
    }

}