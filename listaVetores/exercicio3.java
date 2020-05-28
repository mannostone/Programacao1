package listaVetores;

public class exercicio3 {
    public static void main (String [] args){
        
    	// Aqui foram atribuidos 6 valores para o primeiro vetor chamado "dados1". (Inicializador de array)
        int [] dados1 = {1,4,9,16,25,36};
        
        /* Aqui foi apenas criado um vetor com 6 posi��es. Todas as posi��es possuem valor 0 como no descrito 
        no Exercicio1 */
        int [] dados2 = new int [6]; 
        
        for (int cont = 0; cont < dados1.length; cont++) 
        {
            dados2[cont] = (int) Math.sqrt(dados1[cont]); 
            /* dados2[cont] vai receber o calculo que ser� feio depois do sinal de atribui��o, onde:
            1- dados2 � o vetor que ir� receber os dados
            2- [cont] � a posi��o dentro do vetor
            3- "(int)" significa dizer que n�o queremos quaisquer n�meros que existam depois da v�rgula, 
            o interesse desse exercicio est� apenas em obter o valor inteiro do c�lculo
            4- "Math.sqrt" � o algoritmo que ir� realizar c�lculo, sendo que ele ir� retornar o valor em double! 
            Por isso � necess�rio fazer o Cast Explicito. (Os vetores s�o do tipo inteiro)
            5- (dados1[cont]) nada mais � que o vetor da linha 7 e seus respectivos valores, onde cont � a 
            posi��o dentro do vetor conforme dito anteriormente, ele � quem ser� usado para ser feito o c�lculo
            em "Math.sqrt" (linha 18) */
            
            System.out.println("A raiz quadrada de " + dados1[cont] + " � " + dados2[cont]);
            // Dentro desse mesmo la�o for podemos exibir o valor atribuido a dados2[cont] para verificar se o programa est� correto
        }
        
    }
}
