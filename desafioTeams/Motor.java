package desafioTeams;

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
	public void liga () {
		System.out.println("O motor est� ligado!\n");
	}
	public void desliga () {
		System.out.println("O motor est� desligado!\n");
	}
	
	// M�todo para verificar velocidade
	public int verificaVelocidade () {
		return RPM;
	}
	
}
