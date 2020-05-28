package Abstract;
// Classe Abstract que serve de molde para outras classes. 
// Aten��o! N�o � poss�vel instanciar objetos desta classe
public abstract class Funcionario {
	// Vari�veis privadas da Classe
	private String matricula;
	private String nome;
	private String endereco;
	// M�todo abstrato necess�rio para "validar" uma classe abstrata
	// M�todos abstratos n�o possuem desenvolvimento, eles s�o apenas criados.
	public abstract double calculaSalario ();
	
	// getters e setters das classes privadas
	public void setMatricula (String matricula) { this.matricula = matricula; }
	public void setNome (String nome) { this.nome = nome; }
	public void setEndere�o (String endereco) { this.endereco = endereco; }
	public String getMatricula () { return matricula; }
	public String getNome () { return nome; }
	public String getEndereco () { return endereco; }
}
