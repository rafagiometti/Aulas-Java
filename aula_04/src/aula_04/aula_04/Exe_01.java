package aula_04;

import java.util.Scanner;

public class Exe_01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero1, numero2; 
        int i;

        System.out.println("Digite o primeiro número do intervalo:");
        numero1 = leia.nextInt();

        System.out.println("Digite o segundo número do intervalo:");
        numero2 = leia.nextInt();

        if (numero1 >= numero2) {
            System.out.println("Intervalo Inválido");
        } else {
            for (i = numero1; i <= numero2; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    System.out.printf("%d é múltiplo de 3 e 5\n", i);
                }
            }
        }

        leia.close();
    }
}
