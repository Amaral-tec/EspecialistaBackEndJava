/**
 * Classe que representa a resposta do Exercício 1 – Testes unitários
 */
package br.com.amaral;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercicio1Test {
	
	 @Test
	    public void testAdicionarHappyPath() {
	        Exercicio1 calculadora = new Exercicio1();
	        int resultado = calculadora.adicionar(2, 3);
	        assertEquals(5, resultado);
	    }
	    
	    @Test
	    public void testSubtrairHappyPath() {
	    	Exercicio1 calculadora = new Exercicio1();
	        int resultado = calculadora.subtrair(5, 3);
	        assertEquals(2, resultado);
	    }
	    
	    @Test
	    public void testMultiplicarHappyPath() {
	    	Exercicio1 calculadora = new Exercicio1();
	        int resultado = calculadora.multiplicar(2, 3);
	        assertEquals(6, resultado);
	    }
	    
	    @Test
	    public void testDividirHappyPath() {
	    	Exercicio1 calculadora = new Exercicio1();
	        int resultado = calculadora.dividir(6, 3);
	        assertEquals(2, resultado);
	    }
	    
	    @Test(expected = IllegalArgumentException.class)
	    public void testDividirPorZero() {
	    	Exercicio1 calculadora = new Exercicio1();
	        calculadora.dividir(6, 0);
	    }

}
