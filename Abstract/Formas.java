package Abstract;
// Classe abstrata que est� servindo de molde para outras classes
public abstract class Formas {
	// vari�vel privada da classe
	private double pi = 3.14;
	
	public abstract double calcularVolume();
	
	/* get da classe privada.
	 * poderia ser definida como "public final double getPi () { return pi; }"
	 * J� que o valor de Pi nunca ir� mudar. */
	public double getPi () { return pi; }
}
