package listaVetores;

public class exercicio4 {
    public static void main (String [] args) {
    	
    	// Vetor inicializado com valores
        int [] diasMes = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        for (int i = 0; i < diasMes.length; i++)  
        {
            System.out.printf("O mes %d possui %d dias.\n", i+1, diasMes[i]);
            /* Aten��o! "System.out.printf" � usado principalmente para exibir n�meros de ponto flutuante definindo limite em suas casas decimais,
            entretando, � possivel usar ele de diversar maneiras diferentes...
            
            %d - Significa que o n�mero que ser� exibido no lugar de "%d" ser� um valor do tipo INTEIRO
            %s = Significa que o dado que ser� exibido no lugar de "%s" ser� um valor do tipo String 
			%f = Significa que o n�mero que ser� exibido no lugar de "%f" ser� um valor de ponto flutuante. 
			Obs: A quantidade de casas decimais exibidas ap�s a v�rgula pode ser definida livremente.
			
			\n = Significa dizer que eu quero pular uma linha
			("\n" n�o ser� exibido, apenas pular� a linha, "System.out.println" faz isso automaticamente)
			
			
			Conforme escrito na linha 11, todo o "printf" ser� escrito sem a necessidade de fazer varias concatena��es (+)!
			Sendo que o local onde o valor ser� exibido ser� substituido por uma das formas de dados descritas da linha 15-17.
			
			Ap�s escrever a mensagem que ser� exibida na tela, ou seja ap�s as " " e separado pela virgula voc� ir� escrever o nome das vari�veis
			NA ORDEM EM QUE DEVEM SER EXIBIDAS, de forma que se voc� porventura confundir os tipos que devem ser descritos, o programa possivelmente 
			gerar� um erro no console. */
        }
        
    }
}
