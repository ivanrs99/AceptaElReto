import java.util.Scanner;

public class Ej112 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double metros, velMax, segundos, velocidadMedia;
        
        while (true) {
            metros = sc.nextInt();
            velMax = sc.nextInt();
            segundos = sc.nextInt();

            if (metros == 0 && velMax == 0 && segundos == 0) {
                break;
            }

            if (metros <= 0 || velMax <= 0 || segundos <= 0) {
                System.out.println("ERROR");
            } else {
                velocidadMedia = (metros / 1000) / (segundos / 3600);
                if (velMax >= velocidadMedia) {
                    System.out.println("OK");
                } else if (velocidadMedia - velMax < velMax * 0.2) {
                    System.out.println("MULTA");
                } else {
                    System.out.println("PUNTOS");
                }
            }
        }
    }
}