package atividadeRepeticao;

import java.util.Scanner;

public class AtividadeFor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, num2, contador;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número do intervalo: ");
		num2 = leia.nextInt();
		
		if (num1 < num2) {
			
			System.out.println("\nNo intervalo entre " + num1 + " e " + num2 + ":\n");
			
			// o laço começa em num1 até num2
			for (contador = num1; contador <= num2; contador++) {
				
				if (contador % 3 == 0 && contador % 5 == 0) {
					System.out.println(contador + " é múltiplo de 3 e 5 ");
				}				
			}
		  } else {
			System.out.println("Intervalo Inválido!");
	   }
	}
}
