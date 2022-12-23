import java.util.Scanner;

public class ej155 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(x < 0 || y < 0){
                break;
            }
            
            System.out.println((x*2)+(y*2));
        }
    }
    
}