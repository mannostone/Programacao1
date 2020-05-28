package Abstract;
// BaseCircular tem tudo o que contém na classe Piramide
public class BaseCircular extends Piramide {
	// variável privada da classe BaseCircular.
	private double raio;
	
	// Conceito de Sobreescrita que só funciona atrelada ao conceito de Herança
	@Override // notação
	public double calcularVolume () {
		// "return" ja está devolvendo a expressão abaixo calculada
	return getPi() * raio * raio * getAltura();
	}
	
	// get e set da variável privada
	public void setRaio (double raio) { this.raio = raio; }
	public double getRaio() { return raio; }
	
}
