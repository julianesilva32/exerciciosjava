/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer9;

/**
 *
 * @author julia
 */
public class Exer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
public static double calcularPorcentagem(double total, double porcentagem) {
    return (total * porcentagem) / 100;
    }

    public static void main(String[] args) {
        double total = 200;
        double porcentagem = 15;
        double resultado = calcularPorcentagem(total, porcentagem);
        System.out.println(resultado);

    }
    
}
