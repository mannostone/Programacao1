package sobreposicao;

// exercicio 4

public class Velho extends Imovel {
	
	double desconto = 0.80; // desconto de 20%
	
	
	public void valorTotal () {
		System.out.println("Valor do imóvel com desconto: R$ " + (preco*desconto));
	}
	
}
