package Abstract;
// Classe Abstrata que serve de molde para a cria��o de outras classes
// Objetos n�o podem ser criados a partir de classes abstratas!
public abstract class Produto {
	// Vari�veis privadas da classe
	private int codigo;
	private double preco;
	
	// getters e setters das vari�veis privadas
	public void setCodigo(int codigo) { this.codigo = codigo; } 
	public void setPre�o(double preco) { this.preco = preco; } 
	public int getCodigo () { return codigo; }
	public double getPreco () { return preco; }
	
	// M�todo Abstrato. M�todos abstratos n�o possuem desenvolvimento, eles s�o apenas criados
	public abstract void atualizaPreco(double preco);
}
