package Modificadores;

public class Motor {
	
	private int RPM;
	public String fabr;
	public int voltagem;
	String motorStatus;
	
	// M�todo para inserir o valor em RPM
	public void setVelocidade (int RPM) {
		this.RPM = RPM;
	}
	
	// Status liga/desliga do motor
	public void liga (String motorStatus) {
		System.out.println("O motor est� ligado!");
	}
	public void desliga (String motorStatus) {
		System.out.println("O motor est� desligado!");
	}
	
	// M�todo para verificar velocidade
	public int verificaVelocidade () {
		return RPM;
	}
	
}
