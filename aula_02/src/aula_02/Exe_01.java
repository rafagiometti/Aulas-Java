package aula_02;

import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
	
	float salario, abono, novosalario;
	
	Scanner leia = new Scanner(System.in);	
	
	System.out.println("Digite o Salário:");
	
	salario = leia.nextFloat(); 
	
	System.out.println("\nDigite o abono:");
	
	abono = leia.nextFloat();
	
	novosalario =  salario + abono;
	
	System.out.printf("\nNovo Salário: %.2f", novosalario);
	 
		
	}

}
