import java.util.Scanner;

public class ej118 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int apuestaPilar = sc.nextInt();
            int apuestaMarco = sc.nextInt();
            int apuestaPedro = sc.nextInt();

            if (apuestaPilar < 0 || apuestaMarco < 0 || apuestaPedro < 0) {
                break;
            }

            if ((apuestaPilar == apuestaMarco && apuestaPilar == apuestaPedro) || (apuestaPilar < apuestaPedro && apuestaPedro < apuestaMarco)
                    || (apuestaMarco < apuestaPedro && apuestaPedro < apuestaPilar)) {
                System.out.println(0);
                continue;
            }

            double x, media;
            int apuesta;

            if (apuestaPilar == apuestaPedro || apuestaMarco == apuestaPedro) {
                if (apuestaPilar != apuestaPedro) {
                    apuesta = apuestaPilar;
                } else {
                    apuesta = apuestaMarco;
                }

                if (apuesta < apuestaPedro) {
                    x = apuesta * 3;
                    media = x / 3;
                    while (Math.abs(media - apuesta) <= Math.abs(apuestaPedro - media) && x >= 0) {
                        x++;
                        media = x / 3;
                    }
                } else {
                    x = apuesta * 3 - 64 - 64;
                    media = (64 + 64 + x) / 3;
                    while (Math.abs(apuesta - media) <= Math.abs(media - apuestaPedro) && x >= 0) {
                        x--;
                        media = (64 + 64 + x) / 3;
                    }
                }
                if (x > 64 || x < 0) {
                    System.out.println("I");
                } else {
                    System.out.println((int) x);
                }
                continue;
            }

            if (apuestaPedro < apuestaPilar && apuestaPedro < apuestaMarco) {
                if (apuestaPilar > apuestaMarco) {
                    apuesta = apuestaPilar;
                } else {
                    apuesta = apuestaMarco;
                }

                x = apuesta * 3 - 64 - 64;
                media = (64 + 64 + x) / 3;
                while (Math.abs(apuesta - media) <= Math.abs(media - apuestaPedro) && x >= 0) {
                    x--;
                    media = (64 + 64 + x) / 3;
                }
            } else {
                if (apuestaPilar > apuestaMarco) {
                    x = apuestaMarco * 3;
                    apuesta = apuestaMarco;
                } else {
                    x = apuestaPilar * 3;
                    apuesta = apuestaPilar;
                }

                media = x / 3;
                while (Math.abs(media - apuesta) <= Math.abs(apuestaPedro - media) && x >= 0) {
                    x++;
                    media = x / 3;
                }
            }
            if (x > 64 || x < 0) {
                System.out.println("I");
            } else {
                System.out.println((int) x);
            }
        }
    }
}
