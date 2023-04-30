/**
 * 
 */
package br.com.amaral;

import java.util.HashMap;

// Explique as diferenças entre a solução do exercício 2 e a do exercício 3
/**
 * A abordagem Top-down começa com o problema geral e o divide em subproblemas
 * menores, enquanto a abordagem Bottom-up começa com os subproblemas menores e
 * os combina para resolver o problema geral.
 *
 */
public class Exercicio2_TopDown {

	private static HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

	public static int calcularFatorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		if (memo.containsKey(n)) {
			return memo.get(n);
		}

		int resultado = n * calcularFatorial(n - 1);
		memo.put(n, resultado);
		return resultado;
	}

	public static void main(String[] args) {
		int n = 3;

		if (n < 1 || n > 100) {
			System.out.println("Número inválido! O número deve ser entre 1 e 100.");
			return;
		}

		int resultado = calcularFatorial(n);
		System.out.println("O fatorial de " + n + " é " + resultado);
	}
}
