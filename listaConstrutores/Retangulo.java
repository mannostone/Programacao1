package listaConstrutores;
// SE TEM RETORNO N�O � CONSIDERADO CONSTRUTOR!
public class Retangulo { // extends (nome da classe) quer dizer que estou "recebendo" tudo que contem na classe para esta
    
	int base, altura;
	
	// Construtores possuem o mesmo nome da classe e n�o possuem limite de cria��o, por�m precisam ter assinaturas diferentes
	 public Retangulo () { 
		 base = 5;
		 altura = 10;
	 }
	 
	// Construtor criado com par�metros (Se diferem dos Construtores anteriores)
     public Retangulo(int base, int altura) { 
    	/* o comando "this" serve para trocar o valor padronizado pelo valor especificado pelo programador/usuario 
    	(usuario = via Scanner ou JOptionPane) */
              this.base = base;
              this.altura = altura;
              
     }
     
}
