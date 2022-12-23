import java.util.Scanner;

public class ej600 {

    static int[][] matriz;
    static int F, C;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            F = sc.nextInt();
            C = sc.nextInt();

            if (F == 0 && C == 0) {
                break;
            }

            matriz = new int[F][C];
            for (int i = 0; i < F; i++) {
                for (int j = 0; j < C; j++) {
                    matriz[i][j] = sc.nextInt();
                }
            }

            boolean isPunto = false;
            for (int i = 0; i < F; i++) {
                for (int j = 0; j < C; j++) {
                    if (comprobarPunto(i, j)) {
                        isPunto = true;
                        break;
                    }
                }
                if (isPunto) {
                    break;
                }
            }

            if (isPunto) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean comprobarPunto(int fila, int col) {
        boolean check = false;

        for (int i = 0; i < C; i++) {
            check = matriz[fila][col] <= matriz[fila][i];
            if(!check) break;
        }

        if (check) {
            for (int i = 0; i < F; i++) {
                check = matriz[fila][col] >= matriz[i][col];
                if(!check) break;
            }
            if (check) return true;
        }
        
        for (int i = 0; i < C; i++) {
            check = matriz[fila][col] >= matriz[fila][i];
            if(!check) break;
        }

        if (check) {
            for (int i = 0; i < F; i++) {
                check = matriz[fila][col] <= matriz[i][col];
                if(!check) break;
            }
            if (check) return true;
        }

        return false;
    }
}
