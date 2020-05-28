package listaVetores;

public class exercicio3 {
    public static void main (String [] args){
        
    	// Aqui foram atribuidos 6 valores para o primeiro vetor chamado "dados1". (Inicializador de array)
        int [] dados1 = {1,4,9,16,25,36};
        
        /* Aqui foi apenas criado um vetor com 6 posições. Todas as posições possuem valor 0 como no descrito 
        no Exercicio1 */
        int [] dados2 = new int [6]; 
        
        for (int cont = 0; cont < dados1.length; cont++) 
        {
            dados2[cont] = (int) Math.sqrt(dados1[cont]); 
            /* dados2[cont] vai receber o calculo que será feio depois do sinal de atribuição, onde:
            1- dados2 é o vetor que irá receber os dados
            2- [cont] é a posição dentro do vetor
            3- "(int)" significa dizer que não queremos quaisquer números que existam depois da vírgula, 
            o interesse desse exercicio está apenas em obter o valor inteiro do cálculo
            4- "Math.sqrt" é o algoritmo que irá realizar cálculo, sendo que ele irá retornar o valor em double! 
            Por isso é necessário fazer o Cast Explicito. (Os vetores são do tipo inteiro)
            5- (dados1[cont]) nada mais é que o vetor da linha 7 e seus respectivos valores, onde cont é a 
            posição dentro do vetor conforme dito anteriormente, ele é quem será usado para ser feito o cálculo
            em "Math.sqrt" (linha 18) */
            
            System.out.println("A raiz quadrada de " + dados1[cont] + " é " + dados2[cont]);
            // Dentro desse mesmo laço for podemos exibir o valor atribuido a dados2[cont] para verificar se o programa está correto
        }
        
    }
}
