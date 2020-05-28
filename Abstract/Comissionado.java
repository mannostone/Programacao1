package Abstract;
// Comissionado contém tudo que existe em Empregado
public class Comissionado extends Empregado {
	
	// Variáveis privadas da classe
	private double salarioBase;
	private double comissao;
	private int quantidade;
	
	// sobrecarga de construtores
	public Comissionado () {
		setNome("0");
		setEndereco("0");
	}
	public Comissionado (String nome, String endereco) {
		setNome (nome);
		setEndereco(endereco);
	}
	
	// Notação de Sobreescrita
	@Override
	public void calcularSalario (double salario) {
		salario = salarioBase + comissao*quantidade;
		System.out.println("Salário: " + salario);
	}
	
	// getters e setters das variáveis privadas
	public void setSalarioBase (double salarioBase) { this.salarioBase = salarioBase; }
	public void setComissao (double comissao) { this.comissao = comissao; }
	public void setQuantidade (int quantidade) { this.quantidade = quantidade; }
	
	public double getSalarioBase () { return salarioBase; }
	public double getComissao () { return comissao; }
	public int getQuantidade () { return quantidade; }
}
