package atividadesGeneration.listaSwitch;

import java.util.Scanner;

public class CondicionalSwitch_1 {

	public static void main(String[] args) {
		int codigo, quantidade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para Cachorro Quente--");
		System.out.println("--Digite 2 para X-Salada--");
		System.out.println("--Digite 3 para X-Bacon--");
		System.out.println("--Digite 4 para Bauru--");
		System.out.println("--Digite 5 para Refrigerante--");
		System.out.println("--Digite 6 para Suco de Laranja--");
		
		System.out.println("Digite o código do produto: ");
		codigo = leia.nextInt();
		
		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();
		
		switch (codigo) {

		case 1: 
			System.out.printf("Produto: Cachorro Quente - Total: R$ %.2f\n", quantidade * 10.0);
			break;
			
		case 2:
			System.out.printf("Produto: X-Salada - Total: R$ %.2f\n", quantidade * 15.0);
			break;

		case 3:
			System.out.printf("Produto: X-Bacon - Total: R$ %.2f\n", quantidade * 18.0);
			break;

		case 4:
			System.out.printf("Produto: Bauru - Total: R$ %.2f\n", quantidade * 12.0);
			break;

		case 5:
			System.out.printf("Produto: Refrigerante - Total: R$ %.2f\n", quantidade * 8.0);
			break;

		case 6:
			System.out.printf("Produto: Suco de Laranja - Total: R$ %.2f\n", quantidade * 13.0);
			break;

		default:
			System.out.println("Opção inválida.");
	

		}


	}

}
