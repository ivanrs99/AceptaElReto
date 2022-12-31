import java.util.Scanner;

public class ej664 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int menor = 800;
            for (int i = 0; i < n; i++) {
                int carriles = sc.nextInt();
                int menorCarril = 0;
                for (int j = 0; j < carriles; j++) {
                    int altura = sc.nextInt();
                    if (altura > menorCarril) {
                        menorCarril = altura;
                    }
                }
                if(menorCarril < menor) menor = menorCarril;
            }
            
            System.out.println(menor);
        }
    }

}
