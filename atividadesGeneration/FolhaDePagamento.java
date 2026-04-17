package atividadesGeneration;

import java.util.Scanner;

public class FolhaDePagamento {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// variaveis
		
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;
		
		// entrada de dados
		System.out.println("Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Descontos: ");
		descontos = leia.nextFloat();
		
		// processamento: SALÁRIO BRUTO + ADICIONAL NOTURNO + (HORAS EXTRAS * 5) - DESCONTOS
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		// saida de dados
		System.out.printf("Salário Liquido: %.2f\n", salarioLiquido);
	}

}
