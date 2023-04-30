/**
 * 
 */
package br.com.amaral;

import java.util.Scanner;

/**
 * Problema: crie um código que calcule o fatorial de um número
 * 
 * Exemplos: Entrada: 3 | Saída: 6
 *
 */
public class Exercicio1_Recursao {
		
public static void main(String[] args) {
        
        int num, fatorial = 1;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número inteiro entre 1 e 100: ");
        num = scan.nextInt();
        
        if(num < 1 || num > 100) {
            System.out.println("Número inválido! O número deve ser entre 1 e 100.");
            return;
        }
        
        for(int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        
        System.out.println("O fatorial de " + num + " é " + fatorial);
        
        scan.close();
    }
}

//Consegue calcular o fatorial de um número acima de 100 com uma solução recursiva? Justifique sua resposta.

/**
 * O problema de calcular o fatorial de um número acima de 100 com uma solução recursiva é que o número de chamadas 
 * recursivas necessárias para calcular o fatorial se torna tão grande que a pilha de chamadas recursivas 
 * (a memória do programa que armazena as chamadas de função ativas) acaba estourando.
 * 
 * Por exemplo, para calcular o fatorial de 100 usando recursão, a função recursiva seria chamada 100 vezes, uma para 
 * cada número de 1 a 100. Para calcular o fatorial de 101, a função recursiva teria que chamar a si mesma mais 101 vezes, 
 * uma para cada número de 1 a 101. Esse processo se torna exponencialmente maior quanto maior o número que queremos calcular 
 * o fatorial.
 * 
 * Em resumo, o problema de calcular o fatorial de um número acima de 100 com uma solução recursiva é que o número de 
 * chamadas recursivas necessárias se torna tão grande que a memória do programa se esgota, fazendo com que o programa 
 * falhe ou trave. É necessário usar soluções alternativas, como a iteração ou o uso de bibliotecas matemáticas que trabalham 
 * com números grandes, para lidar com esse tipo de problema.
 */
