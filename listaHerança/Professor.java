package listaHerança;

// Exercicio 1

public class Professor {
	
	private String matr;
	private String nome;
	private int idade;
	private double salarioBruto;
	private int desconto;
	
	// Método
	public double calculaSalario () {
		return salarioBruto - (salarioBruto*desconto/100);
	}
	
	// Método Construtor
	public Professor () {
		this.matr = "2019";
		this.nome = "Jorge";
		this.idade = 21;
		this.salarioBruto = 3000; // Sonhei alto
		this.desconto = 10;
	}
}
