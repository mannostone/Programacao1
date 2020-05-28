package Abstract;
// Livro contém tudo que existe em Produto
public class Livro extends Produto {
	// Variáveis da classe privada
	private String autor;
	private long isbn;
	
	// getters e setters das variáveis privadas
	public void setAutor (String autor) { this.autor = autor; }
	public void setIsbn (long isbn) { this.isbn = isbn; }
	public String getAutor () { return autor; }
	public long getIsbn () { return isbn; }
	
	// Notação de Sobreescrita. Diretamente ligada ao conceito de Herança
	@Override
	public void atualizaPreco(double preco) {
		// sem desenvolvimento por preguiça, perdão...
	}
}
