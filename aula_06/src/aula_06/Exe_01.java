package aula_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<>();
		int i;
		String cor;
		
		for(i = 0; i < 5; i++) {
			System.out.println("Digite uma cor:");
			cor = leia.nextLine();
			cores.add(cor);
		}
		
		
		
		System.out.println("Listar todas as cores:");
		
		System.out.println(cores);
		
		
		Collections.sort(cores);
		
		System.out.println("Ordenar as cores:");
		
		System.out.println(cores);
		
		
		
		}

}
