/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author julia
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void Exercicio4(String[] args) { 
        
        public static String stringComMaisVogais(String[] array) {
        
        if (array == null || array.length == 0) {
            return null;
        }

        String comMaisVogais = array[0];
        int maxVogais = contarVogais(array[0]);
        int i = 1;

        while (i < array.length) {
            int qtdVogais = contarVogais(array[i]);
            if (qtdVogais > maxVogais) {
                maxVogais = qtdVogais;
                comMaisVogais = array[i];
            }
            i++;
        }

        return comMaisVogais;
    }

    private static int contarVogais(String s) {
        if (s == null) {
            return 0;
        }

        int contador = 0;
        int i = 0;

        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'A' ||
                c == 'e' || c == 'E' ||
                c == 'i' || c == 'I' ||
                c == 'o' || c == 'O' ||
                c == 'u' || c == 'U') {
                contador++;
            }
            i++;
        }

        return contador;
    }

    public static  main(String[] args) {
        String[] palavras = {"teste", "exemplo", "vogais", "computador", "inteligencia"};
        String resultado = stringComMaisVogais(palavras);
        System.out.println(resultado);
    }
}






    
    

