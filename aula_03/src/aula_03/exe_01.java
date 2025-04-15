package aula_03;

import java.util.Scanner;

public class exe_01 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		int A, B, C, soma;
		
		System.out.printf("Digite o número A: ");
		A = leia.nextInt();
		
		System.out.printf("\n Digite o número B:");
		B = leia.nextInt();
		
		System.out.printf("\n Digite o número C:");
		C = leia.nextInt();
		
		soma = A + B;
		
		
		if(soma > C) {

			System.out.printf("\n %d + %d = %d > %d", A, B, soma, C);
			System.out.printf("\n A Soma de A + B é Maior que C");
			
		}
		
	}

<<<<<<< HEAD
}
=======
}
>>>>>>> 60dc1af6ddff466fd2e35690609311c1b67a4c97
