package Modificadores;

import java.util.Scanner;

public class AppFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Funcionario f1 = new Funcionario ();
		f1.setMat(sc.nextInt());
		System.out.println("Matricula: " + f1.getMat());
		
		f1.setNome(sc.next());
		System.out.println("Nome: " + f1.getNome());
		
		f1.setFuncao(sc.next());
		System.out.println("Funcao: " + f1.getFuncao());
		
		f1.setSalario(sc.nextDouble());
		System.out.println("Salário" + f1.getSalario());
		
		sc.close();
		
		// Sim, eu não exibi nenhum dos valores por preguiça... mas funciona!
	}

}
