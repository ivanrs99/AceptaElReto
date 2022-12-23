import java.util.Scanner;

public class ej115 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int cuadrado = n * n;
            int d = 1, izq = cuadrado, der;
            boolean esNum = false;
            for (int i = 0; i < String.valueOf(cuadrado).length(); i++) {
                der = cuadrado % (10 * d);
                izq /= 10;
                if (der > 0 && der + izq == n){
                    esNum = true;
                    break;
                }
                d *= 10;
            }            
            
            if(esNum){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    }
}