package atividadesGeneration;

import java.util.Scanner;

public class ValoresFloat {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// variaveis
		float n1;
		float n2;
		float n3;
		float n4;
		float diferenca;
		
		// entrada de dados
		System.out.println("Número 1: ");
		n1 = leia.nextFloat();
		
		System.out.println("Número 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("Número 3: ");
		n3 = leia.nextFloat();
		
		System.out.println("Número 4: ");
		n4 = leia.nextFloat();
		
		// processamento:(n1 * n2) – (n3 * n4) 
		diferenca = (n1 * n2) - (n3 * n4);
		
		// saida de dados
		System.out.printf("Diferença: %.1f\n", diferenca);


	}

}
