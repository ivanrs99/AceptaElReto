import java.util.ArrayList;
import java.util.Scanner;

public class ej127 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            ArrayList<String> nombres = new ArrayList<>();
            String nombre = sc.next();
            while (!nombre.equals("F")) {
                nombres.add(nombre);
                nombre = sc.next();
            }
            int camas = sc.nextInt();
            int palabras = sc.nextInt();

            if (camas == 0) {
                System.out.println("NADIE TIENE CAMA");
            } else if (camas >= nombres.size()) {
                System.out.println("TODOS TIENEN CAMA");
            } else {
                int pos = -1, palabrasRestantes = palabras;
                while (camas < nombres.size()) {
                    while (palabrasRestantes > 0) {
                        palabrasRestantes--;
                        pos++;
                        if (pos == nombres.size()) {
                            pos = 0;
                        }
                    }
                    nombres.remove(pos);
                    pos--;
                    palabrasRestantes = palabras;
                }

                for (int j = 0; j < nombres.size(); j++) {
                    if (j < nombres.size() - 1) {
                        System.out.print(nombres.get(j) + " ");
                    } else {
                        System.out.println(nombres.get(j));
                    }
                }
            }
        }
    }

}