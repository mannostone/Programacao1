package sobreposicao;

// exercicio 2

public class Animal {
	
	private String nome;
	private String raca;
	
	// Sobrecarga de métodos
	public void Animal () {
		System.out.println("Não entendi"); // preguiça bateu
	}
	public void Animal (String animal) {
		System.out.println("Nome do pulgento: " + animal);
	}
	
	// Método do exercício
	public String caminha () {	return "caminhando";	}
	
	// getters e setters
	public void setNome (String nome) {	this.nome = nome;	}
	public String getNome () {	return "O " + nome + " chegou.";	} // texto não necessário
	public void setRaca (String raca) {	this.raca = raca;	}
	public String getRaca () {	return "Ele é um " + raca;	} // texto não necessário
}
