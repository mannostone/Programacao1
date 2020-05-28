package listaConstrutores;
import java.util.Scanner;

public class NewUsaRetangulo {
	public static void main (String [] args) {
	// Entrada de dados via Scanner
	Scanner sc = new Scanner (System.in);
	
	// Objeto criado
	NewRetangulo r1 = new NewRetangulo(); 
	
	// Instancia alocada em "base"
	System.out.println("Digite um valor para base: ");
	r1.base = sc.nextInt(); 
	
	// Instancia alocada em "altura"
	System.out.println("Digite um valor para altura: ");
	r1.altura = sc.nextInt(); 
	
	// Término da entrada de dados via Scanner
	sc.close();
	
	// Exibição dos valores informados
	System.out.println("Base: " + r1.base + "\nAltura: " + r1.altura); 
	
	// Comando que exibirá o método exibeArea com retorno void
	r1.exibeArea(); 
	
	// Comando que exibirá o método exibePerimetro com retorno void
	r1.exibePerimetro(); 
	
	
	
	}
}
