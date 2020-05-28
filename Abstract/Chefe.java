package Abstract;
// Chefe cont�m tudo que existe em empregado
public class Chefe extends Empregado {
	// vari�vel privada da classe
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
	
	// Nota��o de Sobreescrita
	@Override
	public void calcularSalario (double salario) {
		salarioMensal = salario;
		System.out.println("Sal�rio: " + salarioMensal);
	}
	
	// get e set da vari�vel privada
	public void setSalarioMensal (double salarioMensal) { this.salarioMensal = salarioMensal; }
	public double getSalarioMensal () { return salarioMensal; }
}
