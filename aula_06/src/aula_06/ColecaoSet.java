package aula_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {
 
	public static void main(String[] args) {

		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Maçã");
		frutas.add("Morango");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Maçã");
		
		System.out.println(frutas);
		
		/*for (var fruta : frutas) {
			System.out.println(fruta.hashCode());
		}*/
		
		
		// Verificando se contém algo na collection
		System.out.println("Morango existe na coleção? " + frutas.contains("Morango"));
		
		// Excluindo um elemento da collection
		frutas.remove("Morango");
		
		// Verificando se contém algo na collection
		System.out.println("Morango existe na coleção? " + frutas.contains("Morango"));
				
		// Criando Iterator
		Iterator<String> ifrutas = frutas.iterator();
		
		// Usando Looping para listar dados após a exclusão de um elemento
		while(ifrutas.hasNext()){
		System.out.println(ifrutas.next());
			
		}
		
		// Criando ArrayList (frutaslist)
		ArrayList<String> frutaslist = new ArrayList<String>();
		
		// Add todos os elementos do set na minha lista
		frutaslist.addAll(frutas);
		
		//Ordenando frutaslist em ordem crescente (alfabetica)
		frutaslist.sort(null);
		
		// Exibindo todos os dados do fruutalist em ordem crescente
		frutaslist.forEach(System.out::println);
		
	}

}
