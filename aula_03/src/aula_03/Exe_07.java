package aula_03;

import java.util.Scanner;

public class Exe_07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float numero1, numero2, resultado;
		int codigo;
		
		resultado = 0;
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número:");
		numero2 = leia.nextFloat();
		
		System.out.println("Código das operações matemáticas");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		
		System.out.println("Operação:");
		codigo = leia.nextInt();
		
		switch (codigo) {
			case 1:
				resultado = numero1 + numero2;
				System.out.printf("\n%.1f + %.1f = %.1f", numero1, numero2, resultado);
				break;
			case 2:
				resultado = numero1 - numero2;
				System.out.printf("\n%.1f - %.1f = %.1f", numero1, numero2, resultado);
				break;
			case 3:
				resultado = numero1 * numero2;
				System.out.printf("%.1f * %.1f = %.1f", numero1, numero2, resultado);
				break;
			case 4:
				resultado = numero1 / numero2;
				System.out.printf("%.1f / %.1f = %.1f", numero1, numero2, resultado);
				break;
			default:
				System.out.println("Operação Inválida");
				return;
				
		
		}

		leia.close();
		
	}
	

}
