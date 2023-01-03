import java.util.Scanner;

public class ej635 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            String n = sc.next();
            if (Integer.parseInt(n) < 100) {
                System.out.println(1);
            } else {
                if (n.substring(n.length() - 2).equals("00")) {
                    System.out.println(n.substring(0, n.length() - 2));
                } else {
                    System.out.println(Integer.parseInt(n) / 100 + 1);
                }
            }
        }
    }

}