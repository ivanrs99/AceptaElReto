import java.util.Scanner;

public class ej124 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String[] nums = sc.nextLine().split(" ");
            String num1 = nums[0];
            String num2 = nums[1];

            if (num1.equals("0") && num2.equals("0")) {
                break;
            }
            
            int diff = Math.abs(num1.length() - num2.length());
            if (num1.length() < num2.length()) {
                for (int i = 0; i < diff; i++) {
                    num1 = 0 + num1;
                }
            } else {
                for (int i = 0; i < diff; i++) {
                    num2 = 0 + num2;
                }
            }
            
            int acarreos = 0;
            int actualAcarreo = 0;
            for (int i = num1.length()-1; i >= 0; i--) {
                if (Integer.parseInt(num1.charAt(i)+"") + Integer.parseInt(num2.charAt(i)+"") + actualAcarreo >= 10) {
                    acarreos++;
                    actualAcarreo = 1;
                }else{
                    actualAcarreo = 0;
                }
            }
            
            System.out.println(acarreos);
        }
    }
}