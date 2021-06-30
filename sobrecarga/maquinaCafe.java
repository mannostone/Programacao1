package sobrecarga;

public class maquinaCafe {
	
	int acucarDisponivel;
	/* Conceito de sobrecarga de métodos!
	 * Métodos com o mesmo nome podem ter comportamentos diferentes dependendo da sua assinatura
	 * A sobrecarga acontece quando temos métodos em UMA Classe com o mesmo nome. */
	
	// Método que está chamando outro método
	public void fazerCafe() {
		fazerCafe(10); // Chamada ao método fazerCafe(int)
	}	
	
	// Método a ser chamado pela linha 12
	public void fazerCafe ( int quantidadeAcucar ) {
		
		if (acucarDisponivel =< quantidadeAcucar) 
			System.out.println("Não há açucar suficiente para fazer o seu café");
			
		else
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo um cafézinho com " + quantidadeAcucar + " gramas de açucar");
	}
	
}
