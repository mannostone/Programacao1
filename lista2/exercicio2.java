package lista2;

import java.util.Scanner; // Biblioteca respons�vel pela inser��o de valores

public class exercicio2 {
	public static void main (String[] args) {
		
		int idade;
		Scanner sc = new Scanner (System.in); // Declarado o nome "sc" e a entrada do Scanner para a inser��o de valores
				
		System.out.println("Digite a sua idade: ");
		idade = sc.nextInt();
		sc.close(); //// Declarado o t�rmino de "sc" e a entrada de valores
		
		analisaIdade(idade); // println tem como fun��o chamar o m�todo (linha 19) que ir� fazer a verifica��o da idade do usu�rio
		}
	
		public static void analisaIdade (int idade) {
			
		System.out.println(idade >= 21 ? "Voc� � maior de idade" : "Voc� ainda � menor de idade");
		
		/* "?" equivale ao if e ":" ao else, por�m no lugar de escrever toda a fun��o, voc� apenas insere o comparativo dentro de um print
		  Se o comparativo for verdadeiro ele printar� "Voc� � maior de idade", do contr�rio printar� "Voc� � menor de idade"
		  Exemplo: idade = 21... saida: "Voc� � maior de idade"
		  Exemplo: idade = 20... saida: "Voc� ainda � menor de idade" */
	}

}
