package atividadesGeneration.listaIf;

import java.util.Scanner;

public class CondicionalIf_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		// par ou ímpar
		if (numero % 2 == 0) {
			System.out.println("O Número " + numero + " é par e positivo!");
		} else {
			System.out.println("O Número " + numero + " é impar e negativo!");
		} 
		
		// positivo ou negativo
		if (numero >= 0) {
			System.out.println("O Número " + numero + " é par e negativo!");
		} else {
			System.out.println("O Número " + numero + " é impar e positivo!");
		}
		


	}

}
