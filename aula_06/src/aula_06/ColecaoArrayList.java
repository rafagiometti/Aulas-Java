package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ColecaoArrayList {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		// Criamos acollection arraylist
		ArrayList<Double> numeros = new ArrayList();
		
		// Add valores a collection
		numeros.add(2.0);
		numeros.add(3.0);
		numeros.add(9.0);
		numeros.add(6.0);
		numeros.add(2.0);
		

		// System.out.println(" Digite um número real");
		// Double input = leia.nextDouble();
		
		// Numeros.add(input);
		
		// Listando os valores da collection
		for(var numero : numeros) {
			System.out.println(numero);
		}
		
		System.out.println("Indíce do numero 9.0: " + numeros.indexOf(9.0));
		
		System.out.println("O número 9.0 existe na coleção: " + numeros.contains(9.0));
		
		System.out.println("Qual valor está armazenado no indíce 2? " + numeros.get(2));
		
		//Alterar o valor de um elemento
		numeros.set(2, 10.0);
		
		// Exibe os dados atualizados, através do método ForEach
		System.out.println("Exibe os dados após a atualização");
		numeros.forEach(System.out::println);
		
		
		// Excluir um elemento da lista com base no indíce
		System.out.println("Exibe os dados após a exclusão");
		numeros.remove(2);
		numeros.forEach(System.out::println);
		
		// Excluir um elemento da lista com base no indíce
		numeros.remove(numeros.indexOf(2.0));
		
		System.out.println("Qual é o tamanho da coleção " + numeros.size());
		
		// Limpar a coleção
		// numeros.clear();
		
		// Ordenar a coleção
		numeros.sort(null);
		numeros.forEach(System.out::println);

		
		// Ordenar a coleção
		numeros.sort(Comparator.reverseOrder());		
		System.out.println("Exibir os dados ordenados em forma decrescente:");
		numeros.forEach(System.out::println);

		System.out.println("A coleção está vazia?  " + numeros.isEmpty());
		
		
		leia.close();numeros.add(2.0);
	}

}
