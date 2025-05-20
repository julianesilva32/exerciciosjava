/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author julia
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
    }public static String substituirVogais(String entrada) {
        if (entrada == null) {
            return null;
        }

        char[] resultado = new char[entrada.length()];
        int i = 0;
        while (i < entrada.length()) {
            char c = entrada.charAt(i);
            if (c == 'a' || c == 'A' ||
                c == 'e' || c == 'E' ||
                c == 'i' || c == 'I' ||
                c == 'o' || c == 'O' ||
                c == 'u' || c == 'U') {
                resultado[i] = '*';
            } else {
                resultado[i] = c;
            }
            i++;
        }

        String saida = "";
        i = 0;
        while (i < resultado.length) {
            saida += resultado[i];
            i++;
        }

        return saida;
    }

    public static void mai(String[] args) {
     String texto = "Frase de exemplo com Vogais";
        String modificado = substituirVogais(texto);
        System.out.println(modificado);

    }
    
}
