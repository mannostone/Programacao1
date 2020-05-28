package lista2;

import java.util.Scanner; // Biblioteca responsável pela inserção de valores

public class exercicio2 {
	public static void main (String[] args) {
		
		int idade;
		Scanner sc = new Scanner (System.in); // Declarado o nome "sc" e a entrada do Scanner para a inserção de valores
				
		System.out.println("Digite a sua idade: ");
		idade = sc.nextInt();
		sc.close(); //// Declarado o término de "sc" e a entrada de valores
		
		analisaIdade(idade); // println tem como função chamar o método (linha 19) que irá fazer a verificação da idade do usuário
		}
	
		public static void analisaIdade (int idade) {
			
		System.out.println(idade >= 21 ? "Você é maior de idade" : "Você ainda é menor de idade");
		
		/* "?" equivale ao if e ":" ao else, porém no lugar de escrever toda a função, você apenas insere o comparativo dentro de um print
		  Se o comparativo for verdadeiro ele printará "Você é maior de idade", do contrário printará "Você é menor de idade"
		  Exemplo: idade = 21... saida: "Você é maior de idade"
		  Exemplo: idade = 20... saida: "Você ainda é menor de idade" */
	}

}
