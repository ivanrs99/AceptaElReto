import java.util.Scanner;

public class ej151 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int filas = sc.nextInt();
            if (filas == 0) {
                break;
            }

            boolean identidad;
            int fail = 0;
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < filas; j++) {
                    int n = sc.nextInt();
                    if(i == j){
                        identidad = n == 1;
                    }else{
                        identidad = n == 0;
                    }
                    
                    if(!identidad){
                        fail++;
                    }
                }
            }
            
            if (fail > 0) {
                System.out.println("NO");
            } else {
                System.out.println("SI");
            }
        }
    }

}