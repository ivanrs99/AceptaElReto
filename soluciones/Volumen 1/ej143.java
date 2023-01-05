import java.util.ArrayList;
import java.util.Scanner;

public class ej143 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int tortita = sc.nextInt();
            ArrayList<Integer> tortitas = new ArrayList<>();

            while (tortita != -1) {
                tortitas.add(0, tortita);
                tortita = sc.nextInt();
            }

            int numMovs = sc.nextInt();
            if (tortitas.isEmpty()) {
                break;
            }

            for (int i = 0; i < numMovs; i++) {
                int mov = sc.nextInt();
                int restMovs = mov / 2;
                int toReplace = 0;
                while (restMovs > 0) {
                    int aux = tortitas.get(mov - 1);
                    tortitas.set(mov - 1, tortitas.get(toReplace));
                    tortitas.set(toReplace, aux);
                    mov--;
                    toReplace++;
                    restMovs--;
                }
            }

            System.out.println(tortitas.get(0));
        }
    }

}