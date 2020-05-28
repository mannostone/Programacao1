package sobreposicao;

// exercicio 2

public class Rica extends Pessoa{
	private double dinheiro;
	
	public void fazCompras () {
		System.out.println("Torrando a grana...");
	}
	
	// set e get de dinheiro
	public void setDinheiro (double dinheiro) {
		this.dinheiro = dinheiro;
	}
	public double getDinheiro () {
		return dinheiro;
	}
}
