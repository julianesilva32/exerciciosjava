/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author julia
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        public static int calcularFatorial(int n) {
        if (n < 0) {
            return -1;
        }

        int resultado = 1;
        int i = 1;

        while (i <= n) {
            resultado = resultado * i;
            i++;
        }

        return resultado;
    }

    public static void main(String[] args) {
        int numero = 5;
        int fatorial = calcularFatorial(numero);
        System.out.println(fatorial);

    }
    
}
