package listaHerança;

// exercicio 10

import java.util.Scanner;

public class TesteContribuinte {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// teste para pessoa física
		pessoaFisica pF = new pessoaFisica();
		
		System.out.println("Digite o seu nome: ");
		pF.setNome(sc.next());
		
		System.out.println("Digite o seu endereço: ");
		pF.setEndereco(sc.next());
		
		System.out.println("Digite o seu telefone: ");
		pF.setTelefone(sc.next());
		
		System.out.println("Digite o seu CPF: ");
		pF.cpf = sc.next();
		
		System.out.println("Digite o seu rendimento");
		pF.setRendimento(sc.nextDouble());
		
		System.out.println();
		System.out.println(pF.calcularImposto());
		
		sc.close();
	}

}
