/**
 * Resposta do Exercício 3 – Implemente uma lista encadeada
 * 
 */
package br.com.amaral.app;

import br.com.amaral.domain.Node;
import br.com.amaral.services.ListaEncadeadaService;

/**
 * @author leandro.amaral
 *         
 */
public class ListaEncadeadaApp {

	public static void main(String arg[]) {

		ListaEncadeadaService<Object> list = new ListaEncadeadaService<Object>();

		list.push(new Node(1));
		list.push(new Node(2));
		list.push(new Node(3));
		list.push(new Node(4));

		System.out.println("*** Método void push(<Node> node) ***");
		System.out.println("Inserindo elementos na lista");
		list.printList();

		System.out.println("\n*** Método <Node> pop() ***");
		Node removedNode = list.pop();
		System.out.println("Removendo elemento: " + removedNode.getData());

		System.out.println("\n*** Método void insert(int index, <Node> node) ***");
		Node node4 = new Node(4);
		list.insert(1, node4);
		System.out.println("Inserindo elemento removida na segunda posição");
		list.printList();

		System.out.println("\n*** Método void remove(int index) ***");
		list.remove(0);
		System.out.println("Removendo o primeiro elemento da lista");
		list.printList();

		System.out.println("\n*** Método <Node> elementAt(int index) ***");
		System.out.println("Imprimindo elemento da terceira posição: " + list.elementAt(2));

		System.out.println("\n*** Método size() ***");
		System.out.println("Tamanho da lista: " + list.size());

		System.out.println("\n*** Método void printList() ***");
		System.out.println("Imprimindo a lista:");
		list.printList();

	}
}
