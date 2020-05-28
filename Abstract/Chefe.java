package Abstract;
// Chefe contém tudo que existe em empregado
public class Chefe extends Empregado {
	// variável privada da classe
	private double salarioMensal;
	
	// sobrecarga de construtores
	public Chefe () {
		setNome("0");
		setEndereco("0");
	}
	public Chefe (String nome, String endereco) {
		setNome (nome);
		setEndereco(endereco);
	}
	
	// Notação de Sobreescrita
	@Override
	public void calcularSalario (double salario) {
		salarioMensal = salario;
		System.out.println("Salário: " + salarioMensal);
	}
	
	// get e set da variável privada
	public void setSalarioMensal (double salarioMensal) { this.salarioMensal = salarioMensal; }
	public double getSalarioMensal () { return salarioMensal; }
}
