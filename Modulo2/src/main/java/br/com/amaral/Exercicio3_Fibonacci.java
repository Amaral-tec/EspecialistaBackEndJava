/**
 * 
 */
package br.com.amaral;

/**
 * @author leandro.amaral
 *
 */
public class Exercicio3_Fibonacci {

	// Notação BigO: O(2^n)
	/**
	 * A cada chamada recursiva, o algoritmo realiza duas chamadas recursivas
	 * adicionais, o que resulta em uma árvore de chamadas recursivas exponencial
	 */
	public static int findElement(int elementNumber) {
		if (elementNumber <= 1) {
			return elementNumber;
		}
		return findElement(elementNumber - 1) + findElement(elementNumber - 2);
	}

	public static void main(String[] args) {

		int elementNumber = 30;

		System.out.println("Elemento " + elementNumber + ": " + findElement(elementNumber));
	}
}
