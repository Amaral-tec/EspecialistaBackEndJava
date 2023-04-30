/**
 * Resposta do Desafio – Implemente um mapa de hash do zero
 * 
 * Justificativa: Nesta implementação, a função hash é o cálculo do resto da chave por 10, 
 * o que garante que o índice do array será entre 0 e 9. Procurei fazer o método mais simples
 * que mostrasse o resultado esperado.
 */
package br.com.amaral.app;

import br.com.amaral.services.HashMap;

/**
 * @author leandro.amaral
 *
 */
public class DesafioApp {

	public static void main(String[] args) {
        HashMap map = new HashMap();

        System.out.println("*** Método put(int key, int value) ***");
        System.out.println("Inserindo par chave/valor ao mapa:");
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        map.put(4, 40);
        map.put(5, 50);
        map.put(6, 60);
        map.put(7, 70);
        map.put(8, 80);
        map.put(9, 90);
        map.put(10, 100);

        System.out.println("\n*** Método delete(int key) ***");
        System.out.println("Removendo o valor do topo da pilha e o retorna ao chamador");
        map.delete(0);
        
        System.out.println("\n*** Método get(int key) ***");
        System.out.println("Retornando o valor associado à chave passada via parâmetro:");
        System.out.println(map.get(1));

        System.out.println("\n*** Método clear() ***");
        System.out.println("Removendo todos os elementos do mapa");
        map.clear();
    }
}