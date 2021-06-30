package sobrecarga;

public class maquinaCafe {
	
	int acucarDisponivel;
	/* Conceito de sobrecarga de m�todos!
	 * M�todos com o mesmo nome podem ter comportamentos diferentes dependendo da sua assinatura
	 * A sobrecarga acontece quando temos m�todos em UMA Classe com o mesmo nome. */
	
	// M�todo que est� chamando outro m�todo
	public void fazerCafe() {
		fazerCafe(10); // Chamada ao m�todo fazerCafe(int)
	}	
	
	// M�todo a ser chamado pela linha 12
	public void fazerCafe ( int quantidadeAcucar ) {
		
		if (acucarDisponivel =< quantidadeAcucar) 
			System.out.println("N�o h� a�ucar suficiente para fazer o seu caf�");
			
		else
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo um caf�zinho com " + quantidadeAcucar + " gramas de a�ucar");
	}
	
}
