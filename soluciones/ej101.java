import java.util.Scanner;

public class ej101 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] cuadrado;
        while (n != 0) {
            if (2 <= n && n <= 1024) {
                cuadrado = crearCuadrado(n);
                if(comprobarCM(cuadrado)){
                    if(comprobarEsoterico(cuadrado)) System.out.println("ESOTERICO");
                    else System.out.println("DIABOLICO");
                }else System.out.println("NO");
            }
            n = sc.nextInt();
        }
    }

    public static int[][] crearCuadrado(int n) {
        int[][] cuadrado = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cuadrado[i][j] = sc.nextInt();
            }
        }
        return cuadrado;
    }

    public static boolean comprobarCM(int[][] cuadrado) {
        int constante = 0;
        for (int i = 0; i < cuadrado[0].length; i++) {
            constante += cuadrado[0][i];
        }
        if (!comprobarFilas(cuadrado, constante)) return false;
        if (!comprobarColumnas(cuadrado, constante)) return false;
        if (!comprobarDiagonales(cuadrado, constante)) return false;

        return true;
    }

    public static boolean comprobarFilas(int[][] cuadrado, int constante) {
        for (int i = 0; i < cuadrado.length; i++) {
            int suma = 0;
            for (int j = 0; j < cuadrado[i].length; j++) {
                suma += cuadrado[i][j];
            }
            if (suma != constante) return false;
            suma = 0;
        }

        return true;
    }

    public static boolean comprobarColumnas(int[][] cuadrado, int constante) {
        for (int i = 0; i < cuadrado.length; i++) {
            int suma = 0;
            for (int j = 0; j < cuadrado[i].length; j++) {
                suma += cuadrado[j][i];
            }
            if (suma != constante) return false;
            suma = 0;
        }

        return true;
    }

    public static boolean comprobarDiagonales(int[][] cuadrado, int constante) {
        int diagonalPrincipal = 0, diagonalSecundaria = 0;
        for (int i = cuadrado.length-1, j = 0; i >= 0; i--, j++) {
            diagonalPrincipal += cuadrado[j][j];
            diagonalSecundaria += cuadrado[i][j];
        }
        return (diagonalPrincipal == constante && diagonalSecundaria == constante);
    }
    
    public static boolean comprobarEsoterico(int[][] cuadrado){
        int constante = 0;
        for (int i = 0; i < cuadrado[0].length; i++) {
            constante += cuadrado[0][i];
        }
        int constante2 = (4*constante)/cuadrado.length;
        if(!comprobarCasillas(cuadrado)) return false;
        if(!comprobarEsquinas(cuadrado, constante2)) return false;
        if(!comprobarCentro(cuadrado, constante2)) return false;
        if(!comprobarLados(cuadrado, constante2)) return false;
        
        return true;
    }
    
    public static boolean comprobarCasillas(int[][] cuadrado){
        int n2 = cuadrado.length * cuadrado.length;
        for (int i = 1; i <= n2; i++) {
            boolean finded = false;            
            for (int j = 0; j < cuadrado.length; j++) {
                for (int k = 0; k < cuadrado[0].length; k++) {
                    if(cuadrado[j][k] == i) finded = true;
                }
            }
            if(!finded) return false;
        }
        
        return true;
    }
    
    public static boolean comprobarEsquinas(int[][] cuadrado, int cm2){
        int ultimo = cuadrado.length-1;
        int suma = cuadrado[0][0] + cuadrado[0][ultimo] + cuadrado[ultimo][0] + cuadrado[ultimo][ultimo];
        
        return (suma == cm2);
    }
    
    public static boolean comprobarCentro(int[][] cuadrado, int cm2){
        int mitad = cuadrado.length/2;
        int resultado = 0;
        if(cuadrado.length%2==0){
            resultado = cuadrado[mitad][mitad] + cuadrado[mitad-1][mitad-1] + cuadrado[mitad-1][mitad] + cuadrado[mitad][mitad-1];
        }else resultado = cuadrado[mitad][mitad] * 4;
        
        return (resultado == cm2);
    }
    
    public static boolean comprobarLados(int[][] cuadrado, int cm2){
        int mitad = cuadrado.length/2;
        int ultimo = cuadrado.length-1;
        int resultado = 0;
        if(cuadrado.length%2==0){
            resultado = cuadrado[0][mitad-1] + cuadrado[0][mitad] + cuadrado[mitad-1][0] + cuadrado[mitad][0] 
                    + cuadrado[mitad-1][ultimo] + cuadrado[mitad][ultimo] + cuadrado[ultimo][mitad-1] + cuadrado[ultimo][mitad];
            if(resultado != (2*cm2)) return false;
        }else{
            resultado = cuadrado[0][mitad] + cuadrado[mitad][0] + cuadrado[mitad][ultimo] + + cuadrado[ultimo][mitad];
            if(resultado != cm2) return false;
        }
        
        return true;
    }
}