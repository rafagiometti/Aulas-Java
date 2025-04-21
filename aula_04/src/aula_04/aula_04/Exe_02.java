package aula_04;

import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade, menor = 0, maior = 0, i = 0;
		
		
		while(i >= 0) {
			System.out.println("Digite uma idade:");
			idade = leia.nextInt();
				if((idade < 21) && (idade > 0 )) {
			menor++;
		}else if (idade > 50) {
			maior++;
		}
		i = idade;
	}
		System.out.printf("Total de pessoas menores de 21 anos: %d \n", menor);
		System.out.printf("Total de pessoas maiores de 50 anos: %d", maior);
		leia.close();
	}	

}
