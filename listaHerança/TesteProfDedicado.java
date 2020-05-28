package listaHerança;

// exercicio 8

import java.util.Scanner;

public class TesteProfDedicado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		profDedicado p = new profDedicado();
		
		System.out.println("Digite a matricula: ");
		p.setMatr(sc.next());
		
		System.out.println("Digite o nome: ");
		p.setNome(sc.next());
		
		System.out.println("Digite a idade: ");
		p.setIdade(sc.nextInt());
		
		System.out.println("Digite o salario bruto: ");
		p.setSalarioBruto(sc.nextDouble());
		
		System.out.println("Digite o desconto ");
		p.setDesconto(sc.nextInt());
		
		System.out.println();
		p.exibirProfessor();
		System.out.println("Salario com desconto: " + p.calculaSalario());
		
		sc.close();
	}

}
