package Abstract;
// Classe Abstrata que serve de molde para a criação de outras classes
// Objetos não podem ser criados a partir de classes abstratas!
public abstract class Produto {
	// Variáveis privadas da classe
	private int codigo;
	private double preco;
	
	// getters e setters das variáveis privadas
	public void setCodigo(int codigo) { this.codigo = codigo; } 
	public void setPreço(double preco) { this.preco = preco; } 
	public int getCodigo () { return codigo; }
	public double getPreco () { return preco; }
	
	// Método Abstrato. Métodos abstratos não possuem desenvolvimento, eles são apenas criados
	public abstract void atualizaPreco(double preco);
}
