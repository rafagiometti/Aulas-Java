package aula_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int resposta;

		System.out.println("************************************************");
		System.out.println("");
		System.out.println("1 - Adcionar Cliente na Fila");
		System.out.println("2 - Listar todos os Clientes");
		System.out.println("3 - Retirar Cliente da Fila");
		System.out.println("0 - Sair");
		System.out.println("");
		System.out.println("************************************************");

		do {
			System.out.print("\nDigite uma opção: ");
			resposta = leia.nextInt();
			leia.nextLine(); // Limpa o Enter pendente

			System.out.println("\n------------------------------------------------");

			switch (resposta) {
				case 1:
					System.out.print("Digite um nome: ");
					String nome = leia.nextLine();
					fila.add(nome);
					System.out.println("\nFila:");
					System.out.println(fila);
					System.out.println("\nCliente Adcionado!");
					break;

				case 2:
					System.out.println("Lista de Clientes na Fila:");
					System.out.println(fila);
					break;

				case 3:
					if (fila.isEmpty()) {
						System.out.println("A fila está vazia");
					} else {
						fila.remove();
						System.out.println("Fila:");
						System.out.println(fila);
					}
					break;

				case 0:
					System.out.println("Encerrando o programa...");
					break;

				default:
					System.out.println("Opção inválida! Tente novamente.");
			}

			System.out.println("------------------------------------------------");

		} while (resposta != 0);

		leia.close();
	}
}

