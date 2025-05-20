/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication154;

/**
 *
 * @author julia
 */
public class JavaApplication154 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
    } 
    public boolean ehNumeroPerfeito(int n) {
    if (n <= 1) {
        return false;
    }
    int soma = 0;
    for (int i = 1; i < n; i++) {
        if (n % i == 0) {
            soma += i;
        }
    }
    return soma == n;
        
        
    }
    
}
