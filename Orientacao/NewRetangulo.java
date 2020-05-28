package Orientacao;

public class NewRetangulo {	
	int base, altura ; 

	// Os métodos são utilizados no "NewUsaRetangulo" e também podem ser testados no "AppListaOrientação"
	public void exibeArea() {
		System.out.println("Área do retângulo: " + (base*altura)); // Método que irá exibir o a área do objeto
	}
	
	public void exibePerimetro() {
		System.out.println("Perímetro do retângulo: " + ((2 * base) + (2 * altura))); // Método que irá exibir o a área do objeto calculado
	}
}
