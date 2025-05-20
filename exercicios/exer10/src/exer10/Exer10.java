/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer10;

/**
 *
 * @author julia
 */
public class Exer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
          public static boolean isFibonacci(int n) {
        if (n < 0) return false;
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    private static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }
}

    
    

