package Orientacao;

public class NewRetangulo {	
	int base, altura ; 

	// Os m�todos s�o utilizados no "NewUsaRetangulo" e tamb�m podem ser testados no "AppListaOrienta��o"
	public void exibeArea() {
		System.out.println("�rea do ret�ngulo: " + (base*altura)); // M�todo que ir� exibir o a �rea do objeto
	}
	
	public void exibePerimetro() {
		System.out.println("Per�metro do ret�ngulo: " + ((2 * base) + (2 * altura))); // M�todo que ir� exibir o a �rea do objeto calculado
	}
}
