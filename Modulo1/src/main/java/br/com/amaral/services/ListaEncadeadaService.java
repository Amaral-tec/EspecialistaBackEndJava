package br.com.amaral.services;

import br.com.amaral.domain.Node;

/**
 * @author leandro.amaral
 *
 */
public class ListaEncadeadaService<T> {

	private Node head;
	private int size;

	public ListaEncadeadaService() {
		head = null;
		size = 0;
	}

	// Notação BigO: O(n^1) - Constante
	/**
	 * Justificativa: A complexidade assintótica de tempo é sempre O(1) porque cada
	 * operação é executada em tempo constante, independentemente do tamanho da
	 * lista. A complexidade assintótica de espaço é O(n), onde n é o número de
	 * elementos na lista, porque a estrutura de dados armazena todos os elementos
	 * na memória.
	 */
	public void push(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(node);
		}
		size++;
	}

	// Notação BigO: O(1) - Constante
	/**
	 * Justificativa: A complexidade assintótica de tempo é sempre O(1) porque cada
	 * operação é executada em tempo constante, independentemente do tamanho da
	 * lista. A complexidade assintótica de espaço é O(n), onde n é o número de
	 * elementos na lista, porque a estrutura de dados armazena todos os elementos
	 * na memória.
	 */
	public Node pop() {
		if (head == null) {
			return null;
		} else if (head.getNext() == null) {
			Node nodeToRemove = head;
			head = null;
			size--;
			return nodeToRemove;
		} else {
			Node current = head;
			while (current.getNext().getNext() != null) {
				current = current.getNext();
			}
			Node nodeToRemove = current.getNext();
			current.setNext(null);
			size--;
			return nodeToRemove;
		}
	}

	// Notação BigO: O(n^1) - Linear
	/**
	 * Justificativa: O método têm que percorrer a lista até o índice desejado,
	 * portanto a complexidade é linear em relação ao número de elementos na lista.
	 * Em termos de espaço, o método usa apenas uma quantidade constante de espaço
	 * além do espaço necessário para armazenar os elementos da lista.
	 */
	public void insert(int index, Node node) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		} else if (index == 0) {
			node.setNext(head);
			head = node;
			size++;
		} else {
			Node current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.getNext();
			}
			node.setNext(current.getNext());
			current.setNext(node);
			size++;
		}
	}

	// Notação BigO: O(n^1) - Linear
	/**
	 * Justificativa: O método têm que percorrer a lista até o índice desejado,
	 * portanto a complexidade é linear em relação ao número de elementos na lista.
	 * Em termos de espaço, o método usa apenas uma quantidade constante de espaço
	 * além do espaço necessário para armazenar os elementos da lista.
	 */
	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		} else if (index == 0) {
			head = head.getNext();
			size--;
		} else {
			Node current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
			size--;
		}
	}

	// Notação BigO: O(n^1) - Linear
	/**
	 * Justificativa: O método têm que percorrer a lista até o índice desejado,
	 * portanto a complexidade é linear em relação ao número de elementos na lista.
	 * Em termos de espaço, o método usa apenas uma quantidade constante de espaço
	 * além do espaço necessário para armazenar os elementos da lista.
	 */
	public Node elementAt(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		} else {
			Node current = head;
			for (int i = 0; i < index; i++) {
				current = current.getNext();
			}
			return current;
		}
	}

	public int size() {
		return size;
	}

	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		System.out.println();
	}
}
