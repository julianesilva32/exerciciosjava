/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer8;

/**
 *
 * @author julia
 */
public class Exer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
public static int[] inverter(int[] array) {
        if (array == null) {
            return null;
        }

        int tamanho = array.length;
        int[] invertido = new int[tamanho];
        int i = 0;

        while (i < tamanho) {
            invertido[i] = array[tamanho - 1 - i];
            i++;
        }

        return invertido;

    }
    
}
