import java.util.Scanner;

public class ej608 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            
            int total = 0;
            boolean activada = false;
            for (int i = 0; i < n; i++) {
                int temperatura = sc.nextInt();
                if(temperatura <= 4 && !activada){
                    activada = true;
                    total++;
                }
                if(temperatura > 6 && activada){
                    activada = false;
                }
            }
            System.out.println(total);
        }
    }
    
}
