import java.util.Scanner;

public class Exe_03 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[][] mat = new int[3][3];
        int somaprincipal = 0, somasecundaria = 0;

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o valor para a matriz na posição [%d][%d]: ", i, j);
                mat[i][j] = leia.nextInt();
            }
        }

        
        System.out.println("\nElementos da Diagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(mat[i][i] + " ");
            somaprincipal += mat[i][i];
        }

        
        System.out.println("\nElementos da Diagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(mat[i][2 - i] + " ");
            somasecundaria += mat[i][2 - i];
        }

        
        System.out.printf("\n\nSoma dos Elementos da Diagonal Principal: %d", somaprincipal);
        System.out.printf("\nSoma dos Elementos da Diagonal Secundária: %d\n", somasecundaria);

        leia.close();
    }
}

