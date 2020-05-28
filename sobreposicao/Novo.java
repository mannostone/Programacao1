package sobreposicao;

// exercicio 4

public class Novo extends Imovel{
	
	double adicional;
	
	public void valorAdicional () {
		adicional = (int) (Math.random()*150000);
	}
	
	public void valorTotal () {
		System.out.printf ("Valor total do imóvel novo: R$%.2f\n", (preco + adicional));
	}
	
}
