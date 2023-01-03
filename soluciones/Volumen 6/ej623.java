import java.util.Scanner;

public class ej623 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            String premiado = sc.next();
            String boleto = sc.next();
            boolean correcto = true;
            for (int j = 0; j < 7; j++) {
                if (boleto.contains(premiado.charAt(j) + "")) {
                    boleto = boleto.replaceFirst(premiado.charAt(j) + "", "");
                } else {
                    correcto = false;
                    break;
                }
            }

            if (correcto) {
                System.out.println("GANA");
            } else {
                System.out.println("PIERDE");
            }
        }
    }
}
