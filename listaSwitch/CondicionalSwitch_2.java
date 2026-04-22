package atividadesGeneration.listaSwitch;

import java.util.Scanner;

public class CondicionalSwitch_2 {

	public static void main(String[] args) {
		
		String nome;
		int codigo;
		float salario, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("# ## ### #### #########   Cargos   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para Gerente--");
		System.out.println("--Digite 2 para Vendedor--");
		System.out.println("--Digite 3 para Supervisor--");
		System.out.println("--Digite 4 para Motorista--");
		System.out.println("--Digite 5 para Estoquista--");
		System.out.println("--Digite 6 para Técnico de TI--");
		
		System.out.println("Digite o nome do colaborador: ");
		nome = leia.nextLine();

		System.out.println("Digite o código do cargo: ");
		codigo = leia.nextInt();

		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		switch (codigo) {
		
		case 1:
			novoSalario = salario + (salario * 0.10f);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			System.out.println("Salário: R$ " + String.format("%.2f", novoSalario));
			break;
			
		case 2:
			novoSalario = salario + (salario * 0.07f);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			System.out.println("Salário: R$ " + String.format("%.2f", novoSalario));
			break;
			
		case 3:
			novoSalario = salario + (salario * 0.09f);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			System.out.println("Salário: R$ " + String.format("%.2f", novoSalario));
			break;
			
		case 4:
			novoSalario = salario + (salario * 0.06f);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			System.out.println("Salário: R$ " + String.format("%.2f", novoSalario));
			break;
			
		case 5:
			novoSalario = salario + (salario * 0.05f);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			System.out.println("Salário: R$ " + String.format("%.2f", novoSalario));
			break;
			
		case 6:
			novoSalario = salario + (salario * 0.08f);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Técnico de TI");
			System.out.println("Salário: R$ " + String.format("%.2f", novoSalario));
			break;
			
		default:
			System.out.println("Opção inválida.");
			
		}
		
	}

}
