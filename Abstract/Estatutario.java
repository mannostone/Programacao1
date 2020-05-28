package Abstract;
// Estatutario contém tudo que existe em Professor
public class Estatutario extends Professor {
	// variáveis da classe privada
	private float trienio;
	private float rioPrev;
	
	// Notação de Sobreescrita. Diretamente ligada ao conceito de Herança
	@Override
	public double calculaSalario () { return getCargaHoraria()*getValorDaHora() + trienio - rioPrev; }
	
	// getters e setters das variáveis privadas
	public void setTrienio (float trienio) { this.trienio = trienio; }
	public void setRioPrev (float rioPrev) {this.rioPrev = rioPrev; }
	public float getTrienio () { return trienio; }
	public float getRioPrev () { return rioPrev; }
	
}
