package atividadeCollectionSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AtividadeCollectionSet {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		System.out.println("Digite 10 valores inteiros não repetidos:  ");
		
		for(int i = 0; i < 10; i++) {
			int valor = leia.nextInt();
			numeros.add(valor);
		}
		System.out.println("\nListar dados do Set: ");
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
	}
}
