package listaHeran�a;

// Exercicio 1

public class Professor {
	
	private String matr;
	private String nome;
	private int idade;
	private double salarioBruto;
	private int desconto;
	
	// M�todo
	public double calculaSalario () {
		return salarioBruto - (salarioBruto*desconto/100);
	}
	
	// M�todo Construtor
	public Professor () {
		this.matr = "2019";
		this.nome = "Jorge";
		this.idade = 21;
		this.salarioBruto = 3000; // Sonhei alto
		this.desconto = 10;
	}
}
