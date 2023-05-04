/**
 * Classe que representa a resposta do Exercício 2 – Ainda sobre testes unitários
 */
package br.com.amaral;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author leandro.amaral
 *
 */
public class Exercicio2Test {

	@Test
    public void testFibonacci() {
        assertEquals(0, Exercicio2.findElement(0));
        assertEquals(1, Exercicio2.findElement(1));
        assertEquals(1, Exercicio2.findElement(2));
        assertEquals(2, Exercicio2.findElement(3));
	}
}
