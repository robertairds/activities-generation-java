package entradaSaida;

import java.util.Scanner;

public class AulaOperadores {

	public static void main(String[] args) {
		
		// Variaveis
		float celsius, fahrenheit;
		
		Scanner leia = new Scanner(System.in);
		
		// Entrada de Dados
		System.out.println("Digite a temperatura em Celsius: ");
		celsius = leia.nextFloat();
		
		// Processamento 
		fahrenheit = celsius * 1.8f + 32;
		
		// Saida de dados
		System.out.println("Temperatura em Fahrenheit é: " + fahrenheit);
		
		


	}

}
