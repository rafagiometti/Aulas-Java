package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valor, i;
		
		ArrayList<Integer> inteiros = new ArrayList<>();
		
		inteiros.add(2);
		inteiros.add(5);
		inteiros.add(1);
		inteiros.add(3);
		inteiros.add(4);
		inteiros.add(9);
		inteiros.add(7);
		inteiros.add(8);
		inteiros.add(10);
		inteiros.add(6);
		
		System.out.println("Digite um valor para ser encontrado:");
		valor = leia.nextInt();
		
		boolean encontrado = false;
		
		for(i = 0; i < inteiros.size(); i++) {
			if(inteiros.get(i) == valor) {
				System.out.printf("O número %d está localizado na posição: %d \n", valor, i);
				encontrado = true;
				break;
			}
				
			}
		if (!encontrado) {
            System.out.printf("O número %d não foi encontrado na lista.\n", valor);
        }

		leia.close();
	}
		
}
