package Abstract;
// FormasTridimensionais contém tudo que existe em Formas
public abstract class FormasTridimensionais extends Formas{
	// Variável privada da Classe
	private double altura;
	
	// get e set da variável privada
	public void setAltura (double altura) { this.altura = altura; }
	public double getAltura () { return altura; }
}
