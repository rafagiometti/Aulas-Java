package aula_02;

import java.util.Scanner;

public class Exe_04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, resultado;
		
		System.out.println("\n numero1:");
		n1 = leia.nextFloat();
		
		System.out.println("\n numero2:");
		n2 = leia.nextFloat();
		
		System.out.println("\n numero3:");
		n3 = leia.nextFloat();
		
		System.out.println("\n numero4:");
		n4 = leia.nextFloat();
		
		resultado = (n1*n2) - (n3*n4);
		System.out.printf("\n Diferença: %.1f", resultado);
		

	}

}
