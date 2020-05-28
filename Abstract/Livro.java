package Abstract;
// Livro cont�m tudo que existe em Produto
public class Livro extends Produto {
	// Vari�veis da classe privada
	private String autor;
	private long isbn;
	
	// getters e setters das vari�veis privadas
	public void setAutor (String autor) { this.autor = autor; }
	public void setIsbn (long isbn) { this.isbn = isbn; }
	public String getAutor () { return autor; }
	public long getIsbn () { return isbn; }
	
	// Nota��o de Sobreescrita. Diretamente ligada ao conceito de Heran�a
	@Override
	public void atualizaPreco(double preco) {
		// sem desenvolvimento por pregui�a, perd�o...
	}
}
