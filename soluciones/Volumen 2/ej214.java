import java.util.HashMap;
import java.util.Scanner;

public class ej214 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> numReyes = new HashMap<>();
        while (true) {
            int cantidad = sc.nextInt();
            if (cantidad == 0) {
                break;
            }

            numReyes.clear();
            for (int i = 0; i < cantidad; i++) {
                String rey = sc.next();
                if (!numReyes.containsKey(rey)) {
                    numReyes.put(rey, 1);
                } else {
                    numReyes.put(rey, numReyes.get(rey) + 1);
                }
            }

            int sucesores = sc.nextInt();
            for (int i = 0; i < sucesores; i++) {
                String rey = sc.next();
                if (!numReyes.containsKey(rey)) {
                    System.out.println("1");
                    numReyes.put(rey, 1);
                } else {
                    numReyes.put(rey, numReyes.get(rey) + 1);
                    System.out.println(numReyes.get(rey));
                }
            }
            System.out.println("");
        }
    }

}
