package listaHerança;

// exercicio 6
import javax.swing.JOptionPane;

public class UsaProfessorPlus {
	
	public static void main (String [] args) {
		
		ProfessorPlus p = new ProfessorPlus();
		// Para ver anotações/conversões wrapper - primitivo veja -> jOptionPane>Anotacoes
		p.setMatr(JOptionPane.showInputDialog("Insira a matricula do professor"));
		p.setNome(JOptionPane.showInputDialog("Insira o nome do professor"));
		p.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do professor")));
		p.setSalarioBruto(Double.parseDouble(JOptionPane.showInputDialog("Insira o salário bruto")));
		p.setDesconto(Integer.parseInt(JOptionPane.showInputDialog("Digite o desconto")));
		// Parece confuso, eu sei...
		JOptionPane.showMessageDialog(null, "Matricula " + p.getMatr());
		JOptionPane.showMessageDialog(null, "Nome: " + p.getNome());
		JOptionPane.showMessageDialog(null, "Idade: " + p.getIdade());
		JOptionPane.showMessageDialog(null, "Salario Bruto: " + p.getSalarioBruto());
		JOptionPane.showMessageDialog(null, "Desconto: " + p.getDesconto());
		
		p.calculaSalario();
		
		
	}
}
