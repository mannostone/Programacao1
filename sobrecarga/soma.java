package sobrecarga;
// Exemplo b�sico de Sobrecarga de m�todos
public class soma {
	public int soma (int x, int y) { // a Assinatura cont�m duas vari�veis de tipo int
		return (x+y)/2;
	}
	
	public String soma (String x, String y) { // a Assinatura cont�m duas vari�veis de tipo String
		int xa = Integer.parseInt(x); // Convers�o de Wrapper para primitivo
		int ya = Integer.parseInt(y); // Veja convers�o de wrapper para primitivo em -> jOptionPane>Anotacoes
		
		int s = xa+ya; // Soma dos valores convertidos
		
		return ""+s; 
	}
	
	public double soma (double x, double y) { // a Assinatura cont�m duas vari�veis de tipo Double
		return (x+y)/2; 
	}
}
