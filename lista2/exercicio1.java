package lista2;

import java.util.Scanner; // Biblioteca respons�vel pela inser��o de valores

public class exercicio1 {
	public static void main (String[] args) {
		
		int idade;
		Scanner sc = new Scanner (System.in); // Declarado o nome "sc" e a entrada do Scanner para a inser��o de valores
				
		System.out.println("Digite a sua idade: ");
		idade = sc.nextInt();
		sc.close(); //// Declarado o t�rmino de "sc" e a entrada de valores
		
		analisaIdade(idade); // Comando que ir� retornar o comparativo feito no m�todo analisaIdade
	}
	// M�todo que ir� fazer a compara��o solicitada
	public static void analisaIdade (int idade) {
			
		if (idade >= 21)	
		{
			System.out.println("Voc� ja � maior de idade");
		}
		else
		{
			System.out.println("Voc� ainda � menor de idade");
		}
	}
}