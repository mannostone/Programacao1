package Abstract;
// Classe Abstrata que est� servindo de molde para outras classes
public abstract class Empregado {
	// Vari�veis da classe privada
	private String nome;
	private String endereco;
	
	// M�todo Abstrato. Um m�todo abstrato � necess�rio para "validar" uma classe abstrata. (linha 2)
	public abstract void calcularSalario (double salario);
	
	// sobrecarga de construtores
	public Empregado () {
		this.nome = "0";
		this.endereco = "0";
	}
	public Empregado (String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	// getters e setters
	public void setNome (String nome) { this.nome = nome; }
	public void setEndereco (String endereco) { this.endereco = endereco; }
	public String getNome () { return nome; }
	public String getEndereco () { return endereco; }
}

