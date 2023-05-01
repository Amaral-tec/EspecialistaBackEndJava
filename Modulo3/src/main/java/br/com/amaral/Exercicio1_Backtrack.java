package br.com.amaral;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leandro.amaral
 *
 */
public class Exercicio1_Backtrack {
	
    public static void main(String[] args) {
        int[] S = {1, 2, 3};
        int n = 2;
        List<List<Integer>> subconjuntos = calcularSubconjuntos(S, n);
        for (List<Integer> subconjunto : subconjuntos) {
            System.out.println(subconjunto);
        }
    }

    public static List<List<Integer>> calcularSubconjuntos(int[] S, int n) {
        List<List<Integer>> subconjuntos = new ArrayList<>();
        backtrack(subconjuntos, new ArrayList<>(), S, 0, n);
        return subconjuntos;
    }

    private static void backtrack(List<List<Integer>> subconjuntos, List<Integer> subconjuntoAtual, int[] S, int indice, int n) {
        if (subconjuntoAtual.size() == n) {
            subconjuntos.add(new ArrayList<>(subconjuntoAtual));
            return;
        }
        for (int i = indice; i < S.length; i++) {
            subconjuntoAtual.add(S[i]);
            backtrack(subconjuntos, subconjuntoAtual, S, i + 1, n);
            subconjuntoAtual.remove(subconjuntoAtual.size() - 1);
        }
    }

}
