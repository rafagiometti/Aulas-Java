import java.util.Scanner;

public class Exe_02 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i, soma = 0;
        int vet[] = new int[10];
        double media;
 
        for (i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            vet[i] = leia.nextInt();
            soma += vet[i];
        }

        System.out.println("\nElementos nos índices ímpares:");
        for (i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d ", vet[i]);
            }
        }

        System.out.println("\nElementos com valores pares:");
        for (i = 0; i < 10; i++) {
            if (vet[i] % 2 == 0) {
                System.out.printf("%d ", vet[i]);
            }
        }

  
        media = (double) soma / vet.length;

        System.out.printf("\n\nSoma: %d", soma);
        System.out.printf("\nMédia: %.2f\n", media);

        leia.close();
    }
}
