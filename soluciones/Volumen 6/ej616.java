import java.util.Scanner;

public class ej616 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int puntos1 = 0;
            int puntos2 = 0;
            int dirPelota = 2;
            for (int i = 0; i < n; i++) {
                String sonido = sc.next();
                if (sonido.equals("PIC")) {
                    dirPelota = dirPelota == 1 ? 2 : 1;
                } else if (sonido.equals("PONG!")) {
                    if (dirPelota == 1) {
                        puntos2++;
                    } else {
                        puntos1++;
                    }                    
                }
            }

            System.out.println(puntos1 + " " + puntos2);
        }
    }

}