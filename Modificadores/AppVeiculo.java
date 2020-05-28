package Modificadores;


public class AppVeiculo {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo ();
		v1.nome = "Fiesta";	
		System.out.println(v1.nome);
		
		for (int i=0; i<5; i++)
		{
			v1.acelera();
		}
		
		v1.mostraVelocidade();

	}

}
