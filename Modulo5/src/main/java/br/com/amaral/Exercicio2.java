package br.com.amaral;

/**
 * @author leandro.amaral
 *
 */
public class Exercicio2 {

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