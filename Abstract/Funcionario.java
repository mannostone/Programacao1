package Abstract;
// Classe Abstract que serve de molde para outras classes. 
// Atenção! Não é possível instanciar objetos desta classe
public abstract class Funcionario {
	// Variáveis privadas da Classe
	private String matricula;
	private String nome;
	private String endereco;
	// Método abstrato necessário para "validar" uma classe abstrata
	// Métodos abstratos não possuem desenvolvimento, eles são apenas criados.
	public abstract double calculaSalario ();
	
	// getters e setters das classes privadas
	public void setMatricula (String matricula) { this.matricula = matricula; }
	public void setNome (String nome) { this.nome = nome; }
	public void setEndereço (String endereco) { this.endereco = endereco; }
	public String getMatricula () { return matricula; }
	public String getNome () { return nome; }
	public String getEndereco () { return endereco; }
}
