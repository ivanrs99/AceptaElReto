import java.util.Scanner;

public class ej102 {

    static Scanner sc = new Scanner(System.in);
    static String alfabeto = "abcdefghijklmnopqrstuvwxyz";
    static String listaVocales = "aeiouAEIOU";

    public static void main(String[] args) {
        int index = alfabeto.indexOf("p");
        while (true) {
            String frase = sc.nextLine();
            int diff = index - alfabeto.indexOf(frase.charAt(0));
            if (diff < 0) {
                diff = alfabeto.length() - ((-1) * diff);
            }
            String msjEncriptado = "";
            for (int i = 1; i < frase.length(); i++) {
                if (alfabeto.contains(frase.toLowerCase().charAt(i) + "")) {
                    char letra = encriptarLetra(frase.charAt(i), diff);
                    msjEncriptado += letra;
                }
            }
            if (msjEncriptado.equals("FIN")) {
                break;
            }
            calcularVocales(msjEncriptado);
        }
    }

    public static char encriptarLetra(char letra, int desplazamiento) {
        int index = alfabeto.indexOf(Character.toLowerCase(letra));
        index = (index + desplazamiento) % alfabeto.length();

        if (Character.isUpperCase(letra)) {
            return alfabeto.toUpperCase().charAt(index);
        }

        return alfabeto.charAt(index);
    }

    public static void calcularVocales(String msjEncriptado) {
        int vocales = 0;
        for (int i = 0; i < msjEncriptado.length(); i++) {
            char letra = msjEncriptado.charAt(i);
            if (listaVocales.contains(letra + "")) {
                vocales++;
            }
        }
        System.out.println(vocales);
    }
}
