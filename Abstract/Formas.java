package Abstract;
// Classe abstrata que está servindo de molde para outras classes
public abstract class Formas {
	// variável privada da classe
	private double pi = 3.14;
	
	public abstract double calcularVolume();
	
	/* get da classe privada.
	 * poderia ser definida como "public final double getPi () { return pi; }"
	 * Já que o valor de Pi nunca irá mudar. */
	public double getPi () { return pi; }
}
