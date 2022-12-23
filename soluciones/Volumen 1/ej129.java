import java.util.Scanner;

public class ej129 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // el ultimo valor de cada fila sería cuando metes el número en un led apagado. Por ejemplo: leds apagados, metes un 0 y hay 6 cambios
        int[][] cambios = {{0, 4, 3, 3, 4, 3, 2, 3, 1, 2, 6}, // 0
        {4, 0, 5, 3, 2, 5, 6, 1, 5, 4, 2}, // 1  
        {3, 5, 0, 2, 5, 4, 3, 4, 2, 3, 5}, // 2  
        {3, 3, 2, 0, 3, 2, 3, 2, 2, 1, 5}, // 3  
        {4, 2, 5, 3, 0, 3, 4, 3, 3, 2, 4}, // 4  
        {3, 5, 4, 2, 3, 0, 1, 4, 2, 1, 5}, // 5  
        {2, 6, 3, 3, 4, 1, 0, 5, 1, 2, 6}, // 6  
        {3, 1, 4, 2, 3, 4, 5, 0, 4, 3, 3}, // 7  
        {1, 5, 2, 2, 3, 2, 1, 4, 0, 1, 7}, // 8  
        {2, 4, 3, 1, 2, 1, 2, 3, 1, 0, 6} // 9
    };

        int ult = sc.nextInt();
        while (ult != -1) {
            int count = 1;
            int total = cambios[ult][10];
            int sig = sc.nextInt();
            
            while (sig != -1) {
                count++;
                total += cambios[ult][sig];
                ult = sig;
                sig = sc.nextInt();
            }


            total += cambios[ult][10];
            total *= count;

            System.out.println(total);
            ult = sc.nextInt();
        }
    }
}