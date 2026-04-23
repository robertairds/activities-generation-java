package atividadeRepeticao;

import java.util.Scanner;

public class AtvidadeDoWhile {

	public static void main(String[] args) {
		int numero, somaPositivos = 0;
		Scanner leia = new Scanner(System.in);

		do {

			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			
			if (numero > 0) {
				somaPositivos = somaPositivos + numero;
			}

		} while (numero != 0);
		System.out.println("\nA soma dos números positivos é: " + somaPositivos);



	}

}
