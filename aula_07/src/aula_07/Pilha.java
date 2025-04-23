package aula_07;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Cria a estrutura de dados pilha
		Stack<String> pilha = new Stack<String>();
		
		//Adcionando elementos a pilha
		pilha.add("Comunicação não violenta");
		pilha.add("IT: A Coisa");
		pilha.add("A coragem de ser imperfeito");
		pilha.add("Quem pensa, enriquece");
		pilha.add("Diário de um banana");
		pilha.add("Senhor dos anéis");
		pilha.add("O Código da Vinci");
		
		System.out.println(pilha);
		
		//Retirando um elemento da pilha
		pilha.pop();
		
		System.out.println(pilha);
		
		//Adcionando um elemento
		pilha.push("Roube com um Artista");
		
		//Exibindo o primeiro elemento (que é o ultimo)
		System.out.println(pilha.peek());
		
		//Verificando se um elemento existe na pilha
		System.out.println("O livro Diário de um banana existe na pilha? " + pilha.contains("Diário de um banana"));
		
		//Adcionando elemento via teclado
		System.out.println("Digite o título de um livro:");
		pilha.push(leia.nextLine());
		
		System.out.println(pilha);
		leia.close();
		
	}
}
