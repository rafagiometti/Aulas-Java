package aula_03;

public class Caracteres {

	public static void main(String[] args) {
		
		String frase_01 = "Turma Java 82";
		String frase_02 = "TURMA JAVA 82";
		String frase_03 = "turma java 82";
		String frase_04 = "TURMA JAVA 82";
		
		System.out.println(frase_04 == frase_02);
		System.out.println(frase_01 == frase_02);
	
		//comparando (minusculas e maiusculas ele da como diferente
		System.out.println(frase_04.equals(frase_02));
		System.out.println(frase_01.equals(frase_02));

		//ignorando maiúsculos e minúsculos
		System.out.println(frase_04.equalsIgnoreCase(frase_02));
		System.out.println(frase_01.equalsIgnoreCase(frase_02));

		//Compara e retorna um valor que indica se o primeiro é menor, igual ou maior que o segundo.
		System.out.println(frase_04.compareTo(frase_02));
		System.out.println(frase_01.compareTo(frase_02));

	}

}
