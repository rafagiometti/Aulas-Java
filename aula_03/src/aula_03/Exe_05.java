package aula_03;

import java.util.Scanner;

public class Exe_05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int codigo, quantidade;
		float valor, total;
		String produto ="";
		
		
		System.out.printf("------------------------------------ \n");
		System.out.printf("Digite o código do produto, de 1 a 6: ");
		codigo = leia.nextInt();

		System.out.printf("------------------------------------ \n");
		System.out.printf("\n Digite a quantidade: ");
		quantidade = leia.nextInt();

		System.out.printf("------------------------------------ \n");
		
		valor = 0;
		
		switch (codigo) {
			case 1:
				produto = "Cachorro Quente";
				valor = 10;
				break;
			case 2:
				produto = "X-Salada";
				valor = 15;
				break;
			case 3:
				produto = "X-Bacon";
				valor = 18;
				break;
			case 4:
				produto = "Bauru";
				valor = 12;
				break;
			case 5:
				produto = "Refrigerante";
				valor = 8;
				break;
			case 6:
				produto = "Suco de Laranja";
				valor = 13;
				break;
		default:
			System.out.println("Resposta Inválida");
			return;
				
		}
		total = valor*quantidade;
		System.out.printf("Produto %s", produto);
		System.out.printf("\n Valor total: %.2f", total);
		
	}

}
