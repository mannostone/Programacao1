package sobreposicao;

//exercicio 1

	public abstract class Funcionario {
	
	private String matricula;
	private String nome;
	private String funcao;
	
	public abstract void exibeDados();

	// set e get de matricula
	public void setMatricula (String matricula) {
		this.matricula = matricula;
	}
	public String getMatricula () {
		return "A matr�cula �: " + matricula;
	}
	
	// set e get de nome
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getNome () {
		return "Nome: " + nome;
	}
	
	// set e get de fun��o
	public void setFuncao (String funcao) {
		this.funcao = funcao;
	}
	public String getFuncao () {
		return "A fun��o desse funcion�rio �: " + funcao;
	}
}
	