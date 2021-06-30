package listaHerança;

// exercicio 9

public class pessoaFisica extends Contribuinte {
	String cpf;
	
	public double calcularImposto() {
		// Não há taxas
		if (rendimento <= 1000) {}
		
		else if (rendimento >= 1000.01 && rendimento <= 2500.00) {
			rendimento = rendimento*0.90;
		}
		
		else if (rendimento >= 2500.01 && rendimento <= 5000.00) {
			rendimento = rendimento*0.84;
		}
		// Se maior que 5000.01
		else {
			rendimento = rendimento*0.80;
		}
		
		return rendimento
	}
	
	
}
