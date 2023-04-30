/**
 * Resposta do Exercício 1 – Implemente uma pilha
 * 
 */
package br.com.amaral.app;

import br.com.amaral.domain.Node;
import br.com.amaral.services.PilhaService;

/**
 * @author leandro.amaral
 *
 */
public class PilhaApp {
	
	public static void main(String args[]){
		
        PilhaService pilha = new PilhaService();
        pilha.push(new Node(1));
        pilha.push(new Node(2));
        pilha.push(new Node(3));
        pilha.push(new Node(4));
        pilha.push(new Node(5));
        pilha.push(new Node(6));
        
        System.out.println("*** Método push() ***");
        System.out.println("Inserindo elementos na pilha:");
        System.out.println(pilha.toString());
        
        System.out.println("*** Método pop() ***");
        System.out.println("Removendo Elemento: "+pilha.pop().toString());
        
        System.out.println("\n*** Método top() ***");
        System.out.println("Imprimindo o primeiro elemento: "+pilha.top().toString());
        
        System.out.println("\n*** Método isEmpty() ***");
        System.out.println("A pilha está vazia? "+pilha.isEmpty());
        
        System.out.println("\n*** Método size() ***");
        System.out.println("Tamanho da Pilha: "+pilha.size()+ " elementos");
	}
}
