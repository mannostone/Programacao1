package listaHerança;

// Exercicio 4
public class NewUsaProfessor {

	public static void main(String[] args) {
			
		NewProfessor p = new NewProfessor();
		
		p.exibirProfessor();
		System.out.println("Salário com desconto: " + p.calculaSalario());
		
		
	}

}
