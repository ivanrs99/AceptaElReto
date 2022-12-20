import java.util.Scanner;

public class ej148 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String hora = sc.nextLine();
            if (hora.equals("00:00")) {
                break;
            }

            String[] splitHora = hora.split(":");
            int horas = Integer.parseInt(splitHora[0]);
            int minutos = Integer.parseInt(splitHora[1]);

            int total = (24 - horas) * 60 - minutos;
            System.out.println(total);
        }
    }

}