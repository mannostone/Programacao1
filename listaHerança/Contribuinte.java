package listaHeran�a;

// exercicio 9

public class Contribuinte {

		String nome;
		String endereco;
		String telefone;
		double rendimento;
		
		public double calcularImposto() {
			return 0; // N�o desenvolvido
		}
		
		
		// get e set de nome
		public void setNome(String nome) {	this.nome = nome;	}
		public String getNome () {	return nome;	}
		
		// get e set de endere�o
		public void setEndereco(String endereco) {	this.endereco = endereco;	}
		public String getEndere�o() {	return endereco;	}
		
		// get e set de telefone
		public void setTelefone(String telefone) {	this.telefone = telefone;	}
		public String getTelefone () {	return telefone; 	}
		
		// get e set de rendimento
		public void setRendimento (double rendimento) {	this.rendimento = rendimento;	}
		public double getRendimento () {	return rendimento;	}
	}


