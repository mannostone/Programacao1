package Abstract;
// BaseCircular tem tudo o que cont�m na classe Piramide
public class BaseCircular extends Piramide {
	// vari�vel privada da classe BaseCircular.
	private double raio;
	
	// Conceito de Sobreescrita que s� funciona atrelada ao conceito de Heran�a
	@Override // nota��o
	public double calcularVolume () {
		// "return" ja est� devolvendo a express�o abaixo calculada
	return getPi() * raio * raio * getAltura();
	}
	
	// get e set da vari�vel privada
	public void setRaio (double raio) { this.raio = raio; }
	public double getRaio() { return raio; }
	
}
