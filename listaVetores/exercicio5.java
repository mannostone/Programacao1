package listaVetores;

public class exercicio5 {
    public static void main (String [] args) {
               
        System.out.println("Cálculo da média de 4 notas\n");
        calculaMedia();
    	}
    
        public static void calculaMedia() {
        	// variável que irá receber os valores da linha 17
        	double soma=0;
        
        	// vetor criado sem inicializar os valores 
        	double [] notas = new double [4];
        	
        	// variável "i" declarada direto no laço
        	for (int i=0; i < notas.length; i++)
        	{
        		// Função que irá definir aleatóriamente números de ponto flutuante de 0 a 10 na posição "i" do vetor notas
        		notas[i] = Math.random()*10; 
        		
        		/* print que irá exibir o valor da nota... "%.2f" significa que estou limitando	as casas decimais em 2
        		números após a virgula, se ".2" for retirado o programa funcionará normalmente, porém irá exibir todo 
        		o valor armazenado, (comando printf explicado por alto no exercício anterior */
        		System.out.printf("A nota %d vale %.2f\n", i+1, notas[i]); 
        		
        		// soma ira receber ele mesmo, inicialmente descrito em 0 + o valor armazenado na posição "i" do vetor notas
        		soma += notas[i]; 
        		
        		/* Aqui estou dizendo que quando o programa estiver passando pela ultima vez pelo laço for 
            	"i+1" será igual ao tamanho do vetor "notas", ou seja, if (3+1 == 4) */
        		if (i+1 == notas.length) 
        		{
        			System.out.printf("A média é %.2f\n", soma/notas.length); // será exibido o valor de soma dividido por 4, sem a necessidade de criar uma variável para fazer a divisão
        		}
        	}
    }
}