package sobreposicao;

// exercicio 2

public class Animal {
	
	private String nome;
	private String raca;
	
	// Sobrecarga de m�todos
	public void Animal () {
		System.out.println("N�o entendi"); // pregui�a bateu
	}
	public void Animal (String animal) {
		System.out.println("Nome do pulgento: " + animal);
	}
	
	// M�todo do exerc�cio
	public String caminha () {	return "caminhando";	}
	
	// getters e setters
	public void setNome (String nome) {	this.nome = nome;	}
	public String getNome () {	return "O " + nome + " chegou.";	} // texto n�o necess�rio
	public void setRaca (String raca) {	this.raca = raca;	}
	public String getRaca () {	return "Ele � um " + raca;	} // texto n�o necess�rio
}
