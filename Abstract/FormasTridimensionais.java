package Abstract;
// FormasTridimensionais cont�m tudo que existe em Formas
public abstract class FormasTridimensionais extends Formas{
	// Vari�vel privada da Classe
	private double altura;
	
	// get e set da vari�vel privada
	public void setAltura (double altura) { this.altura = altura; }
	public double getAltura () { return altura; }
}
