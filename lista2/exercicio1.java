package lista2;

import java.util.Scanner; // Biblioteca responsável pela inserção de valores

public class exercicio1 {
	public static void main (String[] args) {
		
		int idade;
		Scanner sc = new Scanner (System.in); // Declarado o nome "sc" e a entrada do Scanner para a inserção de valores
				
		System.out.println("Digite a sua idade: ");
		idade = sc.nextInt();
		sc.close(); //// Declarado o término de "sc" e a entrada de valores
		
		analisaIdade(idade); // Comando que irá retornar o comparativo feito no método analisaIdade
	}
	// Método que irá fazer a comparação solicitada
	public static void analisaIdade (int idade) {
			
		if (idade >= 21)	
		{
			System.out.println("Você ja é maior de idade");
		}
		else
		{
			System.out.println("Você ainda é menor de idade");
		}
	}
}