package br.com.amaral.domain;

/**
 * @author leandro.amaral
 *
 */
public class Node<T> {
    
	public int data;
    public Node<T> next;
    public Node referencia;
    public T conteudo;
   
    public Node(int data) {
        this.data = data;
        next = null;
    }
    
    public Node(T conteudo) {
        this.conteudo = conteudo;
    }
    
    public Node(T conteudo, Node<T> next) {
        this.conteudo = conteudo;
        this.next = next;
    }
   
    public Node() {
        this.referencia = null;
    }
    
    public int getData() {
        return data;
    }
    
    public void setData(int data) {
        this.data = data;
    }
    
    public Node getNext() {
        return next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
    
    public Node getReferencia() {
    return referencia;
    }

    public void setReferencia(Node referencia) {
        this.referencia = referencia;
    }
    
    public T getConteudo() {
        return conteudo;
    }
    
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

	@Override
	public String toString() {
		return "Node [data=" + data + ", conteudo=" + conteudo + "]";
	}
    
}