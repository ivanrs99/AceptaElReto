import java.util.Scanner;

public class ej113 {

    static Scanner sc;
    static int numSemaforos;
    static double metrosTotal;
    static Semaforo[] semaforos;

    static class Semaforo {

        int distancia, ciclo, cerrado, abierto;

        Semaforo(int cerrado, int abierto, int distancia) {
            this.cerrado = cerrado;
            this.abierto = abierto;
            this.distancia = distancia;
            ciclo = cerrado + abierto;
        }
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        while (entrada()) {
        }
    }

    public static boolean entrada() {
        int velMax, metros, cerrado, abierto;

        numSemaforos = sc.nextInt();
        velMax = sc.nextInt();

        if (numSemaforos == 0 && velMax == 0) {
            return false;
        }

        metrosTotal = 0;
        semaforos = new Semaforo[numSemaforos];

        for (int i = 0; i < numSemaforos; i++) {
            metros = sc.nextInt();
            cerrado = sc.nextInt();
            abierto = sc.nextInt();
            metrosTotal += metros;
            Semaforo semaforo = new Semaforo(cerrado, abierto, (int) metrosTotal);
            semaforos[i] = semaforo;

            if (semaforo.abierto == 0) {
                System.out.println("IMPOSIBLE");
                return true;
            }
        }

        double velocidad;
        int tiempoUltimo = ((int) metrosTotal / velMax) / semaforos[numSemaforos - 1].ciclo;
        if (tiempoUltimo != (metrosTotal / velMax) / semaforos[numSemaforos - 1].ciclo) {
            if (((int) metrosTotal / velMax) < semaforos[numSemaforos - 1].cerrado) {
                velocidad = metrosTotal / (double) (semaforos[numSemaforos - 1].ciclo * tiempoUltimo + semaforos[numSemaforos - 1].cerrado);
                if (velocidad < 0.1) {
                    System.out.println("IMPOSIBLE");
                    return true;
                }
                if (check(semaforos[numSemaforos - 1].cerrado)) {
                    System.out.println(semaforos[numSemaforos - 1].cerrado);
                    return true;
                }
            }
            tiempoUltimo++;
        }

        velocidad = 1;
        while (velocidad >= 0.1) {
            velocidad = metrosTotal / (double) (semaforos[numSemaforos - 1].ciclo * tiempoUltimo);
            if (velocidad < 0.1) {
                break;
            }
            if (check(semaforos[numSemaforos - 1].ciclo * tiempoUltimo)) {
                System.out.println(semaforos[numSemaforos - 1].ciclo * tiempoUltimo);
                return true;
            }
            velocidad = metrosTotal / (double) (semaforos[numSemaforos - 1].ciclo * tiempoUltimo + semaforos[numSemaforos - 1].cerrado);
            if (velocidad < 0.1) {
                break;
            }
            if (check(semaforos[numSemaforos - 1].ciclo * tiempoUltimo + semaforos[numSemaforos - 1].cerrado)) {
                System.out.println(semaforos[numSemaforos - 1].ciclo * tiempoUltimo + semaforos[numSemaforos - 1].cerrado);
                return true;
            }
            tiempoUltimo++;
        }

        System.out.println("IMPOSIBLE");
        return true;
    }

    public static boolean check(int tiempoHastaUltimo) {
        double tiempo;
        int cantCiclos;
        for (int i = 0; i < numSemaforos - 1; i++) {
            tiempo = tiempoHastaUltimo * (semaforos[i].distancia / metrosTotal);
            cantCiclos = ((int) tiempo) / semaforos[i].ciclo;
            tiempo -= cantCiclos * semaforos[i].ciclo;
            if (tiempo < (semaforos[i].cerrado - 0.01) && tiempo > 0.01) {
                return false;
            }
        }
        return true;
    }
}