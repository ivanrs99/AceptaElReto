import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ej109 {

    static Scanner sc = new Scanner(System.in);
    static List<String> equipos = new ArrayList<String>();
    static Map<String, Integer> puntos = new HashMap<String, Integer>();

    public static void main(String[] args) {
        while (true) {
            String categoria = sc.next();
            if (categoria.equals("FIN") || categoria.length() > 16) {
                break;
            } else {
                equipos.clear();
                puntos.clear();
                int numPartidos = 0;
                while (true) {
                    String local = sc.next();
                    if (local.equals("FIN") || local.length() > 16) {
                        break;
                    }
                    int setsLocal = sc.nextInt();
                    String visitante = sc.next();
                    if (visitante.length() > 16) {
                        break;
                    }
                    int setsVisitante = sc.nextInt();

                    if (!equipos.contains(local)) {
                        equipos.add(local);
                        puntos.put(local, 0);
                    }
                    if (!equipos.contains(visitante)) {
                        equipos.add(visitante);
                        puntos.put(visitante, 0);
                    }

                    if (setsLocal > setsVisitante) {
                        puntos.put(local, puntos.get(local) + 2);
                        puntos.put(visitante, puntos.get(visitante) + 1);
                    } else {
                        puntos.put(visitante, puntos.get(visitante) + 2);
                        puntos.put(local, puntos.get(local) + 1);
                    }
                    
                    numPartidos++;
                }

                String ganador = "";
                int maxPuntos = 0;
                boolean empate = false;
                for (int i = 0; i < equipos.size(); i++) {
                    int nPuntos = puntos.get(equipos.get(i));
                    if (maxPuntos < nPuntos) {
                        maxPuntos = nPuntos;
                        ganador = equipos.get(i);
                        empate = false;
                    } else if (maxPuntos == nPuntos) {
                        empate = true;
                    }
                }
                
                int noJugados = ((equipos.size()-1)*equipos.size()) - numPartidos;

                if (!empate) {
                    System.out.println(ganador + " " + noJugados);
                } else {
                    System.out.println("EMPATE " + noJugados);
                }
            }
        }
    }
}
