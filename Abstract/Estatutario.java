package Abstract;
// Estatutario cont�m tudo que existe em Professor
public class Estatutario extends Professor {
	// vari�veis da classe privada
	private float trienio;
	private float rioPrev;
	
	// Nota��o de Sobreescrita. Diretamente ligada ao conceito de Heran�a
	@Override
	public double calculaSalario () { return getCargaHoraria()*getValorDaHora() + trienio - rioPrev; }
	
	// getters e setters das vari�veis privadas
	public void setTrienio (float trienio) { this.trienio = trienio; }
	public void setRioPrev (float rioPrev) {this.rioPrev = rioPrev; }
	public float getTrienio () { return trienio; }
	public float getRioPrev () { return rioPrev; }
	
}
