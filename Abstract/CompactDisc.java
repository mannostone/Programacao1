package Abstract;
// CompactDisc cont�m tudo que existe em Produto
public class CompactDisc extends Produto {
	
	// vari�veis privadas da classe
	private String artista;
	private String gravadora;
	
	// getters e setters das vari�veis privadas
	public void setArtista (String artista) { this.artista = artista; }
	public void setGravadora (String gravadora) { this.gravadora = gravadora; }
	public String getArtista () { return artista; }
	public String getGravadora () { return gravadora; }
	
	// Nota��o de Sobreescrita
	@Override
	public void atualizaPreco(double preco) {
		System.out.println("CompactDisc"); // Print de teste, m�todo n�o desenvolvido
	}
	
}
