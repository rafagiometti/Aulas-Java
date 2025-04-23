package aula_07;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		//Criando a fila
		Queue <String> fila = new LinkedList<String>();
		
		//Adcionando elementos na fila
		fila.add("Carlos");
		fila.add("Giovana");
		fila.add("Livia");
		fila.add("Maria");
		fila.add("Samuel");
		fila.add("Fabricio");
		fila.add("Victor");
		
		//Exibindo
		System.out.println(fila);
		
		//Removendo um elemento
		fila.remove();
		
		//Exibindo fila atualizada
		System.out.println(fila);
		
		//Adcionando um elemento no final da fila 
		fila.add("Thiago");
		
		//Exibindo a fila atualizada
		System.out.println(fila);
		
		//Exibindo o cabeça (primeiro elemento) da fila
		System.out.println(fila.peek());
		
		//Exibindo e removendo o primeiro elemento da fila
		System.out.println(fila.poll());
		
		//Exibindo fila atualizada
		System.out.println(fila);
		
		System.out.println("A Maria está na fila ? " + fila.contains("Maria"));
		System.out.println("O Carlos está na fila? " + fila.contains("Carlos"));
		
		int contador = 0;
		for(var pessoa : fila) {
			contador ++;
			if(pessoa.equalsIgnoreCase("maria")) {
				System.out.println("A Maria está na posição: " + contador);
			}
			
		}
	
		System.out.println("Qual é o tamanho da fila? " + fila.size());
	}

}
