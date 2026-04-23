package atividadeRepeticao;

import java.util.Scanner;

public class AtividadeFor_2 {

	public static void main(String[] args) {
		int contador, numero;
		int totalPares = 0, totalImpares = 0;
		
		Scanner leia = new Scanner(System.in);

		for (contador = 1; contador <= 10; contador++) {

			System.out.println("Digite o " + contador + "º numero: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				totalPares = totalPares +1;	
			} else {
				totalImpares = totalImpares +1;
			}
		}
			
			System.out.println("\nTotal de número pares: " + totalPares);
			System.out.println("\nTotal de números ímpares: " + totalImpares);
			

	}
	}

