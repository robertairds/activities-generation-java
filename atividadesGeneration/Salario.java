package atividadesGeneration;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// declarando as variaveis
		Scanner leia = new Scanner(System.in);
		
		// Variaveis
		float salario;
		float abono;
		float novoSalario;
		
		// entrada de dados
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		// processamento
		novoSalario = salario + abono;
		
		// saida de dados
		System.out.print("Novo Salário: ");
		System.out.println(novoSalario);

	}

}
