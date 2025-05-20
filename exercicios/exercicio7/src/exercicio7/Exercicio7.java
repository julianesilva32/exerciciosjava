/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

/**
 *
 * @author julia
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a < 0 ? -a : a;
    }

    public static void main(String[] args) {
        int x = 48;
        int y = 18;
        int resultado = calcularMDC(x, y);
        System.out.println(resultado);

    }
    
}
