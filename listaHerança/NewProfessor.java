package listaHeran�a;

// Exercicio 3

public class NewProfessor {
	private String matr;
	private String nome;
	private int idade;
	private double salarioBruto;
	private int desconto;
	
	public double calculaSalario () {
		return salarioBruto - (salarioBruto*desconto/100);
	}
	
	public NewProfessor () {
		this.matr = "2019";
		this.nome = "Jorge";
		this.idade = 21;
		this.salarioBruto = 3000;
		this.desconto = 10;
	}
	
	// M�todo adicional solicitado no exerc�cio 3
	public void exibirProfessor() {
		System.out.println("Matricula: " + matr);
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario Bruto: " + salarioBruto);
		System.out.println("Desconto: " + desconto);
	}	
}
