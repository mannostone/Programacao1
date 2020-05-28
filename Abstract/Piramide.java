package Abstract;
// Piramide cont�m tudo que existe em FormasTridimensionais
public class Piramide extends FormasTridimensionais {
	// Vari�vel da classe privada
	private double lado;
	
	// Nota��o de Sobreescrita
	@Override
	public double calcularVolume () {	return getAltura() / 3 * lado;		}
	
	// get e set da vari�vel privada
	public void setLado (double lado) { this.lado = lado; }
	public double getLado () { return lado; }
}
