/**
 * 
 * Classe que representa a resposta do Exercício 3 – Documentação de código
 *
 */
package br.com.amaral;

//Classe destinada as operações da calculadora
/**
 * 
 * Você conseguiria entender o código que escreveu sem documentá-lo?
 * 
 * Sim, os métodos são claros e de fácil leitura, e o próprio nome do método já indica sua funcionalidade.
 * Porém, a documentação é indicada para esclarecer onde os métodos estão sendo aplicados.
 *
 */
public class Exercicio1 {
	
	public int adicionar(int a, int b) {
        return a + b;
    }
    
    public int subtrair(int a, int b) {
        return a - b;
    }
    
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        return a / b;
    }
}
