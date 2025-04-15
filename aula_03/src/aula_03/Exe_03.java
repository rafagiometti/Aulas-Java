package aula_03;

import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        String nome;
        int idade;
        String resposta;
        boolean primeiraDoacao;
        System.out.print("Digite o nome do doador: ");
        nome = leia.nextLine();

        System.out.print("Digite a idade do doador: ");
        idade = leia.nextInt();
        leia.nextLine(); 

        System.out.print("É a primeira doação de sangue? (sim/não): ");
        resposta = leia.nextLine();
        
        primeiraDoacao = resposta.equalsIgnoreCase("sim");
        
        if (idade >= 18 && idade <= 69) {
            if (primeiraDoacao && idade > 60) {
                System.out.println(nome + " não está apto(a) para doar sangue.");
            } else {
                System.out.println(nome + " está apto(a) para doar sangue.");
            }
        } else {
            System.out.println(nome + " não está apto(a) para doar sangue.");
        }

	}

}
