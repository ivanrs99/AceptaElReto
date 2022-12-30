import java.util.Scanner;

public class ej622 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int notas = sc.nextInt();
            if (notas == 0) {
                break;
            }

            int total = 0;
            for (int i = 0; i < notas; i++) {
                total += sc.nextInt();
            }

            int media = sc.nextInt();
            int notaNecesaria = (notas + 1) * media - total;
            
            if(notaNecesaria > 10 || notaNecesaria < 0){
                System.out.println("IMPOSIBLE");
            }else{
                System.out.println(notaNecesaria);
            }
        }
    }

}
