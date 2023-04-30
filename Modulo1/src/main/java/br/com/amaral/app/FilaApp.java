/**
 * Resposta do Exercício 2 – Implemente uma fila FIFO
 * 
 */
package br.com.amaral.app;

import br.com.amaral.services.FilaService;

/**
 * @author leandro.amaral
 * 
 */
public class FilaApp {
	
	 public static void main(String args[]){
	        FilaService<Integer> fila = new FilaService<>();
	        fila.enqueue(1);
	        fila.enqueue(3);
	        fila.enqueue(4);
	        fila.enqueue(5);
	        fila.enqueue(7);
	        
	        System.out.println("*** Método enqueue() ***");
	        System.out.println("Adicionando elementos na fila:");
	        System.out.println(fila.toString());
	        
	        System.out.println("*** Método dequeue() ***");
	        System.out.println("Removendo elemento: "+fila.dequeue());
	        
	        System.out.println("\n*** Método rear() ***");
	        System.out.println("Imprimindo último Elemento: "+fila.rear());
	        
	        System.out.println("\n*** Método front() ***");
	        System.out.println("Imprimindo primeiro Elemento: "+fila.front());
	        
	        System.out.println("\n*** Método isEmpty() ***");
	        System.out.println("A fila está vazia? "+fila.isEmpty());
	        
	        System.out.println("\n*** Método size() ***");
	        System.out.println("Tamanho da fila: "+fila.size()+ " elementos");

	 }
}
