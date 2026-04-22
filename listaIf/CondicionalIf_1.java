package atividadesGeneration.listaIf;

import java.util.Scanner;

public class CondicionalIf_1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numeroA, numeroB, numeroC, soma;
		
		System.out.println("Digite o número A: ");
		numeroA = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		numeroB = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		numeroC = leia.nextInt();
		
		int soma = numeroA + numeroB;

		if(soma > numeroC) {
			System.out.println("A Soma de A + B é Maior do que C");
			
		} else if (soma < numeroC) {
			System.out.println("A Soma de A + B é Menor do que C");
			
		} else  {
		System.out.println("A Soma de A + B é Igual a C");
		}

}
}
