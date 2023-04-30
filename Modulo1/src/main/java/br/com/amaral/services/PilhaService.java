package br.com.amaral.services;

import br.com.amaral.domain.Node;

/**
 * @author leandro.amaral
 *
 */
public class PilhaService {

	private Node refTopNo;
	private int tamanho;

	public PilhaService() {
		this.refTopNo = null;
		this.tamanho = 0;
	}

	// Notação BigO: O(1) - Constante
	/**
	 * Justificativa: A operação de push adiciona um elemento na posição do topo da
	 * pilha, Como a posição do topo é mantida em uma variável separada, o tempo
	 * para realizar as operações não depende do tamanho da pilha
	 */
	public void push(Node novoNo) {
		Node refTopNoAuxiliar = refTopNo;
		refTopNo = novoNo;
		refTopNo.setReferencia(refTopNoAuxiliar);
		tamanho++;
	}

	// Notação BigO: O(1) - Constante
	/**
	 * Jusstificativa: A operação de pop remove o elemento do topo da pilha. Como a
	 * posição do topo é mantida em uma variável separada, o tempo para realizar as
	 * operações não depende do tamanho da pilha
	 */
	public Node pop() {
		if (this.isEmpty()) {
			throw new RuntimeException("Pilha vazia");
		}
		Node noRetorno = null;
		if (!this.isEmpty()) {
			noRetorno = refTopNo;
			refTopNo = refTopNo.getReferencia();
			tamanho--;
		}
		return noRetorno;
	}

	public Node top() {
		if (this.isEmpty()) {
			throw new RuntimeException("Pilha vazia");
		}
		return refTopNo;
	}

	public boolean isEmpty() {
		return refTopNo == null;
	}

	public int size() {
		return tamanho;
	}

	@Override
	public String toString() {
		String nos = "-----------\n";
		Node noAuxiliar = refTopNo;
		while (noAuxiliar != null) {
			nos += noAuxiliar != null ? noAuxiliar.toString() + "\n" : "";
			noAuxiliar = noAuxiliar.getReferencia();
		}
		return nos;
	}
}
