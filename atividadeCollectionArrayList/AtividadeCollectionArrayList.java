package atividadeCollectionArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtividadeCollectionArrayList {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		// Criar a Colleciton ArrayList do tipo string
		ArrayList<String> cores = new ArrayList<String>();
		
		for (int indice = 1; indice <= 5; indice++) {
			System.out.print("Digite a " + indice + "° cor: ");
			String cor = leia.nextLine();
			cores.add(cor);
		}
		System.out.println("\nListar todas as cores: ");
		for (String cor: cores) {
			System.out.println(cor);
		}
		Collections.sort(cores);
		
		System.out.println("\nOrdenar as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
	}
}
