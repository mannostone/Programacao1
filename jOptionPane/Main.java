package jOptionPane;
// Biblioteca necessária para usar o JOptionPane
// Todo dado inserido via JOptionPane é um String, e necessita de conversão...
// Cheque o Arquivo Anotações para ver mais
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// Dados inseridos Via J Option Pane
		String x = JOptionPane.showInputDialog("Mensagem");
		String y = JOptionPane.showInputDialog("Mensagem");
		
		// Conversão de Wrapper para primitivos
		int num1 = Integer.parseInt(x);
		int num2 = Integer.parseInt(y);
		
		// Atribuição dos valores convertidos para a variável "soma"
		int soma = num1 + num2;
		
		// Diálogo obrigatório para mostrar os valores informados
		JOptionPane.showMessageDialog (null, "A soma dos dois números " + soma);
	}

}
