package listaVetores;

public class exercicio4 {
    public static void main (String [] args) {
    	
    	// Vetor inicializado com valores
        int [] diasMes = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        for (int i = 0; i < diasMes.length; i++)  
        {
            System.out.printf("O mes %d possui %d dias.\n", i+1, diasMes[i]);
            /* Atenção! "System.out.printf" é usado principalmente para exibir números de ponto flutuante definindo limite em suas casas decimais,
            entretando, é possivel usar ele de diversar maneiras diferentes...
            
            %d - Significa que o número que será exibido no lugar de "%d" será um valor do tipo INTEIRO
            %s = Significa que o dado que será exibido no lugar de "%s" será um valor do tipo String 
			%f = Significa que o número que será exibido no lugar de "%f" será um valor de ponto flutuante. 
			Obs: A quantidade de casas decimais exibidas após a vírgula pode ser definida livremente.
			
			\n = Significa dizer que eu quero pular uma linha
			("\n" não será exibido, apenas pulará a linha, "System.out.println" faz isso automaticamente)
			
			
			Conforme escrito na linha 11, todo o "printf" será escrito sem a necessidade de fazer varias concatenações (+)!
			Sendo que o local onde o valor será exibido será substituido por uma das formas de dados descritas da linha 15-17.
			
			Após escrever a mensagem que será exibida na tela, ou seja após as " " e separado pela virgula você irá escrever o nome das variáveis
			NA ORDEM EM QUE DEVEM SER EXIBIDAS, de forma que se você porventura confundir os tipos que devem ser descritos, o programa possivelmente 
			gerará um erro no console. */
        }
        
    }
}
