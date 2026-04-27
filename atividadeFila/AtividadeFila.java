package atividadeFila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeFila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		Scanner leia = new Scanner(System.in);
		int op = -1;

		while (op != 0) {
			System.out.print("\n1: Add | 2: Listar | 3: Chamar | 0: Sair\nOpção: ");
			op = leia.nextInt();
			leia.nextLine();

			if (op == 1) {
				System.out.print("Nome: ");
				fila.add(leia.nextLine());
				System.out.println("Fila: " + fila + "\nCliente Adicionado!");
			} else if (op == 2) {
				if (fila.isEmpty())
					System.out.println("Fila vazia!");
				else
					fila.forEach(System.out::println);
			} else if (op == 3) {
				if (fila.isEmpty())
					System.out.println("A Fila está vazia!");
				else {
					fila.poll();
					System.out.println("Fila: " + fila + "\nCliente foi chamado!");
				}
			}
		}
		System.out.println("Programa Finalizado!");
	}
}
