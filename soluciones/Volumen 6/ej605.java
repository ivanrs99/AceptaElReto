import java.util.Scanner;

public class ej605 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int totalV = 0, totalI = 0;
            String first = sc.next();
            if (first.equals(".")) {
                break;
            }

            while (!first.equals(".")) {
                if (first.equals("V")) {
                    totalV++;
                } else if (first.equals("I")) {
                    totalI++;
                } else {
                    totalV++;
                    totalI++;
                }
                
                first = sc.next();
            }

            if (totalV > totalI) {
                System.out.println("VERANO");
            } else if (totalI > totalV) {
                System.out.println("INVIERNO");
            } else {
                System.out.println("EMPATE");
            }
        }
    }

}