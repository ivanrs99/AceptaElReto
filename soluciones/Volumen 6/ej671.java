import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ej671 {

    static enum TipoEvento {
        ENTRADA, SALIDA
    }

    static class Evento implements Comparable<Evento> {

        TipoEvento tipo;
        int instante;

        public Evento(TipoEvento tipo, int instante) {
            this.tipo = tipo;
            this.instante = instante;
        }

        @Override
        public int compareTo(Evento o) {
            if (this.instante < o.instante) {
                return -1;
            } else if (this.instante > o.instante) {
                return 1;
            } else {
                return o.tipo.compareTo(this.tipo);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            ArrayList<Evento> eventos = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                eventos.add(new Evento(TipoEvento.ENTRADA, sc.nextInt()));
                eventos.add(new Evento(TipoEvento.SALIDA, sc.nextInt()));
            }

            Collections.sort(eventos);
            int maxSillas = 0;
            int sillas = 0;
            int[] tiempos = new int[n + 1];
            int ult = 0;
            for (int i = 0; i < eventos.size(); i++) {
                tiempos[sillas] += eventos.get(i).instante - ult;
                ult = eventos.get(i).instante;
                if (eventos.get(i).tipo == TipoEvento.ENTRADA) {
                    sillas++;
                } else {
                    sillas--;
                }

                if (sillas > maxSillas) {
                    maxSillas = sillas;
                }
            }

            System.out.println(maxSillas + " " + tiempos[maxSillas]);
        }
    }
}