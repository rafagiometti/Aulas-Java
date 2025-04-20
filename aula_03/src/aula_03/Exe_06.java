package aula_03;

import java.util.Scanner;

public class Exe_06 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome;
        int codigo;
        float salario, novosalario = 0, reajuste = 0;

        System.out.println("Nome do colaborador:");
        nome = leia.nextLine();


        System.out.printf("\n ************************");
        System.out.printf("\n Tabela de códigos:");
        System.out.printf("\n ************************");
        System.out.printf("\n Gerente - 1");
        System.out.printf("\n Vendedor - 2");
        System.out.printf("\n Supervisor - 3");
        System.out.printf("\n Motorista - 4");
        System.out.printf("\n Estoquista - 5");
        System.out.printf("\n Técnico de TI - 6");
        System.out.printf("\n *************************");

        System.out.printf("\n Código do colaborador: ");
        codigo = leia.nextInt();
        System.out.println("Salário atual:");
        salario = leia.nextFloat();
        
        switch (codigo) {
            case 1:
                reajuste = 0.10f; // 10%
                break;
            case 2:
                reajuste = 0.07f; // 7%
                break;
            case 3:
                reajuste = 0.09f; // 9%
                break;
            case 4:
                reajuste = 0.06f; // 6%
                break;
            case 5:
                reajuste = 0.05f; // 5%
                break;
            case 6:
                reajuste = 0.08f; // 8%
                break;
            default:
                System.out.println("Código inválido.");
                return;
        }

        novosalario = salario + (salario * reajuste);

        System.out.printf("\nColaborador: %s", nome);
        System.out.printf("\nSalário anterior: R$ %.2f", salario);
        System.out.printf("\nNovo salário: R$ %.2f", novosalario);

        leia.close();
    }
}

