import java.util.Scanner;

public class ej111 {

    static Scanner sc = new Scanner(System.in);
    static String[] subniveles = {"1s", "2s", "2p", "3s", "3p", "4s", "3d", "4p", "5s", "4d", "5p", "6s", "4f", "5d", "6p", "7s", "5f", "6d", "7p"};

    public static void main(String[] args) {
        while (true) {
            String elemento = sc.nextLine();
            if (elemento.equals("Exit")) {
                break;
            }
            int nAtomico = sc.nextInt();
            if (elemento.equals("Hidrógeno") || nAtomico == 0) {
                System.out.println("1s0");
            } else {
                if (elemento.length() <= 50 && 0 <= nAtomico && nAtomico <= 118) {
                    calcularDiagrama(nAtomico);
                }
            }
            sc.nextLine();
        }
    }

    public static void calcularDiagrama(int nAtomico) {
        for (int i = 0; i < subniveles.length; i++) {
            char letra = subniveles[i].charAt(1);
            int n = 0;
            switch (letra) {
                case 's':
                    if(nAtomico >= 2) n = 2;
                    else n = nAtomico;
                    break;
                case 'p':
                    if(nAtomico >= 6) n = 6;
                    else n = nAtomico;
                    break;
                case 'd':
                    if(nAtomico >= 10) n = 10;
                    else n = nAtomico;
                    break;
                case 'f':
                    if(nAtomico >= 14) n = 14;
                    else n = nAtomico;
                    break;
                default:
                    break;
            }
            nAtomico -= n;
            if(nAtomico == 0){
                System.out.println(subniveles[i] + n);
                break;
            }else{
                System.out.print(subniveles[i] + n + " ");
            }
        }
    }
}
