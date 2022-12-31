import java.util.Scanner;

public class ej667 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String año = sc.nextInt()+"";
            if(año.equals("0")) break;
            
            int[] pipos = new int[10];
            for (int i = 0; i < 10; i++) {
                int n = sc.nextInt();
                pipos[i] = n;
            }
            
            int personas = Integer.MAX_VALUE;
            for (int i = 0; i < 4; i++) {
                int total = 1;
                for (int j = 0; j < 4; j++) {
                    if(j != i && año.charAt(i) == año.charAt(j)){
                        total++;
                    }
                }
                int max = pipos[Integer.parseInt(año.charAt(i)+"")]/(total*3);
                if(personas > max) personas = max;
            }
            
            System.out.println(personas);
        }
    }
    
}