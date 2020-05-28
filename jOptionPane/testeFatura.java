package jOptionPane;
// Biblioteca necess�ria para a utiliza��o do JOptionPane
import javax.swing.JOptionPane;

public class testeFatura {
	public static void main (String [] args) {
		// Cria��o do Objeto do tipo da Classe fatura
		fatura f = new fatura ();
		
		/* 
		 * Entrada de dados via JOptionPane.
		 * Cada linha substitui um "System.out.println" e uma entrada de dados via Scanner (java.util.Scanner)
		 *  */
		f.setDescricao (JOptionPane.showInputDialog ( "Digite a descri��o do produto" ));
		f.setNumero (JOptionPane.showInputDialog ( "Digite o n�mero/ID/C�digo de barras do produto" ));
		
		// Entrada e convers�o de dados via JOptionPane
		// Veja o arquivo "Main" para ver apenas a convers�o de Wrapper para primitivo
		f.setQuantItem (Integer.parseInt ( JOptionPane.showInputDialog ( "Digite a quantidade desse item" )));
		f.setPrecoItem (Double.parseDouble ( JOptionPane.showInputDialog ( "Digite quanto custa esse item" )));
		
		JOptionPane.showMessageDialog(null, "Fatura total do item " + f.getNumero() + " com a descri��o " + f.getDescricao() + "\nR$ " + f.getTotalFatura());
	}
}
/* Escreva um aplicativo de teste chamado FaturaTeste que demonstra as capacidades da classe Fatura.

Para entrada e sa�da de dados, utilize o JOptionPane. */