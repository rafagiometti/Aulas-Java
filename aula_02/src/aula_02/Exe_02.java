package aula_02;

import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {
		
		float nota_01, nota_02, nota_03, nota_04, m;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("\n Nota 1:");
		
		nota_01 = leia.nextFloat();
		
		System.out.printf("\n Nota 2:");
		
		nota_02 = leia.nextFloat();
		
		System.out.printf("\n Nota 3:");
		
		nota_03 = leia.nextFloat();
	
		System.out.printf("\n Nota 4:");
		
		nota_04 = leia.nextFloat();
		
		m = (nota_01 + nota_02 + nota_03 + nota_04) / 4;
		
		System.out.printf("\n Média final: %.1f", m);
		
	}

}
