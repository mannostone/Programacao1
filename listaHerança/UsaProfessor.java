package listaHerança;

// Exercicio 2

public class UsaProfessor {

	public static void main(String[] args) {
		
		Professor p = new Professor();
		
		System.out.println(p.calculaSalario());
		
		
		// JOptionPane.showMessageDialog(null, "Matricula: " + p.getMatr() + "\nNome: " + p.getNome() + "\nIdade: " + p.getIdade() + "\nSalario com desconto: " + p.calculaSalario());
	}

}
