import java.util.Scanner;

public class ej400 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String linea = sc.nextLine();
            int distancia = -1, max = -1, ocupada = -1;
            for (int i = 0; i < linea.length(); i++) {
                if (linea.charAt(i) == '.') {
                    distancia++;
                } else {
                    distancia = -1;
                    ocupada = i;
                }

                if (ocupada < 0) {
                    max = distancia;
                } else if (i == linea.length() - 1 && linea.charAt(i) == '.' && distancia > max) {
                    max = distancia;
                } else {
                    max = (distancia / 2) > max ? distancia / 2 : max;
                }
            }

            System.out.println(max);
        }
    }
}
