/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

/**
 *
 * @author julia
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 

    public static boolean ehPalindromo(String texto) {
       if (texto == null) {
            return false;
        }

        int tamanho = texto.length();
        char[] limpo = new char[tamanho];
        int j = 0;
        int i = 0;

        while (i < tamanho) {
            char c = texto.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
            }
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                limpo[j] = c;
                j++;
            }
            i++;
        }

        int esquerda = 0;
        int direita = j - 1;

        while (esquerda < direita) {
            if (limpo[esquerda] != limpo[direita]) {
                return false;
            }
            esquerda++;
            direita--;
        }

        return true;
    }

    public static void main(String[] args) {
        String texto = "A man a plan a canal Panama";
        boolean resultado = ehPalindromo(texto);
        System.out.println(resultado);
    }

    }
    

