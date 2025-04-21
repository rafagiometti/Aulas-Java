import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int [] vet = {2,5,1,3,4,9,7,8,10,6};
		int numero, i;
		
		System.out.println("Digite o número que voce seja encontrar:");
		numero = leia.nextInt();
		
		for(i = 0; i < 10 ; i++) {
				
			if(vet[i] == numero) {
				System.out.printf("O número %d está localizado na casa %d", numero, i);
				break;
			}
			
	}		
		if(numero < 0 || numero >10) {
			System.out.printf("O número %d não foi encontrado!", numero);
		}
		
		leia.close();
}
}