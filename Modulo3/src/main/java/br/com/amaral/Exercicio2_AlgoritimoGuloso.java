package br.com.amaral;

import java.util.Arrays;

/**
 * @author leandro.amaral
 *
 */
public class Exercicio2_AlgoritimoGuloso {

    public static void main(String[] args) {
        int quantia = 18;
        int[] moedas = {5, 2, 1};
        int[] resultado = calcularTroco(quantia, moedas);
        System.out.println(Arrays.toString(resultado));
    }

    public static int[] calcularTroco(int quantia, int[] moedas) {
        Arrays.sort(moedas);
        int[] resultado = new int[moedas.length];
        int i = moedas.length - 1;
        while (quantia > 0) {
            if (moedas[i] <= quantia) {
                quantia -= moedas[i];
                resultado[i]++;
            } else {
                i--;
            }
        }
        return resultado;
    }
}
