import java.util.Scanner;

public class ej119 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            } else if (n < 4) {
                System.out.println(n * 5);
            } else {
                int nEscudos = 0;
                while (n > 0) {
                    if (n < 4) {
                        nEscudos += n * 5;
                        n = 0;
                    } else {
                        int cuadrado = (int) Math.sqrt(n);
                        int total = cuadrado * cuadrado;
                        n -= total;
                        nEscudos += ((cuadrado * 2)+((cuadrado-2)*2))*2 + 4; //exterior
                        nEscudos += (cuadrado-2)*(cuadrado-2); //interior
                    }
                }
                System.out.println(nEscudos);
            }
        }
    }

}