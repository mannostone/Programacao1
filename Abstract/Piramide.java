package Abstract;
// Piramide contém tudo que existe em FormasTridimensionais
public class Piramide extends FormasTridimensionais {
	// Variável da classe privada
	private double lado;
	
	// Notação de Sobreescrita
	@Override
	public double calcularVolume () {	return getAltura() / 3 * lado;		}
	
	// get e set da variável privada
	public void setLado (double lado) { this.lado = lado; }
	public double getLado () { return lado; }
}
