import java.util.Scanner;

public class ej149 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int masVeloz = 0;
            for (int i = 0; i < n; i++) {
                int toro = sc.nextInt();
                if(masVeloz < toro)
                    masVeloz = toro;
            }
            System.out.println(masVeloz);
        }
    }
    
}
