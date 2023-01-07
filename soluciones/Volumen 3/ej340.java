import java.util.Scanner;

public class ej340 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int horizontal = sc.nextInt();
            int vertical = sc.nextInt();

            int sumVertical = (horizontal + 1) * vertical;
            int sumHorizontal = (vertical + 1) * horizontal;
            System.out.println(sumVertical + sumHorizontal);
        }
    }

}
