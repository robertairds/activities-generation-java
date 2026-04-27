package atividadePilha;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class AtividadePilha {

	public static void main(String[] args) {
		Deque<String> pilha = new ArrayDeque<String>();
		Scanner leia = new Scanner(System.in);
		int op = -1;

		while (op != 0) {
			System.out.println("            1 - Adicionar Livro na pilha");
			System.out.println("            2 - Listar todos os Livros");
			System.out.println("            3 - Retirar Livro da pilha");
			System.out.println("            0 - Sair");
			System.out.print("Entre com a opção desejada: ");

			op = leia.nextInt();
			leia.nextLine(); // Limpa o cache

			if (op == 1) {
				System.out.print("Digite o nome: ");
				String nome = leia.nextLine();
				pilha.push(nome); // Adiciona no topo
				System.out.println("\nPilha:");
				for (String livro : pilha) {
					System.out.println(livro);
				}
				System.out.println("\nLivro adicionado!\n");

			} else if (op == 2) {
				if (pilha.isEmpty()) {
					System.out.println("\nA Pilha está vazia!\n");
				} else {
					System.out.println("\nLista de Livros na Pilha:");
					for (String livro : pilha) {
						System.out.println(livro);
					}
					System.out.println();
				}

			} else if (op == 3) {
				if (pilha.isEmpty()) {
					System.out.println("\nA Pilha está vazia!\n");
				} else {
					pilha.pop(); // Remove do topo
					System.out.println("\nPilha:");
					for (String livro : pilha) {
						System.out.println(livro);
					}
					System.out.println("\nUm Livro foi retirado da pilha!\n");
				}
			}
		}

		System.out.println("\nPrograma Finalizado!");
		leia.close();
	}
}