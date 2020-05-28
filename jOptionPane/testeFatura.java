package jOptionPane;
// Biblioteca necessária para a utilização do JOptionPane
import javax.swing.JOptionPane;

public class testeFatura {
	public static void main (String [] args) {
		// Criação do Objeto do tipo da Classe fatura
		fatura f = new fatura ();
		
		/* 
		 * Entrada de dados via JOptionPane.
		 * Cada linha substitui um "System.out.println" e uma entrada de dados via Scanner (java.util.Scanner)
		 *  */
		f.setDescricao (JOptionPane.showInputDialog ( "Digite a descrição do produto" ));
		f.setNumero (JOptionPane.showInputDialog ( "Digite o número/ID/Código de barras do produto" ));
		
		// Entrada e conversão de dados via JOptionPane
		// Veja o arquivo "Main" para ver apenas a conversão de Wrapper para primitivo
		f.setQuantItem (Integer.parseInt ( JOptionPane.showInputDialog ( "Digite a quantidade desse item" )));
		f.setPrecoItem (Double.parseDouble ( JOptionPane.showInputDialog ( "Digite quanto custa esse item" )));
		
		JOptionPane.showMessageDialog(null, "Fatura total do item " + f.getNumero() + " com a descrição " + f.getDescricao() + "\nR$ " + f.getTotalFatura());
	}
}
/* Escreva um aplicativo de teste chamado FaturaTeste que demonstra as capacidades da classe Fatura.

Para entrada e saída de dados, utilize o JOptionPane. */