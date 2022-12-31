import java.util.Scanner;

public class ej666 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < casos; i++) {
            String l1 = sc.nextLine().toLowerCase();
            String l2 = sc.nextLine().toLowerCase();
            l1 = l1.replaceAll("[, ;.:]", "");
            l2 = l2.replaceAll("[, ;.:]", "");
            

            if (l1.equals(l2)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

}