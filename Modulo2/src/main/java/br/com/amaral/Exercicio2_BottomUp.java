/**
 * 
 */
package br.com.amaral;

// Explique as diferenças entre a solução do exercício 2 e a do exercício 3
/**
 * A abordagem Top-down começa com o problema geral e o divide em subproblemas
 * menores, enquanto a abordagem Bottom-up começa com os subproblemas menores e
 * os combina para resolver o problema geral.
 *
 */
public class Exercicio2_BottomUp {

	public static int calcularFatorial(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = i * dp[i-1];
        }
        return dp[n];
    }
    
    public static void main(String[] args) {
        int n = 3;
        
        if(n < 1 || n > 100) {
            System.out.println("Número inválido! O número deve ser entre 1 e 100.");
            return;
        }
        
        int resultado = calcularFatorial(n);
        System.out.println("O fatorial de " + n + " é: " + resultado);
    }
}