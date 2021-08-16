package ej100_110;

import java.util.Scanner;

class Movil {
    int pi, di, pd, dd;
    Movil left, right;
    
    Movil(int pi, int di, int pd , int dd){
        this.pi = pi;
        this.di = di;
        this.pd = pd;
        this.dd = dd;
    }
}

public class ej104 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            Movil movil= new Movil(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            if(movil.pi == 0 && movil.di == 0 && movil.pd == 0 && movil.dd == 0)
                break;
            System.out.println( isBalanced(movil) ? "SI" : "NO" );
        }
    }
    
    public static boolean isBalanced(Movil movil){
        boolean balancedI = true;
        if(movil.pi == 0){
            movil.left = new Movil(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            balancedI = isBalanced(movil.left);
            movil.pi = movil.left.pi + movil.left.pd;
        }
        
        boolean balancedD = true;
        if(movil.pd == 0){
            movil.right = new Movil(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            balancedD = isBalanced(movil.right);
            movil.pd = movil.right.pi + movil.right.pd;
        }
        
        return balancedI && balancedD && (movil.pi*movil.di == movil.pd*movil.dd);
    }
}
