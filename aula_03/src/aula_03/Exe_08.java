package aula_03;

import java.util.Scanner;

public class Exe_08 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int operacao;
        float valor = 0, novosaldo = 0, saldo = 1000;

        System.out.println("------------------");
        System.out.println("Código da operação");
        System.out.println("------------------");
        System.out.println("1 - Saldo");
        System.out.println("2 - Saque");
        System.out.println("3 - Depósito");
        System.out.println("------------------");

        System.out.println("Operação:");
        operacao = leia.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Operação - Saldo");
                System.out.printf("Saldo: R$%.2f\n", saldo);
                break;

            case 2:
                System.out.println("Operação - Saque");
                System.out.print("Valor: ");
                valor = leia.nextFloat();

                if (valor > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    novosaldo = saldo - valor;
                    System.out.printf("Novo saldo: R$%.2f\n", novosaldo);
                }
                break;

            case 3:
                System.out.println("Operação - Depósito");
                System.out.print("Valor: ");
                valor = leia.nextFloat();

                novosaldo = saldo + valor;
                System.out.printf("Novo saldo: R$%.2f\n", novosaldo);
                break;

            default:
                System.out.println("Operação inválida!");
        }

        leia.close();
    }
}
