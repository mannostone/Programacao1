package listaConstrutores;

import java.util.Scanner;

public class RetanguloPlus {
	Scanner sc = new Scanner (System.in);
	
	int base, altura;
	
	// Metódo Construtor
	public RetanguloPlus () {
		System.out.println("Digite um valor para base e outro para altura: ");
		base = sc.nextInt();
		altura = sc.nextInt();
	}
	
}
