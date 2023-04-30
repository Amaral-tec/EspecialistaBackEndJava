package br.com.amaral.services;

import br.com.amaral.domain.Node;

/**
 * @author leandro.amaral
 *
 */
public class FilaService<T> {

	private Node<T> first;
	private Node<T> last;
	private int tamanho;

	public FilaService() {
		this.first = null;
		this.last = null;
		this.tamanho = 0;
	}

	// Notação BigO: O(1) - Constante
	/**
	 * Justificativa: A complexidade assintótica de tempo é sempre O(1) porque cada
	 * operação é executada em tempo constante, independentemente do tamanho da
	 * fila. A complexidade assintótica de espaço é O(n), onde n é o número de
	 * elementos na fila, porque a estrutura de dados armazena todos os elementos na
	 * memória.
	 */
	public void enqueue(T conteudo) {
		Node<T> newNode = new Node<>(conteudo);
		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;
		}
		last = newNode;
		tamanho++;
	}

	// Notação BigO: O(n^1) - Constante
	/**
	 * Justificativa: A complexidade assintótica de tempo é sempre O(1) porque cada
	 * operação é executada em tempo constante, independentemente do tamanho da
	 * fila. A complexidade assintótica de espaço é O(n), onde n é o número de
	 * elementos na fila, porque a estrutura de dados armazena todos os elementos na
	 * memória.
	 */
	public T dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("A fila está vazia!");
		}
		T valorRemovido = first.conteudo;
		first = first.next;
		tamanho--;
		if (isEmpty()) {
			last = null;
		}
		return valorRemovido;
	}

	// Notação BigO: O(1) - Constante
	/**
	 * Justificativa: A complexidade assintótica de tempo é sempre O(1) porque cada
	 * operação é executada em tempo constante, independentemente do tamanho da
	 * fila. A complexidade assintótica de espaço é O(n), onde n é o número de
	 * elementos na fila, porque a estrutura de dados armazena todos os elementos na
	 * memória.
	 */
	public T rear() {
		if (isEmpty()) {
			throw new IllegalStateException("A fila está vazia!");
		}
		return last.conteudo;
	}

	// Notação BigO: O(n^1) - Constante
	/**
	 * Justificativa: A complexidade assintótica de tempo é sempre O(1) porque cada
	 * operação é executada em tempo constante, independentemente do tamanho da
	 * fila. A complexidade assintótica de espaço é O(n), onde n é o número de
	 * elementos na fila, porque a estrutura de dados armazena todos os elementos na
	 * memória.
	 */
	public T front() {
		if (isEmpty()) {
			throw new IllegalStateException("A fila está vazia!");
		}
		return first.conteudo;
	}

	public boolean isEmpty() {
		return this.first == null;
	}

	public int size() {
		return tamanho;
	}

	@Override
	public String toString() {
		String nos = "-----------\n";
		Node<T> noAuxiliar = first;
		while (noAuxiliar != null) {
			nos += noAuxiliar != null ? noAuxiliar.getConteudo().toString() + "\n" : "";
			noAuxiliar = noAuxiliar.getNext();
		}
		return nos;
	}
}
