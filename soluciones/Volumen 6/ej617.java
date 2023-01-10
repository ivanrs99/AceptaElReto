import java.util.Scanner;

public class ej617 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int n = sc.nextInt();
            String[] nombres = new String[n];
            for (int j = 0; j < n; j++) {
                nombres[j] = sc.next();
            }
            
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(nombres[k].charAt(j));
                }
            }
            System.out.println();
        }
    }
    
}
