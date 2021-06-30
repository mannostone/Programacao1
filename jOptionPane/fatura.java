package jOptionPane;

public class fatura {
	
	private String numero, descricao;
	private int quantItem;
	private double precoItem;
	
	// Método Construtor
	public fatura () {
		// Não desenvolvido por preguiça
	}
	
	// setters e getters
	public void setNumero (String numero) {	this.numero = numero;	}
	public String getNumero () { return numero;	}
	public void setDescricao (String descricao) {  this.descricao = descricao;	}
	public String getDescricao () {	return descricao; }
	
	// set e get de quantidade de item
	public void setQuantItem (int quantItem) {
		if (quantItem > 0)
			this.quantItem = quantItem;
		// Se o valor não for positivo, ele deve ser configurado como 0. 
		else
			this.quantItem = 0;
	}
	public int getQuantItem() {
		return quantItem;
	}
	
	// set e get de preço por unidade
	public void setPrecoItem (double precoItem) {
		if (precoItem > 0)
			this.precoItem = precoItem;
		// Se o preço por item não for positivo, ele deve ser configurado como 0.0. 
		else
			this.precoItem = 0;
	}
	public double getPrecoitem () {	return precoItem;	}
	public double getTotalFatura () {	return quantItem * precoItem;	}
}
