import java.util.Scanner;

public class ej621 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int pagina = sc.nextInt();
            if (pagina % 2 == 0) {
                System.out.println(pagina + 1);
            } else {
                System.out.println(pagina - 1);
            }
        }
    }

}
