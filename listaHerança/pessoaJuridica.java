package listaHerança;

// exercicio 9

public class pessoaJuridica extends Contribuinte {
	String cnpj;
	
	public double calcularImposto() {
		
		if (rendimento < 2500.00) {
			return rendimento;
		}
		
		else if (rendimento > 2500.01 && rendimento <= 7000.00) {
			return rendimento = rendimento*0.90;
		}
		
		else if (rendimento > 7000.01 && rendimento <= 15000.00) {
			return rendimento = rendimento*0.84;
		}
		
		else
			return rendimento = rendimento*0.80;
	}
	
}
