package aula_07;

import java.util.Scanner;
import java.util.Stack;

public class Exe_02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		int numero;

		do {
			System.out.println("************************************************");
			System.out.println("");
			System.out.println("1 - Adcionar Livro na Pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da Pilha");
			System.out.println("0 - Sair");
			System.out.println("");
			System.out.println("************************************************");
			System.out.println("Digite um número: ");
			
			numero = leia.nextInt();
			leia.nextLine();

			switch (numero) {
				case 1:
					System.out.println("Digite o nome: ");
					String livro = leia.nextLine();
					pilha.push(livro);
					System.out.println("Pilha:");
					System.out.println(pilha);
					System.out.println("Livro Adcionado!");
					break;
				case 2:
					System.out.println("Lista de livros na pilha:");
					System.out.println(pilha);
					break;
				case 3:
					if (pilha.isEmpty()) {
						System.out.println("A pilha está vazia!");
					} else {
						pilha.pop();
						System.out.println("Pilha:");
						System.out.println(pilha);
						System.out.println("Um livro foi retirado da pilha");
					}
					break;
				case 0:
					System.out.println("Programa Finalizado!");
			}
		} while (numero != 0);

		leia.close();
	}
}
