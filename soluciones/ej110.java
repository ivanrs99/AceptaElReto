import java.util.Scanner;

public class ej110 {

    static Scanner sc = new Scanner(System.in);
    static String vocales = "aeiou";
    static String alfabeto = "abcdefghijklmnñopqrstuvwxyz";

    public static void main(String[] args) {
        while (true) {
            int numVersos = sc.nextInt();
            if (numVersos == 0) {
                break;
            }
            String[] versos = new String[numVersos];
            sc.nextLine();
            for (int i = 0; i < numVersos; i++) {
                versos[i] = sc.nextLine();
            }
            String[] terminaciones = calcularTerminaciones(versos);
            comprobarEstrofa(terminaciones);
        }
    }

    public static String[] calcularTerminaciones(String[] versos) {
        String[] terminaciones = new String[versos.length];
        for (int i = 0; i < versos.length; i++) {
            String terminacion = "";
            int numVocales = 0;
            for (int j = versos[i].length() - 1; j >= 0; j--) {
                String letra = (versos[i].charAt(j) + "").toLowerCase();
                if (alfabeto.contains(letra)) {
                    terminacion = letra + terminacion;
                    if (vocales.contains(letra)) {
                        numVocales++;
                    }
                }
                if (numVocales == 2) {
                    break;
                }
            }
            terminaciones[i] = terminacion;
        }

        return terminaciones;
    }

    public static void comprobarEstrofa(String[] terminaciones) {
        switch (terminaciones.length) {
            case 2:
                if (terminaciones[0].equals(terminaciones[1])) {
                    System.out.println("PAREADO");
                } else {
                    System.out.println("DESCONOCIDO");
                }
                break;
            case 3:
                if (terminaciones[0].equals(terminaciones[2]) && !terminaciones[0].equals(terminaciones[1])) {
                    System.out.println("TERCETO");
                } else {
                    System.out.println("DESCONOCIDO");
                }
                break;
            case 4:
                if (terminaciones[0].equals(terminaciones[1]) && terminaciones[0].equals(terminaciones[2]) && terminaciones[0].equals(terminaciones[3])) {
                    System.out.println("CUADERNA VIA");
                } else if (terminaciones[0].equals(terminaciones[3]) && terminaciones[1].equals(terminaciones[2]) && !terminaciones[0].equals(terminaciones[1])) {
                    System.out.println("CUARTETO");
                } else if (terminaciones[0].equals(terminaciones[2]) && terminaciones[1].equals(terminaciones[3]) && !terminaciones[0].equals(terminaciones[1])) {
                    System.out.println("CUARTETA");
                } else if (comprobarSeguidilla(terminaciones)) {
                    System.out.println("SEGUIDILLA");
                } else {
                    System.out.println("DESCONOCIDO");
                }
                break;
            default:
                System.out.println("DESCONOCIDO");
                break;
        }
    }

    public static boolean comprobarSeguidilla(String[] terminaciones) {
        boolean esConsonante = false;
        for (int i = 0; i < terminaciones[1].length(); i++) {
            if (alfabeto.contains(terminaciones[1].charAt(i) + "") && !vocales.contains(terminaciones[1].charAt(i) + "")) {
                esConsonante = true;
            }
        }
        if (esConsonante) {
            if (terminaciones[1].equals(terminaciones[3])) {
                return false;
            }
        }

        for (int i = 0; i < terminaciones.length; i++) {
            String terminacion = "";
            for (int j = 0; j < terminaciones[i].length(); j++) {
                if (vocales.contains(terminaciones[i].charAt(j) + "")) {
                    terminacion = terminaciones[i].charAt(j) + terminacion;
                }
            }
            terminaciones[i] = terminacion;
        }

        return terminaciones[1].equals(terminaciones[3]) && !terminaciones[1].equals(terminaciones[0]) && !terminaciones[1].equals(terminaciones[2]) && !terminaciones[0].equals(terminaciones[2]);
    }
}
