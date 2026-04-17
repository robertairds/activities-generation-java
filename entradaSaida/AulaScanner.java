package entradaSaida;

import java.util.Scanner; // importanto a classe Scanner para dentro da minha classe

public class AulaScanner {

	public static void main(String[] args) {
		// Declarando as Variaveis
		Scanner leia = new Scanner(System.in);
		
		String nome;
		
		// Entrada de dados 
		System.out.println("Digite o seu nome: ");
		
		// Processamento
		nome = leia.nextLine(); // lê o texto digitado
		
		// Saída de Dados
		System.out.println("Bom dia, " + nome + "!"); // (+) concatenar = juntar 
		
		leia.close();
		
	
		
		
		

	}

}
