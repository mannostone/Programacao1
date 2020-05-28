package Abstract;
// Contratado cont�m tudo que existe em Professor
public class Contratado extends Professor {
	// Vari�vel privada da classe
	private float inss;
	
	/* Nota��o de Sobreescrita de m�todos
	 "return" est� devolvendo a express�o calculada, onde foi necess�rio buscar os dados de
	carga hor�ria e valor da hora atrav�s dos m�todos getters */
	@Override
	public double calculaSalario () { return ((getCargaHoraria()*getValorDaHora())-inss); }
	
	// get e set da classe privada
	public void setInss (float inss) { this.inss = inss; }
	public float getInss () { return inss; }
}
