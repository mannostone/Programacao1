package listaHerança;

// exercicio 5 e 7

public class ProfessorPlus {
	
	private String matr;
	private String nome;
	private int idade;
	private double salarioBruto;
	private int desconto;
	
	public double calculaSalario () {
		return salarioBruto - (salarioBruto*desconto/100);
	}
	
	//Construtor
	public ProfessorPlus () {
		this.matr = "2019";
		this.nome = "Jorge";
		this.idade = 21;
		this.salarioBruto = 3000;
		this.desconto = 10;
	}
	
	public void exibirProfessor() {
		System.out.println("Matricula: " + matr);
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario Bruto: " + salarioBruto);
		System.out.println("Desconto: " + desconto);
	}	
	
	
	// set e get de matricula
	public void setMatr (String matr) {
		this.matr = matr;
	}
	public String getMatr () {
		return matr;
	}
	
	// set e get de nome
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getNome () {
		return nome;
	}
	
	// set e get de idade
	public void setIdade (int idade) {
		this.idade = idade;
	}
	public int getIdade () {
		return idade;
	}
	
	// set e get de salarioBruto
	public void setSalarioBruto (double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getSalarioBruto () {
		return salarioBruto;
	}
	
	// set e get de desconto
	public void setDesconto (int desconto) {
		this.desconto = desconto;
	}
	public int getDesconto () {
		return desconto;
	}

}
