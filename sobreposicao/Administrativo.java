package sobreposicao;

//exercicio 1

public class Administrativo extends Assistente {
	
	private String turno;
	
	// Nota��o de Sobreescrita. N�o existe sem o conceito de Heran�a
	@Override
	public void exibeDados () { // M�todo que ir� Mostrar todos os valores informados
		
		System.out.println(getMatricula ());
		System.out.println(getNome ());
		System.out.println(getFuncao ());
		System.out.println(getAdicionalNoturno ());
		System.out.println(getTurno ());
	}
	
	// set e get de turno
	public void setTurno (String turno) {
		this.turno = turno;
	}
	public String getTurno () {
		return "O turno � " + turno;
	}
	
	public String getAdicionalNoturno () {
		return " 15% de adicional noturno.";
	}
	
}
