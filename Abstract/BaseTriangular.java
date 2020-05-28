package Abstract;
// BaseTriangular contém tudo que existe em Piramide
public class BaseTriangular extends Piramide {
	// Variável privada da classe
	private double base;
	// Notação
	@Override
	public double calcularVolume () {
		// "return" está devolvendo a expressão ja calculada
	return (base * base) / 2 * getAltura();
	}
	
	// get e set da variável privada 
	public void setBase (double base) { this.base = base; }
	public double getBase ( ) { return base; }
	
}
