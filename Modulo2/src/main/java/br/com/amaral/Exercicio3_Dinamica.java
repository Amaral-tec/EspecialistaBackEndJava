package br.com.amaral;

//Por que a solução feita com programação dinâmica é melhor?
/**
* A programação dinâmica armazena em memória os valores calculados, enquando a 
* série de Fibonacci refaz todos os cálculos a cada requisição. Isso reduz o desempenho do sistema e 
* dependendo do valor do input, o sistema não consegue realizar o cálculo
*
*/

public class Exercicio3_Dinamica {
	private static final int MAX_ELEMENTS = 100;
	private static final long[] fibElements = new long[MAX_ELEMENTS];
	
	// Notação BigO: O(1^n)
		/**
		 * Cada elemento da sequência é calculado apenas uma vez e armazenado em um array para 
		 * reutilização posterior
		 */
	public static long findElementDP(int elementNumber) {
		for(int i = 0; i < MAX_ELEMENTS; i++) {
			fibElements[i] = -1;
		}
		return findElement(elementNumber);
	}
	
	public static long findElement(int elementNumber) {
		if (fibElements[elementNumber] == -1) {
			if (elementNumber <= 1) {
				fibElements[elementNumber] = elementNumber;
			} else {
				fibElements[elementNumber] = findElement(elementNumber -1) + findElement(elementNumber -2);
			}
		}
		
		return fibElements[elementNumber];
	}
	
	public static void main(String[] args) {
		System.out.println(findElementDP(50));
	}

}
