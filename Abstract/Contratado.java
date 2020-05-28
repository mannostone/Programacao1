package Abstract;
// Contratado contém tudo que existe em Professor
public class Contratado extends Professor {
	// Variável privada da classe
	private float inss;
	
	/* Notação de Sobreescrita de métodos
	 "return" está devolvendo a expressão calculada, onde foi necessário buscar os dados de
	carga horária e valor da hora através dos métodos getters */
	@Override
	public double calculaSalario () { return ((getCargaHoraria()*getValorDaHora())-inss); }
	
	// get e set da classe privada
	public void setInss (float inss) { this.inss = inss; }
	public float getInss () { return inss; }
}
