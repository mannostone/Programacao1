package Modificadores;

public class Motor {
	
	private int RPM;
	public String fabr;
	public int voltagem;
	String motorStatus;
	
	// Método para inserir o valor em RPM
	public void setVelocidade (int RPM) {
		this.RPM = RPM;
	}
	
	// Status liga/desliga do motor
	public void liga (String motorStatus) {
		System.out.println("O motor está ligado!");
	}
	public void desliga (String motorStatus) {
		System.out.println("O motor está desligado!");
	}
	
	// Método para verificar velocidade
	public int verificaVelocidade () {
		return RPM;
	}
	
}
