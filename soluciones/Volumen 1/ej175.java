import java.util.Scanner;

public class ej175 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(sc.nextLine());
        String dias = "LMXJVSD";
        for (int i = 0; i < casos; i++) {
            int semanas = Integer.parseInt(sc.nextLine());
            int[] blister = new int[7];
            for (int j = 0; j < semanas; j++) {
                String linea = sc.nextLine();
                for (int k = 0; k < linea.length(); k++) {
                    if (linea.charAt(k) == '*') {
                        blister[k]++;
                    }
                }
            }

            int posMin = 0, min = Integer.MAX_VALUE;
            for (int j = 0; j < blister.length; j++) {
                if (blister[j] < min) {
                    posMin = j;
                    min = blister[j];
                }
            }

            System.out.println(dias.charAt(posMin) + " " + (min + 1));
        }
    }

}