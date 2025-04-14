package aula_02;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		//Criando objeto chamado leia, pra ler valores via teclado.
		
		Scanner leia = new Scanner(System.in);
		
		//definição das variáveis
		
		System.out.println("Digite o primeiro número inteiro: ");
		int numero_01 = leia.nextInt();
		System.out.println("Digite o segundo número inteiro: ");
		int numero_02 = leia.nextInt();
		char opcao = 'V';
		
		//O char aceita no máx 1 letra
	
		boolean menorIdade =true;
		
		//string é um objeto, é como se fosse um vetor
		
		System.out.println("Escreva o seu nome:");
		
		String nome = leia.next();
		
		//n nome. mostra os métodos que podem ser trabalhados na string.
		//definição da constante PI
		
		final double PI = 3.1415;
		
		//Atribuição de valor
		//numero_02 = 75;
		//Exibição em tela
		
		System.out.printf("Variável número 1 é igual a: %d \n ", numero_01);
		
		//o sinal de + soma ao texto o resultado que está guardado na var
		
		System.out.println("Variável número 2 é igual a: " +numero_02);	
		
		//printf é o print formatado
		
		System.out.printf("Constante PI é igual a: %.2f \n", PI);
		System.out.println("Variável nome em letras maiúsculas: " + nome.toUpperCase());
		
	}
}