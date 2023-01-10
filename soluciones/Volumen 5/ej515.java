import java.util.Scanner;

public class ej515 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int copas = sc.nextInt();
            if (copas == 0) {
                break;
            }

            int total = 0;
            boolean turno = false;
            while (copas > 0) {
                if (!turno || copas % 2 != 0) {
                    copas--;
                } else if(copas % 2 == 0){
                    copas -= 2;
                }

                turno = !turno;                
                total++;
            }
            
            System.out.println(total);
        }
    }

}
