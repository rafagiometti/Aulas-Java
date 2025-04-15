package aula_03;

import java.util.Scanner;

public class ConversorMoedas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double valorConvertido = 0.0;
		String moeda = "";
		
		System.out.println("**********************************************************");
		System.out.println("\n              Conversor de Moedas                      ");
		System.out.println("\n*********************************************************");
		System.out.println("\n 1 - Converter para Dólar (US$)");
		System.out.println("\n 2 - Conerter para Euros(EUR)");
		System.out.println("\n 3 - Converter para Pesos (AR$)");
		System.out.println("                                                 ");
		System.out.println("**********************************************************");
		System.out.println("\n Digite a opção desejada");
		
		int opcao = leia.nextInt();
		
		System.out.println("\n Digite o valor em Reais (BRL)");
		double valor = leia.nextFloat();
		
		switch(opcao) {
		case 1:
			valorConvertido = valor / 5.86;
			moeda = "Dólar";
			break;
		case 2:
			valorConvertido = valor / 6.63;
			moeda = "Euro";
			break;
		case 3:
			valorConvertido = valor / 0.0049;
			moeda = "Peso";
			break;
		default: 
			System.out.println("Opção Inválida");
			leia.close();
			return; //sair do programa
		}
		System.out.printf("Valor convertido em %s: %.2f", moeda, valorConvertido);
		leia.close();
	}

}
