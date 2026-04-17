package atividadesGeneration;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// declarando variaveis
		Scanner leia = new Scanner(System.in);
		
		// variaveis
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float mediaFinal;
		
		// entrada de dados
		System.out.println("Nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Nota 4: ");
		nota4 = leia.nextFloat();
		
		// processamento: lembrar de dividir por 4
		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		// saida de dados: 
		System.out.printf("Média final: %.1f\n", mediaFinal);
		

	}

}
