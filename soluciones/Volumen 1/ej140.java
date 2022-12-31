import java.util.Scanner;

public class ej140 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n < 0) {
                break;
            }

            String num = n + "";
            int total = 0;
            for (int i = 0; i < num.length(); i++) {
                total += Integer.parseInt(num.charAt(i) + "");
                if (i == num.length() - 1) {                    
                    System.out.println(num.charAt(i) + " = " + total);
                }else{
                    System.out.print(num.charAt(i) + " + ");
                }
            }
        }
    }

}