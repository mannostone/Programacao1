package desafioTeams;

public class AppVeiculo {

	public static void main(String[] args) {
		// Objeto Criado e método construtor referenciado
		Veiculo v1 = new Veiculo ();
		// Atribuição de um dado
		v1.nome = "Fiesta";	
		System.out.println(v1.nome);
		
		for (int i=0; i<5; i++)
		{
			v1.acelera();
		}
		
		v1.mostraVelocidade();

	}

}
