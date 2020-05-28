package sobrecarga;
// Exemplo básico de Sobrecarga de métodos
public class soma {
	public int soma (int x, int y) { // a Assinatura contém duas variáveis de tipo int
		return (x+y)/2;
	}
	
	public String soma (String x, String y) { // a Assinatura contém duas variáveis de tipo String
		int xa = Integer.parseInt(x); // Conversão de Wrapper para primitivo
		int ya = Integer.parseInt(y); // Veja conversão de wrapper para primitivo em -> jOptionPane>Anotacoes
		
		int s = xa+ya; // Soma dos valores convertidos
		
		return ""+s; 
	}
	
	public double soma (double x, double y) { // a Assinatura contém duas variáveis de tipo Double
		return (x+y)/2; 
	}
}
