package sobreposicao;

// exercicio 3

public class CamaroteInferior extends Vip {
	
	
	public void localizacao () {
		System.out.printf("Local do assento: %d%s\n", ((int) (Math.random()*100)), (char)(Math.random()*6 + 65));
	}
}
