package atividadeRepeticao;

import java.util.Scanner;

public class AtividadeDoWhile_2 {

	public static void main(String[] args) {
		int numero, soma = 0, contador = 0;
		float media;
		Scanner leia = new Scanner(System.in);

		do {

			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			
			if (numero % 3 == 0 && numero != 0) {
				soma = soma + numero;
				contador = contador + 1;
			}

		} while (numero != 0);
		
		if (contador > 0) {
			 media = (float) soma / contador;
			System.out.println("\nA média de todos os números múltiplos de 3 é: " + media);
		} 

	  

	}
}
