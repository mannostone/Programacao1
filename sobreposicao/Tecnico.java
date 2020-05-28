package sobreposicao;

//exercicio 1

public class Tecnico extends Assistente {
	
	private double bonusSalarial;
	
	@Override
	public void exibeDados () {
		System.out.println(getMatricula ());
		System.out.println(getNome ());
		System.out.println(getFuncao ());
		System.out.println("Bonus salárial: " + getBonusSalarial());
	}
	

	// set e get de bonus salarial
	public void setBonusSalarial (double bonusSalarial) {
		this.bonusSalarial = bonusSalarial;
	}
	public double getBonusSalarial () {
		return bonusSalarial;
	}
	
}
