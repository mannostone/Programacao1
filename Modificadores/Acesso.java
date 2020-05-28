package Modificadores;

public class Acesso {
	String nome;
	String sobreNome;
	private int cpf;
	double salario;

	// get nao possui atributos mas possui retorno e sempre é publico
	public int getCpf() {
		return cpf;
		}

	// set possui atributos e nao possui retornos por tratar de uma entrada de valores
	public void setCpf (int cpf) {
		this.cpf = cpf;
		}
}