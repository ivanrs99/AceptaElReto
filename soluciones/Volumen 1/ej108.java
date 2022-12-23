import java.util.Scanner;

public class ej108 {

    static Scanner sc = new Scanner(System.in);
    static String[] categorias = {"DESAYUNOS", "COMIDAS", "MERIENDAS", "CENAS", "COPAS"};
    static double[] values = {0, 0, 0, 0, 0};

    public static void main(String[] args) {
        double suma = 0, numVentas = 0, numComidas = 0;
        while (sc.hasNext()) {
            String[] v = sc.nextLine().split(" ");
            if (v[0].equals("N") && v[1].equals("0")) {
                double maxValue = values[0], minValue = values[0];
                int maxKey = 0, minKey = 0;
                boolean maxEmpate = false, minEmpate = false;

                for (int i = 1; i < 5; i++) {
                    if (values[i] > maxValue) {
                        maxValue = values[i];
                        maxKey = i;
                        maxEmpate = false;
                    } else if (values[i] == maxValue) {
                        maxEmpate = true;
                    }

                    if (values[i] < minValue) {
                        minValue = values[i];
                        minKey = i;
                        minEmpate = false;
                    } else if (values[i] == minValue) {
                        minEmpate = true;
                    }
                }

                String salida = "";
                if (maxEmpate) {
                    salida += "EMPATE#";
                } else {
                    salida += categorias[maxKey] + "#";
                }
                if (minEmpate) {
                    salida += "EMPATE#";
                } else {
                    salida += categorias[minKey] + "#";
                }
                if (values[1]/numComidas > (suma / numVentas)) {
                    salida += "SI";
                } else {
                    salida += "NO";
                }

                System.out.println(salida);

                for (int i = 0; i < 5; i++) {
                    values[i] = 0;
                }
                suma = 0;
                numVentas = 0;
                numComidas = 0;
            } else {
                switch (v[0]) {
                    case "D":
                        values[0] = values[0] + Double.parseDouble(v[1]);
                        suma += Double.parseDouble(v[1]);
                        numVentas++;
                        break;
                    case "A":
                        values[1] = values[1] + Double.parseDouble(v[1]);
                        suma += Double.parseDouble(v[1]);
                        numVentas++; numComidas++;
                        break;
                    case "M":
                        values[2] = values[2] + Double.parseDouble(v[1]);
                        suma += Double.parseDouble(v[1]);
                        numVentas++;
                        break;
                    case "I":
                        values[3] = values[3] + Double.parseDouble(v[1]);
                        suma += Double.parseDouble(v[1]);
                        numVentas++;
                        break;
                    case "C":
                        values[4] = values[4] + Double.parseDouble(v[1]);
                        suma += Double.parseDouble(v[1]);
                        numVentas++;
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
