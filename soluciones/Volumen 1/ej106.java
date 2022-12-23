import java.util.Scanner;

public class ej106 {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true) {
            String codigo = sc.nextLine();
            if (codigo.equals("0")) {
                break;
            }
            if ((codigo.length() < 14)) {
                boolean comp = comprobarDigito(codigo);
                if (comp) {
                    if (codigo.length() > 8 && codigo.length() < 14) {
                        if (codigo.length() < 13) {
                            System.out.println("SI EEUU");
                        } else {
                            System.out.println("SI " + comprobarPais(codigo));
                        }
                    } else {
                        System.out.println("SI");
                    }
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean comprobarDigito(String codigo) {
        int digitoControl = Integer.parseInt(codigo.charAt(codigo.length() - 1) + "");
        int posicion = 1, suma = 0, numDigitos = 0;
        for (int i = codigo.length() - 2; i >= 0; i--) {
            int n = Integer.parseInt(codigo.charAt(i) + "");
            if (posicion % 2 != 0) {
                suma += n * 3;
            } else {
                suma += n;
            }
            posicion++;
        }

        while (suma % 10 != 0) {
            suma += 1;
            numDigitos += 1;
        }

        return numDigitos == digitoControl;
    }

    public static String comprobarPais(String codigo) {
        codigo = codigo.substring(0, 3);
        if (codigo.equals("380")) {
            return "Bulgaria";
        } else if (codigo.equals("539")) {
            return "Irlanda";
        } else if (codigo.equals("560")) {
            return "Portugal";
        } else if (codigo.equals("759")) {
            return "Venezuela";
        } else if (codigo.equals("850")) {
            return "Cuba";
        } else if (codigo.equals("890")) {
            return "India";
        } else {
            codigo = codigo.substring(0, 2);
            if (codigo.equals("70")) {
                return "Noruega";
            } else if (codigo.equals("50")) {
                return "Inglaterra";
            } else if (codigo.charAt(0) == '0') {
                return "EEUU";
            }
        }
        return "Desconocido";
    }
}
