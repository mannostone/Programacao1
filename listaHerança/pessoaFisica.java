package listaHerança;

// exercicio 9

public class pessoaFisica extends Contribuinte {
	String cpf;
	
	public double calcularImposto() {
		
		if (rendimento <= 1000) {
			return rendimento;
		}
		
		else if (rendimento > 1000.01 && rendimento <= 2500.00) {
			return rendimento = rendimento*0.90;
		}
		
		else if (rendimento > 2500.01 && rendimento <= 5000.00) {
			return rendimento = rendimento*0.84;
		}
		
		else
			return rendimento = rendimento*0.80;
	}
	
	
}
