package atividadeVetor;

import java.util.Scanner;

public class AtividadeVetor {

	public static void main(String[] args) {
		
		int vetorBusca [] = new int[10];
		
		Scanner leia = new Scanner(System.in);
		
		// Adicionar itens ao vetor
		for(int indice = 0; indice < 10; indice++) {
			System.out.println("Digite um número: ");
			vetorBusca[indice] = leia.nextInt();
			// numero = leia.nextInt();
			
		}
		
		// buscar número
		System.out.println("Digite o número que deseja encontrar: ");
		int numero = leia.nextInt();
		
		// Mostrar itens do vetor
		for(int indice = 0; indice <10; indice++) {
			if (vetorBusca[indice] == numero) {
			System.out.println("O número " + numero + " está na posição: " + indice);
			return; 
		}
	}
	
	// caso o número não seja encontrado
	System.out.println("O número " + numero + "não foi encontrado!");
	}
}