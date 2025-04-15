package aula_02;

import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Float salliquido, addnoturno, horas, descontos, salbruto;
		
		System.out.printf("\n Salário Bruto:");
		salbruto = leia.nextFloat();

		System.out.printf("\n Adcional Noturno:");
		addnoturno = leia.nextFloat();
		
		System.out.printf("\n Horas Extras:");
		horas = leia.nextFloat();
		
		System.out.printf("\n Descontos:");
		descontos = leia.nextFloat();
		
		salliquido = salbruto + addnoturno + (horas*5) - descontos;
		
		System.out.printf("\n Salário Liquido: %.2f", salliquido);
		
		
		

	}

}
