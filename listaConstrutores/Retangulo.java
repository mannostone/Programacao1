package listaConstrutores;
// SE TEM RETORNO NÃO É CONSIDERADO CONSTRUTOR!
public class Retangulo { // extends (nome da classe) quer dizer que estou "recebendo" tudo que contem na classe para esta
    
	int base, altura;
	
	// Construtores possuem o mesmo nome da classe e não possuem limite de criação, porém precisam ter assinaturas diferentes
	 public Retangulo () { 
		 base = 5;
		 altura = 10;
	 }
	 
	// Construtor criado com parâmetros (Se diferem dos Construtores anteriores)
     public Retangulo(int base, int altura) { 
    	/* o comando "this" serve para trocar o valor padronizado pelo valor especificado pelo programador/usuario 
    	(usuario = via Scanner ou JOptionPane) */
              this.base = base;
              this.altura = altura;
              
     }
     
}
