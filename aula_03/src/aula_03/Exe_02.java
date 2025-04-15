package aula_03;

import java.util.Scanner;

public class Exe_02 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int numero;

        System.out.print("Digite um número: ");
        numero = leia.nextInt();
        
        if (numero == 0) {
            System.out.println("\nO número é zero (neutro) e é considerado par.");
        } else {
            boolean par = numero % 2 == 0;
            boolean positivo = numero > 0;
            
            if (par && positivo) {
                System.out.printf("\nO número %d é par e positivo!\n", numero);
            } else if (!par && positivo) {
                System.out.printf("\nO número %d é ímpar e positivo!\n", numero);
            } else if (par && !positivo) {
                System.out.printf("\nO número %d é par e negativo!\n", numero);
            } else {
                System.out.printf("\nO número %d é ímpar e negativo!\n", numero);
            }
        }

        leia.close(); 
    }
}