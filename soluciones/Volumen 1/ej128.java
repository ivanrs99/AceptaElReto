import java.util.Scanner;

public class ej128 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longVarilla = sc.nextInt();
        while (longVarilla != -1) {
            boolean print = true;
            int res = 0, varillas = 0, restanteUlt = 0;
            while (true) {
                int nervios = sc.nextInt();
                if (nervios == -1) {
                    break;
                }
                int segmentos = sc.nextInt();
                int longSeg = sc.nextInt();
                
                if (!print) {
                    continue;
                }
                if (longSeg > longVarilla) {
                    System.out.println("IMPOSIBLE");
                    print = false;
                    continue;
                }

                int cantidad = longVarilla / longSeg;
                int restante = longVarilla - cantidad * longSeg;
                int totalSegs = nervios * segmentos;

                if (restanteUlt > 0) {
                    if (restanteUlt / longSeg > 0) {
                        if (restanteUlt / longSeg >= totalSegs) {
                            restanteUlt -= totalSegs * longSeg;
                            totalSegs = 0;
                        } else {
                            totalSegs -= restanteUlt / longSeg;
                            res += restanteUlt % longSeg;
                            restanteUlt = 0;
                        }
                        if (totalSegs == 0) {
                            continue;
                        }
                    } else {
                        res += restanteUlt;
                        restanteUlt = 0;
                    }
                }

                int s = totalSegs / cantidad;
                if (totalSegs % cantidad == 0) {
                    restanteUlt = restante;
                } else {
                    restanteUlt = longVarilla - ((totalSegs - (s * cantidad)) * longSeg);
                    s++;
                }
                res += restante * (s - 1);
                varillas += s;
            }

            res += restanteUlt;
            if (print) {
                System.out.println(varillas + " " + res);
            }

            longVarilla = sc.nextInt();
        }
    }

}