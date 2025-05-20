/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author julia
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
         public static int maiorAbsoluto(int[] numeros) {
           
               if (numeros == null || numeros.length == 0) {
            return 0;
        }

        int maior = numeros[0] < 0 ? -numeros[0] : numeros[0];
        int i = 1;

        while (i < numeros.length) {
            int valor = numeros[i];
            if (valor < 0) {
                valor = -valor;
            }
            if (valor > maior) {
                maior = valor;
            }
            i++;
        }

        return maior;
    }

    public static void main2(String[] args) {
    }   int[] array = {-10, 5, -20, 15, 3};
        int resultado = maiorAbsoluto(array);
        System.out.println(resultado);

    private static class resultado {

        public resultado() {
        }
    }
    }

        
        
       
    

