package aula_04;

import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, soma = 0;
		
		System.out.println("Para sair do programa digite 0");
		
		do{
			System.out.println("Digite um número:");
			numero = leia.nextInt();
			if(numero > 0) {
				soma = soma + numero;
			}
		}while(numero != 0);
		
		System.out.printf("A soma dos números positivos é: %d", soma);
		leia.close();
	}

}
