package listaHeran�a;

// exercicio 8

import java.util.Scanner;

public class TesteProfHorista {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		profHorista p = new profHorista();
		
		System.out.println("Digite a matricula: ");
		p.setMatr(sc.next());
		
		System.out.println("Digite o nome: ");
		p.setNome(sc.next());
		
		System.out.println("Digite a idade: ");
		p.setIdade(sc.nextInt());
		
		System.out.println("Digite o desconto ");
		p.setDesconto(sc.nextInt());
		
		// Optei por usar esses valores para substituir o Sal�rio Bruto
		System.out.println("Digite a quantidaded de horas trabalhadas");
		p.horasTrabalhadas = sc.nextInt();
		System.out.println("Digite o valor/hora trabalho");
		p.valorHora = sc.nextInt();
		
		//Atribui��o dos valores da linha 27 e 29 a vari�vel salario Bruto
		p.setSalarioBruto(p.valorHora * p.horasTrabalhadas);
		
		System.out.println();
		p.exibirProfessor();
		System.out.println("Salario com desconto: " + p.calculaSalario());
		
		sc.close();

	}

}
