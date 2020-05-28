package Abstract;
// BaseTriangular cont�m tudo que existe em Piramide
public class BaseTriangular extends Piramide {
	// Vari�vel privada da classe
	private double base;
	// Nota��o
	@Override
	public double calcularVolume () {
		// "return" est� devolvendo a express�o ja calculada
	return (base * base) / 2 * getAltura();
	}
	
	// get e set da vari�vel privada 
	public void setBase (double base) { this.base = base; }
	public double getBase ( ) { return base; }
	
}
