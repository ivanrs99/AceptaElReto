import java.util.Scanner;

public class ej665 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            String version = sc.next();
            String[] split1 = version.split("\\.");
            version = sc.next();
            String[] split2 = version.split("\\.");
            
            if (Integer.parseInt(split2[0]) - 1 == Integer.parseInt(split1[0])) {
                if (split2[1].equals("0") && split2[2].equals("0")) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            } else if (Integer.parseInt(split2[1]) - 1 == Integer.parseInt(split1[1])) {
                if (split2[2].equals("0") && split2[0].equals(split1[0])) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            } else if (Integer.parseInt(split2[2]) - 1 == Integer.parseInt(split1[2])) {
                if (split2[0].equals(split1[0]) && split2[1].equals(split1[1])) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }

}