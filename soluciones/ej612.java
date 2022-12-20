import java.util.Scanner;

public class ej612 {

    static class Punto {

        int x, y;

        Punto(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int R = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int nCirculos = 0;
            Punto centro = new Punto(0, 0);
            Punto punto = new Punto(X, Y);
            while (true) {
                if (R >= Math.sqrt(Math.pow((centro.x - punto.x), 2) + Math.pow((centro.y - punto.y), 2))) {
                    nCirculos++;
                }
                if (R == 1) {
                    break;
                }
                if ((punto.y - centro.y == punto.x - centro.x) || (punto.y - centro.y == -punto.x + centro.x)) {
                    break;
                } else if ((punto.y - centro.y > punto.x - centro.x) && (punto.y - centro.y > -punto.x + centro.x)) {
                    centro.y += R;
                } else if ((punto.y - centro.y < punto.x - centro.x) && (punto.y - centro.y > -punto.x + centro.x)) {
                    centro.x += R;
                } else if ((punto.y - centro.y < punto.x - centro.x) && (punto.y - centro.y < -punto.x + centro.x)) {
                    centro.y -= R;
                } else {
                    centro.x -= R;
                }
                R = R / 2;
            }
            System.out.println(nCirculos);
        }
    }
}
