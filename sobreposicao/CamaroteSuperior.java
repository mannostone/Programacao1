package sobreposicao;

// exercicio 3

public class CamaroteSuperior extends Vip {
	
	@Override
	public void ingressoVip () {
		System.out.printf("Preço do camarote superior: R$%.2f\n", reais+25);
	}
	
}
