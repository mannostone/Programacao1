package jOptionPane;
// Biblioteca necess�ria para usar o JOptionPane
// Todo dado inserido via JOptionPane � um String, e necessita de convers�o...
// Cheque o Arquivo Anota��es para ver mais
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// Dados inseridos Via J Option Pane
		String x = JOptionPane.showInputDialog("Mensagem");
		String y = JOptionPane.showInputDialog("Mensagem");
		
		// Convers�o de Wrapper para primitivos
		int num1 = Integer.parseInt(x);
		int num2 = Integer.parseInt(y);
		
		// Atribui��o dos valores convertidos para a vari�vel "soma"
		int soma = num1 + num2;
		
		// Di�logo obrigat�rio para mostrar os valores informados
		JOptionPane.showMessageDialog (null, "A soma dos dois n�meros " + soma);
	}

}
