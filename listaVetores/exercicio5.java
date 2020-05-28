package listaVetores;

public class exercicio5 {
    public static void main (String [] args) {
               
        System.out.println("C�lculo da m�dia de 4 notas\n");
        calculaMedia();
    	}
    
        public static void calculaMedia() {
        	// vari�vel que ir� receber os valores da linha 17
        	double soma=0;
        
        	// vetor criado sem inicializar os valores 
        	double [] notas = new double [4];
        	
        	// vari�vel "i" declarada direto no la�o
        	for (int i=0; i < notas.length; i++)
        	{
        		// Fun��o que ir� definir aleat�riamente n�meros de ponto flutuante de 0 a 10 na posi��o "i" do vetor notas
        		notas[i] = Math.random()*10; 
        		
        		/* print que ir� exibir o valor da nota... "%.2f" significa que estou limitando	as casas decimais em 2
        		n�meros ap�s a virgula, se ".2" for retirado o programa funcionar� normalmente, por�m ir� exibir todo 
        		o valor armazenado, (comando printf explicado por alto no exerc�cio anterior */
        		System.out.printf("A nota %d vale %.2f\n", i+1, notas[i]); 
        		
        		// soma ira receber ele mesmo, inicialmente descrito em 0 + o valor armazenado na posi��o "i" do vetor notas
        		soma += notas[i]; 
        		
        		/* Aqui estou dizendo que quando o programa estiver passando pela ultima vez pelo la�o for 
            	"i+1" ser� igual ao tamanho do vetor "notas", ou seja, if (3+1 == 4) */
        		if (i+1 == notas.length) 
        		{
        			System.out.printf("A m�dia � %.2f\n", soma/notas.length); // ser� exibido o valor de soma dividido por 4, sem a necessidade de criar uma vari�vel para fazer a divis�o
        		}
        	}
    }
}