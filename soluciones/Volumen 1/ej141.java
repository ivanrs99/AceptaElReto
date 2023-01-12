import java.util.Scanner;

public class ej141 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String linea = sc.nextLine();
            System.out.println(isBalanceado(linea) ? "YES" : "NO");
        }
    }

    public static boolean isBalanceado(String linea) {
        StringBuilder balanceador = new StringBuilder();
        for (int i = 0; i < linea.length(); i++) {
            switch (linea.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    balanceador.append(linea.charAt(i));
                    break;
                case ')':
                    if (balanceador.length() != 0 && balanceador.charAt(balanceador.length() - 1) == '(') {
                        balanceador.deleteCharAt(balanceador.length() - 1);
                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if (balanceador.length() != 0 && balanceador.charAt(balanceador.length() - 1) == '{') {
                        balanceador.deleteCharAt(balanceador.length() - 1);
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if (balanceador.length() != 0 && balanceador.charAt(balanceador.length() - 1) == '[') {
                        balanceador.deleteCharAt(balanceador.length() - 1);
                    } else {
                        return false;
                    }
                    break;
            }
        }

        return balanceador.length() == 0;
    }
}