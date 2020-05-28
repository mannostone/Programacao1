package Modificadores;

public class Funcionario {
	
	private int mat;
	private String nome, funcao;
	private double salario;
	
	// set e get de matricula
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getMat() {
		return mat;
	}
	
	// set e get de nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	// set e get de funcao
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getFuncao () {
		return funcao;
	}
	
	// set e get de salário
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario () {
		return salario;
	}
	
}
