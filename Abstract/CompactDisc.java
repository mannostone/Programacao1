package Abstract;
// CompactDisc contém tudo que existe em Produto
public class CompactDisc extends Produto {
	
	// variáveis privadas da classe
	private String artista;
	private String gravadora;
	
	// getters e setters das variáveis privadas
	public void setArtista (String artista) { this.artista = artista; }
	public void setGravadora (String gravadora) { this.gravadora = gravadora; }
	public String getArtista () { return artista; }
	public String getGravadora () { return gravadora; }
	
	// Notação de Sobreescrita
	@Override
	public void atualizaPreco(double preco) {
		System.out.println("CompactDisc"); // Print de teste, método não desenvolvido
	}
	
}
