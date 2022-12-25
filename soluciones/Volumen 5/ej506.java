import java.util.Scanner;

public class ej506 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < casos; i++) {
            String[] nums = sc.nextLine().split("/");
            int maxima = Integer.parseInt(nums[0].trim());
            int minima = Integer.parseInt(nums[1].trim());
            if (maxima >= minima) {
                System.out.println("BIEN");
            } else {
                System.out.println("MAL");
            }
        }
    }

}